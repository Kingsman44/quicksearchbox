package com.google.android.apps.search.googleapp.stampviewer.webview.p10512i;

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

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.i.c */
/* compiled from: PG */
public final class C139630c extends C139628a implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139631d f379559a;

    /* renamed from: c */
    private Context f379560c;

    /* renamed from: d */
    private final C2393x f379561d = new C2393x(this);

    /* renamed from: e */
    private boolean f379562e;

    @Deprecated
    public C139630c() {
        C19559g.m37304c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo115112b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379560c == null) {
            this.f379560c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379560c;
    }

    /* renamed from: f */
    public final C139631d mo17754z() {
        C139631d dVar = this.f379559a;
        if (dVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379562e) {
            return dVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
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
        return this.f379561d;
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
            C139629b.m227000a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[Catch:{ all -> 0x0132, all -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd A[Catch:{ all -> 0x0132, all -> 0x0137 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3 A[Catch:{ all -> 0x0132, all -> 0x0137 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51119t(r6, r7, r8)     // Catch:{ all -> 0x0132 }
            com.google.android.apps.search.googleapp.stampviewer.webview.i.d r8 = r5.mo17754z()     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.b r0 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r0 = r0.f151150i     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0014
            com.google.bv.b.a.a.a.n r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x0014:
            int r0 = r0.f151179a     // Catch:{ all -> 0x0132 }
            r1 = 1
            r0 = r0 & r1
            java.lang.String r2 = "Cannot display empty text in URL bar."
            r3 = 0
            if (r0 == 0) goto L_0x00d4
            com.google.bv.b.a.a.a.b r0 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r0 = r0.f151150i     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0025
            com.google.bv.b.a.a.a.n r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x0025:
            com.google.bp.e.a.b r0 = r0.f151180b     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x002b
            com.google.bp.e.a.b r0 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x002b:
            int r4 = r0.f149691a     // Catch:{ all -> 0x0132 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x00d4
            java.lang.String r0 = r0.f149693c     // Catch:{ all -> 0x0132 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x003b
            goto L_0x00d4
        L_0x003b:
            r0 = 2131625426(0x7f0e05d2, float:1.887806E38)
            android.view.View r6 = r6.inflate(r0, r7, r3)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.ab r7 = r8.f379565c     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.af r7 = r7.f76990a     // Catch:{ all -> 0x0132 }
            r0 = 139268(0x22004, float:1.95156E-40)
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r0)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.c r7 = r7.mo33805a(r0)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.ab r0 = r8.f379565c     // Catch:{ all -> 0x0132 }
            r0.mo33801b(r6, r7)     // Catch:{ all -> 0x0132 }
            r7 = 2131431997(0x7f0b123d, float:1.848574E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ all -> 0x0132 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.b r0 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r0 = r0.f151150i     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0068
            com.google.bv.b.a.a.a.n r4 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
            goto L_0x0069
        L_0x0068:
            r4 = r0
        L_0x0069:
            int r4 = r4.f151179a     // Catch:{ all -> 0x0132 }
            r4 = r4 & r1
            if (r4 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x0073
            com.google.bv.b.a.a.a.n r4 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
            goto L_0x0074
        L_0x0073:
            r4 = r0
        L_0x0074:
            com.google.bp.e.a.b r4 = r4.f151180b     // Catch:{ all -> 0x0132 }
            if (r4 != 0) goto L_0x007a
            com.google.bp.e.a.b r4 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x007a:
            int r4 = r4.f149691a     // Catch:{ all -> 0x0132 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x008d
            if (r0 != 0) goto L_0x0084
            com.google.bv.b.a.a.a.n r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x0084:
            com.google.bp.e.a.b r0 = r0.f151180b     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x008a
            com.google.bp.e.a.b r0 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x008a:
            java.lang.String r0 = r0.f149693c     // Catch:{ all -> 0x0132 }
            goto L_0x008f
        L_0x008d:
            java.lang.String r0 = ""
        L_0x008f:
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x0132 }
            r4 = r4 ^ r1
            com.google.common.base.C58838bb.m90869d(r4, r2)     // Catch:{ all -> 0x0132 }
            r7.setText(r0)     // Catch:{ all -> 0x0132 }
            r7 = 2131431998(0x7f0b123e, float:1.8485741E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ all -> 0x0132 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = r8.mo115115a()     // Catch:{ all -> 0x0132 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0132 }
            r2 = r2 ^ r1
            java.lang.String r4 = "Cannot display empty domain in URL bar."
            com.google.common.base.C58838bb.m90869d(r2, r4)     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.b r2 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r2 = r2.f151150i     // Catch:{ all -> 0x0132 }
            if (r2 != 0) goto L_0x00b9
            com.google.bv.b.a.a.a.n r2 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x00b9:
            com.google.bp.e.a.b r2 = r2.f151180b     // Catch:{ all -> 0x0132 }
            if (r2 != 0) goto L_0x00bf
            com.google.bp.e.a.b r2 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x00bf:
            boolean r2 = r2.f149695e     // Catch:{ all -> 0x0132 }
            if (r2 == 0) goto L_0x00d0
            android.support.v4.app.Fragment r8 = r8.f379564b     // Catch:{ all -> 0x0132 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0132 }
            r1[r3] = r0     // Catch:{ all -> 0x0132 }
            r0 = 2132087793(0x7f1513f1, float:1.9815851E38)
            java.lang.String r0 = r8.getString(r0, r1)     // Catch:{ all -> 0x0132 }
        L_0x00d0:
            r7.setText(r0)     // Catch:{ all -> 0x0132 }
            goto L_0x012e
        L_0x00d4:
            r0 = 2131625425(0x7f0e05d1, float:1.8878058E38)
            android.view.View r6 = r6.inflate(r0, r7, r3)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.ab r7 = r8.f379565c     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.af r7 = r7.f76990a     // Catch:{ all -> 0x0132 }
            r0 = 139267(0x22003, float:1.95155E-40)
            com.google.android.libraries.logging.ve.h r0 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r0)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.c r7 = r7.mo33805a(r0)     // Catch:{ all -> 0x0132 }
            com.google.android.libraries.logging.ve.ab r0 = r8.f379565c     // Catch:{ all -> 0x0132 }
            r0.mo33801b(r6, r7)     // Catch:{ all -> 0x0132 }
            r7 = 2131431995(0x7f0b123b, float:1.8485735E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ all -> 0x0132 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.b r0 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r0 = r0.f151150i     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0100
            com.google.bv.b.a.a.a.n r0 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x0100:
            com.google.bp.e.a.b r0 = r0.f151180b     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x0106
            com.google.bp.e.a.b r0 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x0106:
            java.lang.String r0 = r0.f149692b     // Catch:{ all -> 0x0132 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0132 }
            if (r0 != 0) goto L_0x011f
            com.google.bv.b.a.a.a.b r8 = r8.f379563a     // Catch:{ all -> 0x0132 }
            com.google.bv.b.a.a.a.n r8 = r8.f151150i     // Catch:{ all -> 0x0132 }
            if (r8 != 0) goto L_0x0116
            com.google.bv.b.a.a.a.n r8 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0132 }
        L_0x0116:
            com.google.bp.e.a.b r8 = r8.f151180b     // Catch:{ all -> 0x0132 }
            if (r8 != 0) goto L_0x011c
            com.google.bp.e.a.b r8 = com.google.p4242bp.p4253e.p4254a.C56182b.f149689f     // Catch:{ all -> 0x0132 }
        L_0x011c:
            java.lang.String r8 = r8.f149692b     // Catch:{ all -> 0x0132 }
            goto L_0x0123
        L_0x011f:
            java.lang.String r8 = r8.mo115115a()     // Catch:{ all -> 0x0132 }
        L_0x0123:
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0132 }
            r0 = r0 ^ r1
            com.google.common.base.C58838bb.m90869d(r0, r2)     // Catch:{ all -> 0x0132 }
            r7.setText(r8)     // Catch:{ all -> 0x0132 }
        L_0x012e:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r6
        L_0x0132:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r7 = move-exception
            com.google.android.apps.search.googleapp.stampviewer.webview.p10512i.C139629b.m227000a(r6, r7)
        L_0x013b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.stampviewer.webview.p10512i.C139630c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379562e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139629b.m227000a(th, th);
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
            C139629b.m227000a(th, th);
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
            if (!this.f379562e) {
                super.onAttach(context);
                if (this.f379559a == null) {
                    this.f379559a = ((C139632e) mo115111a().mo17653jN()).mo115116ea();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379561d));
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
                C139629b.m227000a(th, th2);
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
