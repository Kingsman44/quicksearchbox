package com.google.android.libraries.elements.p1727f;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.litho.p325d.C6180a;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.C21233ac;
import com.google.android.libraries.elements.interfaces.DebuggerCallback;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.FaultObserver;
import com.google.android.libraries.elements.interfaces.FaultSubscription;
import com.google.android.libraries.elements.interfaces.Observer;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.Subscription;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.p5166b.C66070ad;
import com.google.protos.youtube.elements.p5166b.C66072af;
import com.google.protos.youtube.elements.p5166b.C66073ag;
import com.google.protos.youtube.elements.p5166b.C66074ah;
import com.google.protos.youtube.elements.p5166b.C66075ai;
import com.google.protos.youtube.elements.p5166b.C66076aj;
import com.google.protos.youtube.elements.p5166b.C66078al;
import com.google.protos.youtube.elements.p5166b.C66093b;
import com.google.protos.youtube.elements.p5166b.C66102g;
import com.google.protos.youtube.elements.p5166b.C66103h;
import com.google.protos.youtube.elements.p5166b.C66107l;
import com.google.protos.youtube.elements.p5166b.C66108m;
import com.google.protos.youtube.elements.p5166b.C66109n;
import com.google.protos.youtube.elements.p5166b.C66112q;
import com.google.protos.youtube.elements.p5166b.C66113r;
import com.google.protos.youtube.elements.p5166b.C66114s;
import com.google.protos.youtube.elements.p5166b.C66115t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.f.i */
/* compiled from: PG */
public final class C21160i extends DebuggerCallback implements Application.ActivityLifecycleCallbacks, C21233ac {

    /* renamed from: d */
    public static final /* synthetic */ int f59348d = 0;

    /* renamed from: a */
    public final Handler f59349a;

    /* renamed from: b */
    public final C21171t f59350b;

    /* renamed from: c */
    public final C69464a f59351c;

    /* renamed from: e */
    private final Set f59352e = new HashSet();

    /* renamed from: f */
    private final C58833ax f59353f;

    /* renamed from: g */
    private final C21159h f59354g;

    /* renamed from: h */
    private final Object f59355h = new Object();

    /* renamed from: i */
    private Subscription f59356i;

    /* renamed from: j */
    private FaultSubscription f59357j;

    /* renamed from: k */
    private final Observer f59358k = new C21156e(this);

    /* renamed from: l */
    private final FaultObserver f59359l = new C21157f(this);

