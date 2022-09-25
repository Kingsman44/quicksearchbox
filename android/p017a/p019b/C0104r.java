package android.p017a.p019b;

import com.evernote.android.state.BuildConfig;
import java.io.Serializable;

/* renamed from: android.a.b.r */
/* compiled from: PG */
final class C0104r implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public final String f287a;

    /* renamed from: b */
    public final C0097k f288b;

    /* renamed from: c */
    public final C0101o f289c;

    /* renamed from: d */
    public final C0101o f290d;

    public C0104r(String str, C0097k kVar, C0101o oVar, C0101o oVar2) {
        this.f287a = str;
        this.f288b = kVar;
        this.f289c = oVar;
        this.f290d = oVar2;
    }

    @Deprecated
    public final int hashCode() {
        return this.f287a.hashCode() ^ this.f288b.hashCode();
    }

    public final String toString() {
        String str;
        String str2 = this.f287a;
        String obj = this.f288b.toString();
        C0101o oVar = this.f289c;
        String str3 = BuildConfig.FLAVOR;
        if (oVar == null) {
            str = str3;
        } else {
            str = " ".concat(oVar.toString());
        }
        C0101o oVar2 = this.f290d;
        if (oVar2 != null) {
            str3 = " ".concat(oVar2.toString());
        }
        return str2 + ": " + obj + str + str3;
    }
}
