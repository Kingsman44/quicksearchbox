package com.google.android.apps.gsa.nga.engine.recognition.p6111d.p6112a;

import com.google.android.apps.gsa.nga.api.a.cf;
import com.google.android.apps.gsa.nga.engine.recognition.C77565ar;
import com.google.android.apps.gsa.nga.engine.recognition.C77566as;
import com.google.android.apps.gsa.nga.engine.recognition.C77885q;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77612a;
import com.google.android.apps.gsa.nga.engine.recognition.p6111d.C77616b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.d.a.b */
/* compiled from: PG */
public final class C77614b implements C77612a {

    /* renamed from: a */
    public static final C58974d f213831a = C58974d.m91136j();

    /* renamed from: b */
    public final C77616b f213832b;

    /* renamed from: c */
    public final AtomicReference f213833c = new AtomicReference();

    /* renamed from: d */
    private final C22871g f213834d;

    /* renamed from: e */
    private final C91142g f213835e;

    public C77614b(C22871g gVar, C91142g gVar2, C77616b bVar) {
        this.f213834d = gVar;
        this.f213835e = gVar2;
        this.f213832b = bVar;
    }

    /* renamed from: a */
    public final Optional mo72743a() {
        Optional ofNullable = Optional.ofNullable((HotwordDetectedEventData) this.f213833c.getAndSet((Object) null));
        if (!ofNullable.isPresent()) {
            return Optional.empty();
        }
        HotwordDetectedEventData hotwordDetectedEventData = (HotwordDetectedEventData) ofNullable.get();
        HotwordResult hotwordResult = hotwordDetectedEventData.f253053a;
        if (hotwordResult.mo84702t().mo56113h()) {
            if (!hotwordResult.mo84701s().mo56113h() || !hotwordResult.mo84702t().mo56113h()) {
                ((C58970a) ((C58970a) C77566as.f213709m.mo56226d()).mo56372aa(4269)).mo56386p("Unable to create SpeechSessionParams for Rohan Hotword");
                return Optional.empty();
            }
            C77885q x = C77566as.m124464x();
            x.f214553h = 9;
            x.f214548c = Optional.m71637of((C37672hs) hotwordResult.mo84701s().mo56107c());
            x.f214551f = Optional.m71637of((cf) hotwordResult.mo84702t().mo56107c());
            x.f214547b = Optional.m71637of(hotwordResult);
            return Optional.m71637of(x.mo72859a());
        } else if (!hotwordResult.mo84704u().mo56113h()) {
            HotwordResult hotwordResult2 = hotwordDetectedEventData.f253053a;
            C77885q x2 = C77566as.m124464x();
            x2.f214553h = 4;
            x2.f214547b = Optional.m71637of(hotwordDetectedEventData.f253053a);
            x2.mo72863e(hotwordResult2.mo84691i());
            x2.mo72864f(Optional.ofNullable(hotwordDetectedEventData.f253054b));
            x2.mo72860b(((Integer) hotwordResult2.mo84699q().mo56108d(new C77565ar(hotwordResult2))).intValue());
            x2.f214549d = Optional.m71637of(20);
            return Optional.m71637of(x2.mo72859a());
        } else if (!hotwordResult.mo84704u().mo56113h() || !hotwordResult.mo84698p().mo56113h() || !hotwordResult.mo84699q().mo56113h()) {
            ((C58970a) ((C58970a) C77566as.f213709m.mo56226d()).mo56372aa(4268)).mo56386p("Unable to create SpeechSessionParams for Bisto Hotword");
            return Optional.empty();
        } else {
            C77885q x3 = C77566as.m124464x();
            x3.f214553h = 6;
            x3.mo72863e(hotwordResult.mo84691i());
            x3.mo72860b(((Integer) hotwordResult.mo84699q().mo56107c()).intValue());
            x3.f214547b = Optional.m71637of(hotwordResult);
            return Optional.m71637of(x3.mo72859a());
        }
    }

    /* renamed from: b */
    public final void mo72744b(HotwordDetectedEventData hotwordDetectedEventData) {
        if (((HotwordDetectedEventData) this.f213833c.getAndSet(hotwordDetectedEventData)) != null) {
            ((C58970a) ((C58970a) f213831a.mo56226d()).mo56372aa(4334)).mo56386p("Stale hotword data!");
        }
        this.f213834d.mo28213m("[NGA] NgaHotwordHelper.startSafeguard", this.f213835e.mo85399d(C90126fx.f251513kI), new C77613a(this, hotwordDetectedEventData));
    }
}
