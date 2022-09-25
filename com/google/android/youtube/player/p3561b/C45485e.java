package com.google.android.youtube.player.p3561b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.youtube.player.C45507c;
import com.google.android.youtube.player.C45508d;
import com.google.android.youtube.player.C45509e;
import com.google.android.youtube.player.C45510f;
import com.google.android.youtube.player.C45511g;
import java.lang.reflect.Field;

/* renamed from: com.google.android.youtube.player.b.e */
public final class C45485e {

    /* renamed from: a */
    public static final C45463av f118889a = C45463av.m81143b();

    /* renamed from: b */
    public final Fragment f118890b;

    /* renamed from: c */
    public C45463av f118891c = f118889a;

    /* renamed from: d */
    public final C45468b f118892d;

    /* renamed from: e */
    public final C45511g f118893e;

    /* renamed from: f */
    public final C45508d f118894f;

    /* renamed from: g */
    public final C45509e f118895g;

    /* renamed from: h */
    public final C45503w f118896h;

    /* renamed from: i */
    public C45487g f118897i;

    /* renamed from: j */
    public FrameLayout f118898j;

    /* renamed from: k */
    public String f118899k;

    /* renamed from: l */
    public View f118900l;

    /* renamed from: m */
    public C45465ax f118901m = C45465ax.f118878l;

    /* renamed from: n */
    public boolean f118902n;

    /* renamed from: o */
    public C45507c f118903o = C45507c.f118949b;

    /* renamed from: p */
    public C45475bg f118904p;

    /* renamed from: q */
    private final C45482bn f118905q = new C45482bn(this);

    /* renamed from: r */
    private final C45481bm f118906r = new C45481bm(this);

