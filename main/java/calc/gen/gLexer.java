package calc.gen;// Generated from /Users/rubstar/IdeaProjects/untitled/g.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MUL=9, 
		DIV=10, MOD=11, ADD=12, SUB=13, INC=14, DEC=15, WHITESPACE=16, ID=17, 
		INT=18, FLOAT=19, NEWLINE=20, LOL=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "MUL", 
			"DIV", "MOD", "ADD", "SUB", "INC", "DEC", "WHITESPACE", "ID", "INT", 
			"FLOAT", "NEWLINE", "LOL", "NUMBER", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'='", "'abs('", "')'", "'ceil('", "'round('", 
			"'('", "'*'", "'/'", "'%'", "'+'", "'-'", "'++'", "'--'", null, null, 
			null, null, null, "' lol'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MUL", "DIV", "MOD", 
			"ADD", "SUB", "INC", "DEC", "WHITESPACE", "ID", "INT", "FLOAT", "NEWLINE", 
			"LOL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\6\22i\n\22\r\22\16\22j\3\23\6\23n\n\23\r\23\16\23"+
		"o\3\24\6\24s\n\24\r\24\16\24t\3\24\3\24\6\24y\n\24\r\24\16\24z\5\24}\n"+
		"\24\3\25\6\25\u0080\n\25\r\25\16\25\u0081\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\3\2\5\4\2\13"+
		"\13\"\"\4\2C\\c|\4\2\f\f\17\17\2\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\3\61\3\2\2\2\5\65\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13B"+
		"\3\2\2\2\rD\3\2\2\2\17J\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27"+
		"W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37`\3\2\2\2!c\3\2\2\2#h"+
		"\3\2\2\2%m\3\2\2\2\'r\3\2\2\2)\177\3\2\2\2+\u0083\3\2\2\2-\u0088\3\2\2"+
		"\2/\u008a\3\2\2\2\61\62\7k\2\2\62\63\7p\2\2\63\64\7v\2\2\64\4\3\2\2\2"+
		"\65\66\7h\2\2\66\67\7n\2\2\678\7q\2\289\7c\2\29:\7v\2\2:\6\3\2\2\2;<\7"+
		"?\2\2<\b\3\2\2\2=>\7c\2\2>?\7d\2\2?@\7u\2\2@A\7*\2\2A\n\3\2\2\2BC\7+\2"+
		"\2C\f\3\2\2\2DE\7e\2\2EF\7g\2\2FG\7k\2\2GH\7n\2\2HI\7*\2\2I\16\3\2\2\2"+
		"JK\7t\2\2KL\7q\2\2LM\7w\2\2MN\7p\2\2NO\7f\2\2OP\7*\2\2P\20\3\2\2\2QR\7"+
		"*\2\2R\22\3\2\2\2ST\7,\2\2T\24\3\2\2\2UV\7\61\2\2V\26\3\2\2\2WX\7\'\2"+
		"\2X\30\3\2\2\2YZ\7-\2\2Z\32\3\2\2\2[\\\7/\2\2\\\34\3\2\2\2]^\7-\2\2^_"+
		"\7-\2\2_\36\3\2\2\2`a\7/\2\2ab\7/\2\2b \3\2\2\2cd\t\2\2\2de\3\2\2\2ef"+
		"\b\21\2\2f\"\3\2\2\2gi\t\3\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k$\3\2\2\2ln\5-\27\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p&\3\2\2\2"+
		"qs\5-\27\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\5/\30\2"+
		"wy\5-\27\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|v\3\2\2\2"+
		"|}\3\2\2\2}(\3\2\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082*\3\2\2\2\u0083\u0084\7\"\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7n\2\2\u0087,\3\2\2\2\u0088"+
		"\u0089\4\62;\2\u0089.\3\2\2\2\u008a\u008b\7.\2\2\u008b\60\3\2\2\2\t\2"+
		"jotz|\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}