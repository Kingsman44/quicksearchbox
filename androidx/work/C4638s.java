package androidx.work;

import java.util.List;

/* renamed from: androidx.work.s */
/* compiled from: PG */
public abstract class C4638s {

    /* renamed from: a */
    private static final String f14562a = C4380ad.m12561i("InputMerger");

    /* renamed from: b */
    public static C4638s m13049b(String str) {
        try {
            return (C4638s) Class.forName(str).newInstance();
        } catch (Exception e) {
            C4380ad.m12560h().mo9312d(f14562a, "Trouble instantiating + ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    /* renamed from: a */
    public abstract C4632m mo9295a(List list);
}
