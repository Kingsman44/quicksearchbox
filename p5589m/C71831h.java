package p5589m;

import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.h */
/* compiled from: PG */
public final class C71831h {
    /* renamed from: a */
    public static final C71832i m105170a(String str) {
        C69664n.m101061g(str, "<this>");
        C71832i iVar = new C71832i(C71823aa.m105126b(str));
        iVar.f191360d = str;
        return iVar;
    }

    /* renamed from: b */
    public static final C71832i m105171b(byte... bArr) {
        C69664n.m101061g(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C69664n.m101060f(copyOf, "copyOf(this, size)");
        return new C71832i(copyOf);
    }
}