    public C21160i(Context context, C69464a aVar, C58833ax axVar) {
        Application application;
        C6180a.f18234a = true;
        this.f59351c = aVar;
        this.f59350b = new C21171t();
        this.f59349a = new Handler(Looper.getMainLooper());
        this.f59353f = axVar;
        this.f59354g = new C21159h(this);
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Application) {
            application = (Application) context;
        } else if (context instanceof Activity) {
            application = ((Activity) context).getApplication();
        } else if (context instanceof Service) {
            application = ((Service) context).getApplication();
        } else {
            throw new IllegalStateException("Could not get Application from context");
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
            return;
        }
        throw new IllegalStateException("Failed to fetch Application");
    }

    /* renamed from: d */
    public static C66109n m39730d(float f, float f2, float f3, float f4) {
        if (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) {
            return null;
        }
        C66108m mVar = (C66108m) C66109n.f179771f.createBuilder();
        mVar.copyOnWrite();
        C66109n nVar = (C66109n) mVar.instance;
        nVar.f179773a |= 1;
        nVar.f179774b = f;
        mVar.copyOnWrite();
        C66109n nVar2 = (C66109n) mVar.instance;
        nVar2.f179773a |= 2;
        nVar2.f179775c = f2;
        mVar.copyOnWrite();
        C66109n nVar3 = (C66109n) mVar.instance;
        nVar3.f179773a |= 4;
        nVar3.f179776d = f3;
        mVar.copyOnWrite();
        C66109n nVar4 = (C66109n) mVar.instance;
        nVar4.f179773a |= 8;
        nVar4.f179777e = f4;
        return (C66109n) mVar.build();
    }

    /* renamed from: f */
    public static C66075ai m39731f(Snapshot snapshot, Set set) {
        C66075ai aiVar = (C66075ai) C66076aj.f179680e.createBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C66073ag agVar = (C66073ag) C66074ah.f179675d.createBuilder();
            agVar.copyOnWrite();
            C66074ah ahVar = (C66074ah) agVar.instance;
            str.getClass();
            ahVar.f179677a |= 1;
            ahVar.f179678b = str;
            byte[] findNoCopy = snapshot.findNoCopy(str);
            if (findNoCopy != null) {
                C63088z A = C63088z.m96139A(findNoCopy);
                agVar.copyOnWrite();
                C66074ah ahVar2 = (C66074ah) agVar.instance;
                ahVar2.f179677a |= 2;
                ahVar2.f179679c = A;
            }
            C66074ah ahVar3 = (C66074ah) agVar.build();
            aiVar.copyOnWrite();
            C66076aj ajVar = (C66076aj) aiVar.instance;
            ahVar3.getClass();
            C62971cq cqVar = ajVar.f179683b;
            if (!cqVar.mo58948c()) {
                ajVar.f179683b = C62942bv.mutableCopy(cqVar);
            }
            ajVar.f179683b.add(ahVar3);
        }
        return aiVar;
    }

    /* renamed from: h */
    static void m39732h(View view, C66114s sVar) {
        C66113r rVar;
        if (view == null || !view.isShown()) {
            return;
        }
        if (view instanceof LithoView) {
            LithoView lithoView = (LithoView) view;
            String h = C21168q.m39754h(lithoView);
            if (h == null) {
                rVar = null;
            } else {
                C66112q qVar = (C66112q) C66113r.f179786e.createBuilder();
                qVar.copyOnWrite();
                C66113r rVar2 = (C66113r) qVar.instance;
                rVar2.f179788a |= 1;
                rVar2.f179790c = h;
                C21168q.m39757k(lithoView, new C21152a(qVar));
                rVar = (C66113r) qVar.build();
            }
            if (rVar != null) {
                sVar.copyOnWrite();
                C66115t tVar = (C66115t) sVar.instance;
                C66115t tVar2 = C66115t.f179793d;
                C62971cq cqVar = tVar.f179796b;
                if (!cqVar.mo58948c()) {
                    tVar.f179796b = C62942bv.mutableCopy(cqVar);
                }
                tVar.f179796b.add(rVar);
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m39732h(viewGroup.getChildAt(i), sVar);
            }
        }
    }

    /* renamed from: i */
    private final Set m39733i() {
        HashSet hashSet = new HashSet();
        for (Activity window : this.f59352e) {
            View peekDecorView = window.getWindow().peekDecorView();
            if (peekDecorView.hasWindowFocus()) {
                hashSet.add(peekDecorView);
            }
        }
        hashSet.addAll(C21168q.m39755i());
        return hashSet;
    }

    /* renamed from: j */
    private final void m39734j() {
        synchronized (this.f59355h) {
            Subscription subscription = this.f59356i;
            if (subscription != null) {
                subscription.cancel();
            }
            FaultSubscription faultSubscription = this.f59357j;
            if (faultSubscription != null) {
                faultSubscription.cancel();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo26164a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo26165b() {
        return this.f59354g.f59345a.get();
    }

    /* renamed from: c */
    public final LithoView mo26175c(String str) {
        for (View b : m39733i()) {
            LithoView b2 = C21168q.m39748b(b, str);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public final void configureLiveUpdating(byte[] bArr) {
        try {
            C62921ba baVar = C62921ba.f169869a;
            m39734j();
            if (((C66107l) C62942bv.parseFrom((C62942bv) C66107l.f179767b, bArr, baVar)).f179769a) {
                if (this.f59353f.mo56113h()) {
                    synchronized (this.f59355h) {
                        this.f59356i = ((ByteStore) this.f59353f.mo56107c()).subscribe((String) null, this.f59358k);
                        this.f59357j = ((ByteStore) this.f59353f.mo56107c()).subscribeToFaults(this.f59359l);
                    }
                }
                C21159h hVar = this.f59354g;
                if (!hVar.f59345a.getAndSet(true)) {
                    hVar.f59347c.f59349a.post(new C21158g(hVar));
                    return;
                }
                return;
            }
            this.f59354g.mo26174a();
        } catch (C62974ct e) {
            Log.w("ElementsDebugger", "Failed to parse ConfigureLiveUpdating message", e);
        }
    }

    public final void connected() {
    }

    public final void deleteStoreEntry(byte[] bArr) {
        if (this.f59353f.mo56113h()) {
            try {
                ((ByteStore) this.f59353f.mo56107c()).set(((C66072af) C62942bv.parseFrom((C62942bv) C66072af.f179671b, bArr, C62921ba.f169869a)).f179673a, (byte[]) null);
            } catch (C62974ct e) {
                Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e);
            }
        }
    }

    public final void disconnected() {
        m39734j();
        this.f59354g.mo26174a();
    }

    /* renamed from: e */
    public final C66115t mo26180e() {
        Set<View> i = m39733i();
        Set set = this.f59352e;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!set.isEmpty()) {
            ((Activity) set.iterator().next()).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else if (!i.isEmpty()) {
            ((View) i.iterator().next()).getDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        if (displayMetrics == null) {
            Log.w("ElementsDebugger", "Could not get DisplayMetrics");
            return null;
        }
        C66114s sVar = (C66114s) C66115t.f179793d.createBuilder();
        C66102g gVar = (C66102g) C66103h.f179752f.createBuilder();
        gVar.copyOnWrite();
        C66103h hVar = (C66103h) gVar.instance;
        hVar.f179754a |= 1;
        hVar.f179755b = 0.0f;
        gVar.copyOnWrite();
        C66103h hVar2 = (C66103h) gVar.instance;
        hVar2.f179754a |= 2;
        hVar2.f179756c = 0.0f;
        int i2 = displayMetrics.widthPixels;
        gVar.copyOnWrite();
        C66103h hVar3 = (C66103h) gVar.instance;
        hVar3.f179754a |= 4;
        hVar3.f179757d = (float) i2;
        int i3 = displayMetrics.heightPixels;
        gVar.copyOnWrite();
        C66103h hVar4 = (C66103h) gVar.instance;
        hVar4.f179754a |= 8;
        hVar4.f179758e = (float) i3;
        C66103h hVar5 = (C66103h) gVar.build();
        sVar.copyOnWrite();
        C66115t tVar = (C66115t) sVar.instance;
        hVar5.getClass();
        tVar.f179797c = hVar5;
        tVar.f179795a |= 1;
        for (View h : i) {
            m39732h(h, sVar);
        }
        return (C66115t) sVar.build();
    }

    /* renamed from: g */
    public final void mo26181g(C66076aj ajVar) {
        ((DebuggerClient) this.f59351c.mo17428b()).sendStoreSnapshot(ajVar.toByteArray());
    }

    public final void getStoreSnapshot() {
        Snapshot snapshot;
        if (this.f59353f.mo56113h() && (snapshot = ((ByteStore) this.f59353f.mo56107c()).snapshot()) != null) {
            mo26181g((C66076aj) m39731f(snapshot, snapshot.keys()).build());
        }
    }

    public final void highlightElements(byte[] bArr) {
        try {
            this.f59349a.post(new C21153b(this, (C66070ad) C62942bv.parseFrom((C62942bv) C66070ad.f179668b, bArr, C62921ba.f169869a)));
        } catch (C62974ct e) {
            Log.w("ElementsDebugger", "Failed to parse PutSelectedElements message", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f59352e.remove(activity);
    }

    public final void onActivityResumed(Activity activity) {
        this.f59352e.add(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void traverseViewHierarchy() {
        this.f59349a.post(new C21154c(this));
    }

    public final void updateComponentModel(byte[] bArr) {
        try {
            this.f59349a.post(new C21155d(this, (C66093b) C62942bv.parseFrom((C62942bv) C66093b.f179724c, bArr, C62921ba.f169869a)));
        } catch (C62974ct e) {
            Log.w("ElementsDebugger", "Failed to parse UpdateComponentModel message", e);
        }
    }

    public final void updateStoreEntry(byte[] bArr) {
        if (this.f59353f.mo56113h()) {
            try {
                C66078al alVar = (C66078al) C62942bv.parseFrom((C62942bv) C66078al.f179686c, bArr, C62921ba.f169869a);
                ByteStore byteStore = (ByteStore) this.f59353f.mo56107c();
                String str = alVar.f179688a;
                C63070h hVar = alVar.f179689b;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                byteStore.set(str, hVar.f170218b.mo59174N());
            } catch (C62974ct e) {
                Log.w("ElementsDebugger", "Failed to parse UpdateStoreEntry message", e);
            }
        }
    }
}
