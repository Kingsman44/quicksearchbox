package com.google.android.apps.search.googleapp.discover.streamui.p10233i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.i.b */
/* compiled from: PG */
public final class C134769b extends C134773f implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C134770c f366959a;

    /* renamed from: c */
    private Context f366960c;

    /* renamed from: d */
    private final C2393x f366961d = new C2393x(this);

    /* renamed from: e */
    private boolean f366962e;

    @Deprecated
    public C134769b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134770c mo17754z() {
        C134770c cVar = this.f366959a;
        if (cVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f366962e) {
            return cVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo111992b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f366960c == null) {
            this.f366960c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f366960c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f366961d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134768a.m218604a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            com.google.apps.tiktok.tracing.ab r0 = r3.f122869b
            r0.mo51381i()
            r3.mo51119t(r4, r5, r6)     // Catch:{ all -> 0x007c }
            com.google.android.apps.search.googleapp.discover.streamui.i.c r6 = r3.mo17754z()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "parent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)     // Catch:{ all -> 0x007c }
            r0 = 2131625259(0x7f0e052b, float:1.887772E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)     // Catch:{ all -> 0x007c }
            com.google.android.libraries.logging.ve.ab r5 = r6.f366965c     // Catch:{ all -> 0x007c }
            com.google.android.libraries.logging.ve.af r0 = r6.f366964b     // Catch:{ all -> 0x007c }
            r1 = 123151(0x1e10f, float:1.72571E-40)
            com.google.android.libraries.logging.ve.h r1 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r1)     // Catch:{ all -> 0x007c }
            com.google.android.libraries.logging.ve.c r0 = r0.mo33805a(r1)     // Catch:{ all -> 0x007c }
            r5.mo33801b(r4, r0)     // Catch:{ all -> 0x007c }
            r5 = 2131431499(0x7f0b104b, float:1.8484729E38)
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            p5462h.p5473f.p5475b.C69664n.m101059e(r5, r0)     // Catch:{ all -> 0x007c }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ all -> 0x007c }
            com.google.bv.e.b.b.d.t r0 = r6.f366963a     // Catch:{ all -> 0x007c }
            int r0 = r0.f152744a     // Catch:{ all -> 0x007c }
            java.lang.String r1 = ""
            r2 = 3
            if (r0 != r2) goto L_0x005c
            r0 = 2132152489(0x7f1610a9, float:1.994707E38)
            r5.setTextAppearance(r0)     // Catch:{ all -> 0x007c }
            com.google.bv.e.b.b.d.t r6 = r6.f366963a     // Catch:{ all -> 0x007c }
            int r0 = r6.f152744a     // Catch:{ all -> 0x007c }
            if (r0 != r2) goto L_0x0058
            java.lang.Object r6 = r6.f152745b     // Catch:{ all -> 0x007c }
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007c }
        L_0x0058:
            r5.setText(r1)     // Catch:{ all -> 0x007c }
            goto L_0x0073
        L_0x005c:
            r2 = 2
            if (r0 != r2) goto L_0x0073
            r0 = 2132152487(0x7f1610a7, float:1.9947066E38)
            r5.setTextAppearance(r0)     // Catch:{ all -> 0x007c }
            com.google.bv.e.b.b.d.t r6 = r6.f366963a     // Catch:{ all -> 0x007c }
            int r0 = r6.f152744a     // Catch:{ all -> 0x007c }
            if (r0 != r2) goto L_0x0070
            java.lang.Object r6 = r6.f152745b     // Catch:{ all -> 0x007c }
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x007c }
        L_0x0070:
            r5.setText(r1)     // Catch:{ all -> 0x007c }
        L_0x0073:
            java.lang.String r5 = "root"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x007c }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r4
        L_0x007c:
            r4 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r5 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134768a.m218604a(r4, r5)
        L_0x0085:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134769b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f366962e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134768a.m218604a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C134768a.m218604a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f366962e) {
                super.onAttach(context);
                if (this.f366959a == null) {
                    this.f366959a = ((C134771d) mo111995d().mo17653jN()).mo111993bW();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f366961d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C134768a.m218604a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
