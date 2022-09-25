package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.C90702n;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91891o;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.android.youtube.player.YouTubeEmbedSupportFragment;
import com.google.android.youtube.player.p3560a.C45439a;
import com.google.android.youtube.player.p3561b.C45463av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.t */
/* compiled from: PG */
public final class C105019t implements C91891o {

    /* renamed from: a */
    protected final Context f292623a;

    /* renamed from: b */
    private final C58833ax f292624b;

    /* renamed from: c */
    private final C58881cr f292625c;

    /* renamed from: d */
    private final AtomicInteger f292626d = new AtomicInteger();

    /* renamed from: e */
    private final Map f292627e;

    public C105019t(Context context, C58881cr crVar, C58833ax axVar) {
        this.f292623a = context;
        this.f292624b = axVar;
        this.f292625c = crVar;
        this.f292627e = new ConcurrentHashMap();
    }

    /* renamed from: h */
    private static FragmentManager m174182h(C58833ax axVar) {
        if (!axVar.mo56113h() || ((C90702n) axVar.mo56107c()).mo76782b()) {
            return null;
        }
        return ((C90702n) axVar.mo56107c()).mo76781a();
    }

    /* renamed from: i */
    private final void m174183i(YouTubeEmbedSupportFragment youTubeEmbedSupportFragment) {
        FragmentManager h = m174182h(this.f292624b);
        if (h != null && h.f634a.mo677i().contains(youTubeEmbedSupportFragment)) {
            C0154a aVar = new C0154a(h);
            aVar.mo516m(youTubeEmbedSupportFragment);
            aVar.mo505b(true);
        }
    }

    /* renamed from: a */
    public final View mo86448a(String str) {
        if (str == null || this.f292627e.get(str) == null) {
            return null;
        }
        return ((C105018s) this.f292627e.get(str)).mo94460a();
    }

    /* renamed from: b */
    public final Optional mo86449b(String str) {
        if (str == null || this.f292627e.get(str) == null) {
            return Optional.empty();
        }
        return Optional.m71637of(((C105018s) this.f292627e.get(str)).mo94462c());
    }

    /* renamed from: c */
    public final String mo86450c(C45439a aVar) {
        C105018s sVar;
        String str;
        if (((CardRenderingContext) this.f292625c.mo6453a()).mo49322q()) {
            if (this.f292627e.isEmpty()) {
                str = null;
            } else {
                str = (String) ((Map.Entry) this.f292627e.entrySet().iterator().next()).getKey();
                C105018s sVar2 = (C105018s) this.f292627e.get(str);
                sVar2.mo94466f().mo49611g(sVar2.mo94463d());
                sVar2.mo94466f().mo49607c(aVar, C105016q.f292622a);
            }
            if (str != null) {
                return str;
            }
        }
        FragmentManager h = m174182h(this.f292624b);
        if (h == null) {
            sVar = null;
        } else {
            YouTubeEmbedSupportFragment youTubeEmbedSupportFragment = new YouTubeEmbedSupportFragment();
            C45463av n = youTubeEmbedSupportFragment.mo49583n();
            n.mo49607c(aVar, C105016q.f292622a);
            StringBuilder sb = new StringBuilder("yt-fragment-");
            AtomicInteger atomicInteger = this.f292626d;
            sb.append(atomicInteger);
            this.f292626d.incrementAndGet();
            String concat = "yt-fragment-".concat(atomicInteger.toString());
            if (!((CardRenderingContext) this.f292625c.mo6453a()).mo49322q()) {
                C0154a aVar2 = new C0154a(h);
                aVar2.mo685r(youTubeEmbedSupportFragment, concat);
                aVar2.mo505b(true);
            }
            C105002c cVar = new C105002c();
            cVar.f292551b = youTubeEmbedSupportFragment;
            if (n != null) {
                cVar.f292553d = n;
                if (aVar != null) {
                    cVar.f292550a = aVar;
                    cVar.f292552c = concat;
                    sVar = cVar.mo94458a();
                } else {
                    throw new NullPointerException("Null youTubeInitializationResultListener");
                }
            } else {
                throw new NullPointerException("Null youTubeInitializationResult");
            }
        }
        if (sVar == null) {
            return null;
        }
        String e = sVar.mo94464e();
        this.f292627e.put(e, sVar);
        return e;
    }

    /* renamed from: d */
    public final void mo86451d() {
        FragmentManager h = m174182h(this.f292624b);
        if (h != null) {
            h.mo467ah();
        }
    }

    /* renamed from: e */
    public final void mo86452e() {
        for (String str : this.f292627e.keySet()) {
            mo86454g(str);
            if (this.f292627e.get(str) != null) {
                m174183i(((C105018s) this.f292627e.get(str)).mo94462c());
            }
        }
        this.f292627e.clear();
    }

    /* renamed from: f */
    public final void mo86453f(String str) {
        FragmentManager h;
        C105018s sVar;
        if (str != null && (h = m174182h(this.f292624b)) != null && (sVar = (C105018s) this.f292627e.get(str)) != null) {
            if (!(sVar.mo94462c() == null || sVar.mo94462c().getView() == null)) {
                m174183i(sVar.mo94462c());
                mo86451d();
            }
            FrameLayout frameLayout = new FrameLayout(this.f292623a);
            frameLayout.setAlpha(1.0f);
            frameLayout.setId(View.generateViewId());
            C0154a aVar = new C0154a(h);
            aVar.mo511h(frameLayout.getId(), sVar.mo94462c(), str, 1);
            aVar.mo505b(true);
            C105017r b = sVar.mo94461b();
            b.mo94459b(frameLayout);
            this.f292627e.put(str, b.mo94458a());
        }
    }

    /* renamed from: g */
    public final void mo86454g(String str) {
        if (str != null && !this.f292627e.isEmpty() && this.f292627e.get(str) != null) {
            C105018s sVar = (C105018s) this.f292627e.get(str);
            sVar.mo94466f().mo49611g(sVar.mo94463d());
            if (!((CardRenderingContext) this.f292625c.mo6453a()).mo49322q()) {
                m174183i(sVar.mo94462c());
                this.f292627e.remove(str);
            }
        }
    }
}
