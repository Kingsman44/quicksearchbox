package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.List;

/* renamed from: androidx.media3.common.ak */
/* compiled from: PG */
public class C2584ak {

    /* renamed from: a */
    public final Uri f7131a;

    /* renamed from: b */
    public final String f7132b = null;

    /* renamed from: c */
    public final C2581ah f7133c = null;

    /* renamed from: d */
    public final C2575ab f7134d = null;

    /* renamed from: e */
    public final List f7135e;

    /* renamed from: f */
    public final String f7136f;

    /* renamed from: g */
    public final C58485gu f7137g;

    /* renamed from: h */
    public final Object f7138h;

    public C2584ak(Uri uri, List list, C58485gu guVar, Object obj) {
        this.f7131a = uri;
        this.f7135e = list;
        this.f7136f = null;
        this.f7137g = guVar;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < guVar.size(); i++) {
            e.mo55395g(new C2587an(new C2588ao((C2589ap) guVar.get(i))));
        }
        e.mo55394f();
        this.f7138h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2584ak)) {
            return false;
        }
        C2584ak akVar = (C2584ak) obj;
        if (this.f7131a.equals(akVar.f7131a)) {
            String str = akVar.f7132b;
            if (C2612ak.m6951aa((Object) null, (Object) null)) {
                C2581ah ahVar = akVar.f7133c;
                if (C2612ak.m6951aa((Object) null, (Object) null)) {
                    C2575ab abVar = akVar.f7134d;
                    if (C2612ak.m6951aa((Object) null, (Object) null) && this.f7135e.equals(akVar.f7135e)) {
                        String str2 = akVar.f7136f;
                        return C2612ak.m6951aa((Object) null, (Object) null) && C58597ky.m90218i(this.f7137g, akVar.f7137g) && C2612ak.m6951aa(this.f7138h, akVar.f7138h);
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f7131a.hashCode() * 923521) + this.f7135e.hashCode()) * 961) + this.f7137g.hashCode()) * 31;
        Object obj = this.f7138h;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return hashCode + i;
    }
}
