package androidx.savedstate;

import android.os.Bundle;
import androidx.p054b.p055a.p057b.C0894h;
import java.util.Iterator;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.savedstate.d */
/* compiled from: PG */
public final class C4088d {

    /* renamed from: a */
    public final C0894h f13076a = new C0894h();

    /* renamed from: b */
    public boolean f13077b;

    /* renamed from: c */
    public Bundle f13078c;

    /* renamed from: d */
    public boolean f13079d;

    /* renamed from: e */
    public boolean f13080e = true;

    /* renamed from: f */
    private C4085a f13081f;

    /* renamed from: a */
    public final Bundle mo8584a(String str) {
        C69664n.m101061g(str, "key");
        if (this.f13079d) {
            Bundle bundle = this.f13078c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f13078c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f13078c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f13078c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* renamed from: b */
    public final void mo8585b(String str, C4087c cVar) {
        C69664n.m101061g(str, "key");
        C69664n.m101061g(cVar, "provider");
        if (((C4087c) this.f13076a.mo3515e(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: c */
    public final void mo8586c(Class cls) {
        if (this.f13080e) {
            C4085a aVar = this.f13081f;
            if (aVar == null) {
                aVar = new C4085a(this);
            }
            this.f13081f = aVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C4085a aVar2 = this.f13081f;
                if (aVar2 != null) {
                    String name = cls.getName();
                    C69664n.m101060f(name, "clazz.name");
                    C69664n.m101061g(name, "className");
                    aVar2.f13075a.add(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: d */
    public final C4087c mo8587d() {
        Iterator it = this.f13076a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C69664n.m101060f(entry, "components");
            C4087c cVar = (C4087c) entry.getValue();
            if (C69664n.m101066l((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return cVar;
            }
        }
        return null;
    }
}
