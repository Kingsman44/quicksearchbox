package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.p046a.C0809b;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    private final Map f2757a = new HashMap();

    /* renamed from: b */
    public Random f2758b = new Random();

    /* renamed from: c */
    public final Map f2759c = new HashMap();

    /* renamed from: d */
    public final Map f2760d = new HashMap();

    /* renamed from: e */
    public ArrayList f2761e = new ArrayList();

    /* renamed from: f */
    public final transient Map f2762f = new HashMap();

    /* renamed from: g */
    public final Map f2763g = new HashMap();

    /* renamed from: h */
    public final Bundle f2764h = new Bundle();

    /* renamed from: g */
    private final void m2649g(String str) {
        if (((Integer) this.f2760d.get(str)) == null) {
            int nextInt = this.f2758b.nextInt(2147418112);
            while (true) {
                int i = nextInt + 65536;
                if (this.f2759c.containsKey(Integer.valueOf(i))) {
                    nextInt = this.f2758b.nextInt(2147418112);
                } else {
                    mo3361d(i, str);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public abstract void mo3347a(int i, C0809b bVar, Object obj);

    /* renamed from: b */
    public final C0816c mo3359b(String str, C0809b bVar, C0815b bVar2) {
        m2649g(str);
        this.f2762f.put(str, new C0819f(bVar2, bVar));
        if (this.f2763g.containsKey(str)) {
            Object obj = this.f2763g.get(str);
            this.f2763g.remove(str);
            bVar2.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f2764h.getParcelable(str);
        if (activityResult != null) {
            this.f2764h.remove(str);
            bVar2.onActivityResult(bVar.mo614b(activityResult.f2755a, activityResult.f2756b));
        }
        return new C0818e(this, str, bVar);
    }

    /* renamed from: c */
    public final C0816c mo3360c(final String str, C2391v vVar, final C0809b bVar, final C0815b bVar2) {
        C2384o lifecycle = vVar.getLifecycle();
        if (!lifecycle.mo5789a().mo5788a(C2383n.STARTED)) {
            m2649g(str);
            C0820g gVar = (C0820g) this.f2757a.get(str);
            if (gVar == null) {
                gVar = new C0820g(lifecycle);
            }
            C08061 r0 = new C2389t() {
                /* renamed from: eN */
                public final void mo416eN(C2391v vVar, C2382m mVar) {
                    if (C2382m.ON_START.equals(mVar)) {
                        ActivityResultRegistry.this.f2762f.put(str, new C0819f(bVar2, bVar));
                        if (ActivityResultRegistry.this.f2763g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f2763g.get(str);
                            ActivityResultRegistry.this.f2763g.remove(str);
                            bVar2.onActivityResult(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f2764h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f2764h.remove(str);
                            bVar2.onActivityResult(bVar.mo614b(activityResult.f2755a, activityResult.f2756b));
                        }
                    } else if (C2382m.ON_STOP.equals(mVar)) {
                        ActivityResultRegistry.this.f2762f.remove(str);
                    } else if (C2382m.ON_DESTROY.equals(mVar)) {
                        ActivityResultRegistry.this.mo3362e(str);
                    }
                }
            };
            gVar.f2782a.mo5790b(r0);
            gVar.f2783b.add(r0);
            this.f2757a.put(str, gVar);
            return new C0817d(this, str, bVar);
        }
        throw new IllegalStateException("LifecycleOwner " + vVar + " is attempting to register while current state is " + lifecycle.mo5789a() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: d */
    public final void mo3361d(int i, String str) {
        Map map = this.f2759c;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.f2760d.put(str, valueOf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3362e(String str) {
        Integer num;
        if (!this.f2761e.contains(str) && (num = (Integer) this.f2760d.remove(str)) != null) {
            this.f2759c.remove(num);
        }
        this.f2762f.remove(str);
        if (this.f2763g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2763g.get(str));
            this.f2763g.remove(str);
        }
        if (this.f2764h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f2764h.getParcelable(str));
            this.f2764h.remove(str);
        }
        C0820g gVar = (C0820g) this.f2757a.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f2783b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                gVar.f2782a.mo5791c((C2389t) arrayList.get(i));
            }
            gVar.f2783b.clear();
            this.f2757a.remove(str);
        }
    }

    /* renamed from: f */
    public final boolean mo3363f(int i, int i2, Intent intent) {
        String str = (String) this.f2759c.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0819f fVar = (C0819f) this.f2762f.get(str);
        if (fVar == null || fVar.f2780a == null || !this.f2761e.contains(str)) {
            this.f2763g.remove(str);
            this.f2764h.putParcelable(str, new ActivityResult(i2, intent));
            return true;
        }
        fVar.f2780a.onActivityResult(fVar.f2781b.mo614b(i2, intent));
        this.f2761e.remove(str);
        return true;
    }
}
