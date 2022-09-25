package com.google.android.libraries.web.postmessage.internal;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import java.util.Map;
import org.json.JSONObject;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class PostMessageMixinImpl implements C43952c {

    /* renamed from: a */
    private final Fragment f114435a;

    /* renamed from: b */
    private final C43775a f114436b;

    /* renamed from: c */
    private C43966m f114437c;

    /* renamed from: d */
    private boolean f114438d = false;

    public PostMessageMixinImpl(Fragment fragment, C43775a aVar) {
        this.f114435a = fragment;
        this.f114436b = aVar;
    }

    /* renamed from: d */
    private final void m77601d() {
        if (!this.f114438d) {
            this.f114435a.getLifecycle().mo5790b(new C2376g() {
                /* renamed from: gV */
                public final /* synthetic */ void mo3520gV(C2391v vVar) {
                }

                /* renamed from: gW */
                public final void mo3521gW(C2391v vVar) {
                    PostMessageMixinImpl.this.mo46951b().f114460f.clear();
                }

                /* renamed from: gX */
                public final /* synthetic */ void mo3522gX(C2391v vVar) {
                }

                /* renamed from: gY */
                public final /* synthetic */ void mo3523gY(C2391v vVar) {
                }

                /* renamed from: gZ */
                public final void mo3524gZ(C2391v vVar) {
                    C43966m b = PostMessageMixinImpl.this.mo46951b();
                    for (Integer intValue : b.f114458d.keySet()) {
                        int intValue2 = intValue.intValue();
                        C58838bb.m90885t(b.f114460f.containsKey(Integer.valueOf(intValue2)), "MessageListeners must be unconditionally registered at Fragment#onCreateView. Listener with ID %s is not registered.", intValue2);
                    }
                    C43966m b2 = PostMessageMixinImpl.this.mo46951b();
                    b2.f114461g = true;
                    if (b2.mo46959b() != null) {
                        Collection.EL.stream(b2.f114459e).forEach(new C43962i(b2));
                        b2.f114459e.clear();
                    }
                }

                /* renamed from: ha */
                public final void mo3525ha(C2391v vVar) {
                    PostMessageMixinImpl.this.mo46951b().f114461g = false;
                }
            });
            this.f114438d = true;
        }
    }

    /* renamed from: a */
    public final Optional mo46950a() {
        C19559g.m37304c();
        Fragment fragment = this.f114435a;
        boolean z = false;
        if (fragment.isAdded() && !fragment.isStateSaved()) {
            z = true;
        }
        C58838bb.m90883r(z);
        m77601d();
        return Optional.ofNullable(mo46951b().mo46959b());
    }

    /* renamed from: b */
    public final C43966m mo46951b() {
        C43966m mVar = this.f114437c;
        if (mVar != null) {
            return mVar;
        }
        C43961h hVar = (C43961h) new WebModelProvider(this.f114435a).mo47072a(C43961h.class);
        C43775a aVar = this.f114436b;
        C43966m mVar2 = (C43966m) hVar.f114447b.get(aVar);
        if (mVar2 == null) {
            mVar2 = new C43966m(aVar, hVar.f114446a);
            hVar.f114447b.put(aVar, mVar2);
        }
        this.f114437c = mVar2;
        return mVar2;
    }

    /* renamed from: c */
    public final void mo46952c(int i, C58839bc bcVar, C43951b bVar, boolean z, JSONObject jSONObject) {
        C19559g.m37304c();
        C58838bb.m90884s(!this.f114435a.getLifecycle().mo5789a().mo5788a(C2383n.STARTED), "PostMessage listeners must be registered at Fragment#onCreateView.");
        m77601d();
        C43966m b = mo46951b();
        Map map = b.f114458d;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, new C43964k(bcVar, z, jSONObject));
        b.f114460f.put(valueOf, bVar);
    }
}
