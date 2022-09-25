package androidx.navigation;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.C2370br;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.ai */
/* compiled from: PG */
public final class C3810ai extends C2358bf {

    /* renamed from: a */
    public static final C2363bk f12313a = new C3808ag();

    /* renamed from: b */
    public final Map f12314b = new LinkedHashMap();

    /* renamed from: a */
    public final void mo8065a(String str) {
        C69664n.m101061g(str, "backStackEntryId");
        C2370br brVar = (C2370br) this.f12314b.remove(str);
        if (brVar != null) {
            brVar.mo5774c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        for (C2370br c : this.f12314b.values()) {
            c.mo5774c();
        }
        this.f12314b.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f12314b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
