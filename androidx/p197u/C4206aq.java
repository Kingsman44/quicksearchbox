package androidx.p197u;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.u.aq */
/* compiled from: PG */
public final class C4206aq {

    /* renamed from: a */
    public final Map f13625a = new HashMap();

    /* renamed from: b */
    public View f13626b;

    /* renamed from: c */
    final ArrayList f13627c = new ArrayList();

    @Deprecated
    public C4206aq() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4206aq)) {
            return false;
        }
        C4206aq aqVar = (C4206aq) obj;
        return this.f13626b == aqVar.f13626b && this.f13625a.equals(aqVar.f13625a);
    }

    public final int hashCode() {
        return (this.f13626b.hashCode() * 31) + this.f13625a.hashCode();
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f13626b + "\n").concat("    values:");
        for (String str : this.f13625a.keySet()) {
            concat = concat + "    " + str + ": " + this.f13625a.get(str) + "\n";
        }
        return concat;
    }

    public C4206aq(View view) {
        this.f13626b = view;
    }
}