    public C45485e(Fragment fragment, C45468b bVar, C45511g gVar, C45508d dVar, C45509e eVar) {
        this.f118890b = fragment;
        this.f118892d = bVar;
        this.f118893e = gVar;
        this.f118894f = dVar;
        this.f118895g = eVar;
        boolean z = fragment instanceof C45470bb;
        C45484d dVar2 = new C45484d(this);
        IInterface queryLocalInterface = dVar2.queryLocalInterface("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
        this.f118896h = new C45503w(z, queryLocalInterface instanceof C45478bj ? (C45478bj) queryLocalInterface : new C45476bh(dVar2));
    }

    /* renamed from: s */
    static /* synthetic */ void m81199s(C45485e eVar, C45510f fVar) {
        C45487g gVar = eVar.f118897i;
        if (gVar != null) {
            gVar.mo49658a();
        }
        eVar.mo49652q(fVar);
    }

    /* renamed from: a */
    public final C0167am mo49636a() {
        if (this.f118890b.getActivity() != null) {
            return this.f118890b.getActivity();
        }
        if (this.f118890b.getContext() instanceof C0167am) {
            return (C0167am) this.f118890b.getContext();
        }
        return null;
    }

    /* renamed from: b */
    public final FragmentManager mo49637b() {
        C0167am a = mo49636a();
        return a != null ? a.mo545jw() : this.f118890b.getParentFragmentManager();
    }

    /* renamed from: c */
    public final View mo49638c() {
        this.f118896h.mo49667g(3);
        if (this.f118902n) {
            mo49653r();
            return this.f118898j;
        }
        throw new IllegalStateException("Fragment has not been properly attached.");
    }

    /* renamed from: d */
    public final void mo49639d() {
        this.f118896h.mo49667g(14);
        this.f118901m.mo49596f();
        this.f118902n = false;
    }

    /* renamed from: e */
    public final void mo49640e() {
        this.f118896h.mo49667g(9);
    }

    /* renamed from: f */
    public final void mo49641f() {
        this.f118896h.mo49667g(8);
    }

    /* renamed from: g */
    public final void mo49642g(Bundle bundle) {
        bundle.putString("dev_key", this.f118899k);
        C45503w wVar = this.f118896h;
        Bundle bundle2 = null;
        try {
            C45475bg bgVar = wVar.f118943j;
            if (bgVar != null) {
                Parcel ls = bgVar.mo49587ls(9, bgVar.mo49586lr());
                Bundle bundle3 = (Bundle) C45460as.m81137a(ls, Bundle.CREATOR);
                ls.recycle();
                bundle2 = bundle3;
            }
        } catch (RemoteException unused) {
            C45457ap.m81128a("Problem saving state of embed.", new Object[0]);
        }
        if (bundle2 == null) {
            bundle2 = wVar.f118934a;
        }
        bundle.putBundle("forwarding_state", bundle2);
    }

    /* renamed from: h */
    public final void mo49643h() {
        this.f118896h.mo49667g(7);
    }

    /* renamed from: i */
    public final void mo49644i() {
        this.f118896h.mo49667g(11);
    }

    /* renamed from: j */
    public final void mo49645j(Bundle bundle) {
        this.f118896h.mo49667g(6);
        mo49654t(bundle);
    }

    /* renamed from: k */
    public final void mo49646k(C45507c cVar) {
        if (cVar == null) {
            cVar = C45507c.f118949b;
        }
        this.f118903o = cVar;
    }

    /* renamed from: l */
    public final void mo49647l() {
        this.f118896h.mo49667g(5);
    }

    /* renamed from: m */
    public final void mo49648m() {
        this.f118896h.mo49667g(2);
    }

    /* renamed from: n */
    public final void mo49649n() {
        this.f118896h.mo49667g(4);
    }

    /* renamed from: o */
    public final void mo49650o() {
        if (mo49657w()) {
            this.f118902n = true;
            String str = this.f118899k;
            if (str != null) {
                mo49651p(str);
            }
            this.f118896h.mo49667g(1);
        }
    }

    /* renamed from: p */
    public final void mo49651p(String str) {
        if (this.f118904p != null || this.f118901m.mo49603m() || this.f118901m.mo49602l()) {
            return;
        }
        if (str == null || TextUtils.equals(BuildConfig.FLAVOR, str)) {
            C45457ap.m81128a("Please supply a valid developer key.", new Object[0]);
        } else if (!mo49657w()) {
            C45457ap.m81128a("No context host attached, cannot connect.", new Object[0]);
        } else {
            C45487g gVar = this.f118897i;
            if (gVar != null) {
                gVar.mo49659b();
            }
            C0167am a = mo49636a();
            a.getClass();
            String str2 = str;
            C45488h hVar = new C45488h(a, str2, a.getPackageName(), C45458aq.m81131b(a), this.f118906r, this.f118905q);
            this.f118901m = hVar;
            hVar.mo49599i();
        }
    }

    /* renamed from: q */
    public final void mo49652q(C45510f fVar) {
        C45463av avVar = this.f118891c;
        C45463av avVar2 = f118889a;
        if (avVar != avVar2) {
            this.f118891c = avVar2;
            avVar.mo49608d(fVar);
        }
    }

    /* renamed from: t */
    public final void mo49654t(Bundle bundle) {
        if (bundle != null) {
            this.f118899k = bundle.getString("dev_key");
            if ((this.f118890b instanceof C45470bb) || this.f118896h.f118937d == C45502v.f118933d) {
                Bundle bundle2 = bundle.getBundle("forwarding_state");
                C45503w wVar = this.f118896h;
                if (bundle2 != null) {
                    wVar.f118934a = bundle2;
                    wVar.mo49666e();
                    wVar.f118937d = new C45492l(wVar);
                    wVar.mo49664c();
                }
            }
            if (this.f118902n) {
                mo49651p(this.f118899k);
            }
        }
    }

    /* renamed from: u */
    public final void mo49655u() {
        this.f118896h.mo49667g(13);
        this.f118901m.mo49596f();
    }

    /* renamed from: v */
    public final void mo49656v() {
        this.f118896h.mo49667g(12);
        this.f118898j = null;
        this.f118897i = null;
    }

    /* renamed from: w */
    public final boolean mo49657w() {
        if (mo49636a() != null) {
            return true;
        }
        try {
            mo49637b();
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* renamed from: r */
    public final void mo49653r() {
        Object obj;
        C45452ak akVar;
        if (this.f118902n && mo49657w()) {
            C0167am a = mo49636a();
            a.getClass();
            if (this.f118897i == null) {
                C45487g gVar = new C45487g(a);
                this.f118897i = gVar;
                gVar.mo49659b();
            }
            C45475bg bgVar = this.f118904p;
            if (bgVar != null && this.f118900l == null) {
                C45453al alVar = null;
                try {
                    Parcel ls = bgVar.mo49587ls(1, bgVar.mo49586lr());
                    IBinder readStrongBinder = ls.readStrongBinder();
                    if (readStrongBinder == null) {
                        akVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
                        akVar = queryLocalInterface instanceof C45452ak ? (C45452ak) queryLocalInterface : new C45450ai(readStrongBinder);
                    }
                    ls.recycle();
                    alVar = akVar;
                } catch (RemoteException unused) {
                    C45457ap.m81128a("Problem getting remote controlled view.", new Object[0]);
                    this.f118900l = null;
                    this.f118897i.mo49658a();
                }
                if (alVar != null) {
                    if (alVar instanceof C45453al) {
                        obj = alVar.f118868a;
                    } else {
                        IBinder asBinder = alVar.asBinder();
                        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
                        if (declaredFields.length == 1) {
                            Field field = declaredFields[0];
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                                try {
                                    obj = field.get(asBinder);
                                } catch (NullPointerException e) {
                                    throw new IllegalArgumentException("Binder object is null.", e);
                                } catch (IllegalArgumentException e2) {
                                    throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
                                } catch (IllegalAccessException e3) {
                                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
                                }
                            } else {
                                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
                            }
                        } else {
                            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
                        }
                    }
                    this.f118900l = (View) obj;
                }
            }
            if (this.f118898j == null) {
                this.f118898j = new FrameLayout(a);
            }
            this.f118898j.removeAllViews();
            FrameLayout frameLayout = this.f118898j;
            View view = this.f118900l;
            if (view == null) {
                view = this.f118897i;
            }
            frameLayout.addView(view);
        }
    }
}
