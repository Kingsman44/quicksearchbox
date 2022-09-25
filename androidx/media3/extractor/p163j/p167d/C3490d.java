package androidx.media3.extractor.p163j.p167d;

import androidx.media3.common.p136b.C2612ak;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.d.d */
/* compiled from: PG */
final class C3490d {

    /* renamed from: a */
    public static final Pattern f10865a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b */
    public static final Pattern f10866b = Pattern.compile(C2612ak.m6928K("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: c */
    public static final Pattern f10867c = Pattern.compile(C2612ak.m6928K("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

    /* renamed from: d */
    public static final Pattern f10868d = Pattern.compile("\\\\an(\\d+)");
}
