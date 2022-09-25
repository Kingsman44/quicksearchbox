package com.google.android.libraries.search.video.conductor;

import android.view.View;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2390u;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.video.p3194d.C41500k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60901do;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class AutoplayConductorImpl implements C41478a, C41487j {

    /* renamed from: h */
    private static final C41479b f108343h = new C41479b();

    /* renamed from: a */
    final C41489l f108344a;

    /* renamed from: b */
    public final Map f108345b;

    /* renamed from: c */
    public final C2390u f108346c = new C2376g() {
        /* renamed from: gV */
        public final void mo3520gV(C2391v vVar) {
            if (C58837ba.m90859h(AutoplayConductorImpl.this.f108350g)) {
                AutoplayConductorImpl autoplayConductorImpl = AutoplayConductorImpl.this;
                autoplayConductorImpl.f108348e.mo50429i(autoplayConductorImpl.f108347d);
            }
        }

        /* renamed from: gW */
        public final /* synthetic */ void mo3521gW(C2391v vVar) {
        }

        /* renamed from: gX */
        public final void mo3522gX(C2391v vVar) {
            AutoplayConductorImpl.this.mo43999g((View) null);
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    };

    /* renamed from: d */
    public final C46440f f108347d = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Integer num = (Integer) obj;
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Void voidR = (Void) obj2;
            View view = AutoplayConductorImpl.this.f108349f;
            if (view != null && view.getTag(R.id.conductor_view_tag) == num) {
                AutoplayConductorImpl autoplayConductorImpl = AutoplayConductorImpl.this;
                C41481d dVar = (C41481d) autoplayConductorImpl.f108345b.get(autoplayConductorImpl.f108349f);
                dVar.getClass();
                dVar.mo43993a(AutoplayConductorImpl.this);
            }
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: e */
    public final C46439e f108348e;

    /* renamed from: f */
    public View f108349f;

    /* renamed from: g */
    public final String f108350g;

    /* renamed from: i */
    private final Map f108351i;

    /* renamed from: j */
    private final Set f108352j;

    /* renamed from: k */
    private final Set f108353k;

    /* renamed from: l */
    private final C60888db f108354l;

    /* renamed from: m */
    private C60870cx f108355m;

    /* renamed from: n */
    private View f108356n;

    /* renamed from: o */
    private boolean f108357o;

    public AutoplayConductorImpl(String str, C41489l lVar, C46439e eVar, C60888db dbVar) {
        this.f108344a = lVar;
        this.f108345b = new HashMap();
        this.f108351i = new HashMap();
        this.f108352j = new HashSet();
        this.f108353k = new HashSet();
        this.f108348e = eVar;
        this.f108354l = dbVar;
        this.f108350g = str;
        this.f108357o = C58837ba.m90859h(str);
    }

    /* renamed from: a */
    public final void mo43993a(C41478a aVar) {
        mo43996d(true);
    }

    /* renamed from: b */
    public final void mo43994b(C41478a aVar) {
        mo43996d(false);
    }

    /* renamed from: c */
    public final void mo43995c(View view) {
        C41500k kVar;
        if (this.f108345b.containsKey(view)) {
            if (view == this.f108349f) {
                mo43999g((View) null);
            }
            if (view == this.f108356n) {
                this.f108356n = null;
            }
            if (this.f108353k.contains(view) && (kVar = (C41500k) this.f108351i.get(view)) != null) {
                kVar.mo44024a(2);
            }
            C41489l lVar = this.f108344a;
            if (view != null) {
                view.removeOnAttachStateChangeListener(lVar.f108388e);
            }
            lVar.f108385b.remove(view);
            lVar.f108387d = true;
            lVar.mo44010b();
            lVar.mo44009a();
            this.f108345b.remove(view);
            this.f108351i.remove(view);
            this.f108352j.remove(view);
            this.f108353k.remove(view);
            if (this.f108345b.isEmpty()) {
                this.f108344a.f108384a.remove(this);
            }
        }
    }

    /* renamed from: d */
    public final void mo43996d(boolean z) {
        if (this.f108357o != z) {
            this.f108357o = z;
            if (z) {
                mo43999g(this.f108356n);
            } else {
                mo43999g((View) null);
            }
        }
    }

    /* renamed from: e */
    public final void mo43997e(View view, C41481d dVar, C41500k kVar) {
        if (view != null && dVar != null && !this.f108345b.containsKey(view)) {
            if (this.f108345b.isEmpty()) {
                this.f108344a.f108384a.add(this);
            }
            if (view.getTag(R.id.conductor_view_tag) == null) {
                C41479b bVar = f108343h;
                int i = bVar.f108369a + 1;
                bVar.f108369a = i;
                view.setTag(R.id.conductor_view_tag, Integer.valueOf(i));
            }
            this.f108345b.put(view, dVar);
            if (kVar != null) {
                this.f108351i.put(view, kVar);
            }
            this.f108352j.add(view);
            C41489l lVar = this.f108344a;
            view.addOnAttachStateChangeListener(lVar.f108388e);
            lVar.f108385b.put(view, C41488k.UNKNOWN);
            lVar.mo44010b();
            lVar.mo44009a();
        }
    }

    /* renamed from: f */
    public final void mo43998f(C41489l lVar) {
        C58495hd l = C58495hd.m89898l(lVar.f108385b);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        View view = null;
        for (View view2 : l.keySet()) {
            if (this.f108345b.containsKey(view2)) {
                C41488k kVar = C41488k.UNKNOWN;
                int ordinal = ((C41488k) l.get(view2)).ordinal();
                if (ordinal == 1) {
                    this.f108352j.add(view2);
                } else if (ordinal == 2) {
                    if (this.f108352j.contains(view2)) {
                        C41500k kVar2 = (C41500k) this.f108351i.get(view2);
                        if (kVar2 != null) {
                            kVar2.mo44024a(1);
                        }
                        this.f108352j.remove(view2);
                    }
                    this.f108353k.add(view2);
                    view2.getLocationOnScreen(iArr2);
                    int i = iArr[0];
                    int i2 = iArr2[0];
                    int i3 = i - i2;
                    int i4 = iArr[1];
                    int i5 = iArr2[1];
                    int i6 = i4 - i5;
                    if (view == null || i6 > 0 || (i6 == 0 && i3 > 0)) {
                        iArr[0] = i2;
                        iArr[1] = i5;
                        view = view2;
                    }
                } else if (ordinal != 3) {
                }
                if (this.f108353k.contains(view2)) {
                    C41500k kVar3 = (C41500k) this.f108351i.get(view2);
                    if (kVar3 != null) {
                        kVar3.mo44024a(2);
                    }
                    this.f108353k.remove(view2);
                }
            }
        }
        this.f108356n = view;
        if (this.f108357o) {
            mo43999g(view);
        }
    }

    /* renamed from: g */
    public final void mo43999g(View view) {
        View view2 = this.f108349f;
        if (view2 != view) {
            if (view2 != null && this.f108345b.containsKey(view2)) {
                ((C41481d) this.f108345b.get(this.f108349f)).mo43994b(this);
            }
            this.f108349f = view;
            if (view != null && this.f108345b.containsKey(view)) {
                View view3 = this.f108349f;
                view3.getClass();
                Integer num = (Integer) view3.getTag(R.id.conductor_view_tag);
                C60870cx cxVar = this.f108355m;
                if (cxVar != null) {
                    cxVar.cancel(false);
                }
                if (C58837ba.m90859h(this.f108350g)) {
                    C60872cz d = this.f108354l.mo29164d(C60901do.f165001a, 250, TimeUnit.MILLISECONDS);
                    this.f108355m = d;
                    this.f108348e.mo50445g(C46438d.m82810b(d), new C46436b(num), this.f108347d);
                    return;
                }
                C46440f fVar = this.f108347d;
                num.getClass();
                fVar.mo18067c(num, (Object) null);
            }
        }
    }
}
