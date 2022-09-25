package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import androidx.lifecycle.LiveData;
import androidx.slice.C4110i;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import androidx.slice.widget.C4141as;
import androidx.slice.widget.C4147c;
import androidx.slice.widget.SliceView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.List;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.gp */
/* compiled from: PG */
final class C112898gp implements C2333ah, C4141as {

    /* renamed from: a */
    public SliceView f312901a;

    /* renamed from: b */
    public C113415ez f312902b;

    /* renamed from: c */
    public C113408es f312903c;

    /* renamed from: d */
    public LiveData f312904d;

    /* renamed from: e */
    public Map f312905e;

    /* renamed from: f */
    public final Context f312906f;

    /* renamed from: g */
    public final C2391v f312907g;

    /* renamed from: h */
    private final C22871g f312908h;

    /* renamed from: i */
    private final C86124t f312909i;

    /* renamed from: j */
    private final C112794ct f312910j;

    /* renamed from: k */
    private final C112694be f312911k;

    /* renamed from: l */
    private final boolean f312912l;

    /* renamed from: m */
    private final List f312913m;

    public C112898gp(Context context, C2391v vVar, C22871g gVar, C86124t tVar, C112794ct ctVar, C112694be beVar, boolean z, List list) {
        this.f312906f = context;
        this.f312907g = vVar;
        this.f312908h = gVar;
        this.f312909i = tVar;
        this.f312910j = ctVar;
        this.f312911k = beVar;
        this.f312912l = z;
        this.f312913m = list;
    }

    /* renamed from: b */
    public final void mo8726b(C4147c cVar, SliceItem sliceItem) {
        C113408es esVar;
        List list;
        SliceView sliceView = this.f312901a;
        if (sliceView != null) {
            this.f312911k.mo99654e(sliceView);
        }
        C113415ez ezVar = this.f312902b;
        if (ezVar != null && (esVar = this.f312903c) != null && (list = this.f312913m) != null) {
            this.f312910j.mo99739a(true != this.f312912l ? 12 : 24, ezVar, esVar, Optional.m71637of(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo99777c(LiveData liveData) {
        this.f312904d = liveData;
        liveData.mo5704e(this.f312907g, this);
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        String string;
        Slice slice = (Slice) obj;
        if (slice != null) {
            if (!this.f312909i.mo79746e(C90063do.f249353bt) || (string = new C4110i(this.f312906f, slice).f13139e.getString("assistantSliceRedirectionUri")) == null) {
                SliceView sliceView = this.f312901a;
                if (sliceView != null) {
                    sliceView.mo8671f(slice);
                    return;
                }
                return;
            }
            Map map = this.f312905e;
            map.getClass();
            map.remove(Uri.parse(slice.f13090f).toString());
            this.f312908h.mo28212l("slice redirection", new C112897go(this, string));
        }
    }
}
