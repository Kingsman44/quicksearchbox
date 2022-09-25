package com.google.android.apps.gsa.nga.engine.recognition.p6123j.p6124a;

import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77737e;
import com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a.C77739g;
import com.google.android.apps.gsa.nga.shared.p6364s3.aidl.VoiceInputInfo;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81476k;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81477l;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81478m;
import com.google.android.apps.gsa.nga.shared.p6364s3.p6365a.C81479n;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.j.a.aw */
/* compiled from: PG */
public final /* synthetic */ class C77699aw implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C77701ay f214027a;

    public /* synthetic */ C77699aw(C77701ay ayVar) {
        this.f214027a = ayVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C81477l lVar;
        C77687ak akVar = this.f214027a.f214031c;
        if (akVar == null) {
            return Optional.empty();
        }
        synchronized (akVar.f213975c) {
            if (akVar.f213989q) {
                ((C58970a) ((C58970a) C77687ak.f213973a.mo56226d()).mo56372aa(4387)).mo56386p("#getVoiceInputInfo: already stopped");
                Optional empty = Optional.empty();
                return empty;
            }
            C77737e eVar = akVar.f213990r;
            if (eVar != null) {
                eVar.mo72800a();
            }
            C81476k kVar = (C81476k) C81477l.f222898e.createBuilder();
            kVar.copyOnWrite();
            ((C81477l) kVar.instance).f222902c = 10;
            int c = akVar.f213976d.mo72680c();
            kVar.copyOnWrite();
            ((C81477l) kVar.instance).f222900a = c;
            int a = akVar.f213976d.mo72678a();
            kVar.copyOnWrite();
            ((C81477l) kVar.instance).f222903d = a;
            Optional e = akVar.f213976d.mo72682e();
            if (!e.isEmpty()) {
                if (((HotwordResult) e.get()).mo84698p().mo56113h()) {
                    C81478m mVar = (C81478m) C81479n.f222904e.createBuilder();
                    C63088z A = C63088z.m96139A((byte[]) ((HotwordResult) e.get()).mo84698p().mo56107c());
                    mVar.copyOnWrite();
                    ((C81479n) mVar.instance).f222906a = A;
                    int e2 = ((HotwordResult) e.get()).mo84685e();
                    mVar.copyOnWrite();
                    ((C81479n) mVar.instance).f222907b = e2;
                    int i = ((HotwordResult) e.get()).mo84691i();
                    mVar.copyOnWrite();
                    ((C81479n) mVar.instance).f222908c = i;
                    mVar.copyOnWrite();
                    ((C81479n) mVar.instance).f222909d = 10;
                    C81479n nVar = (C81479n) mVar.build();
                    kVar.copyOnWrite();
                    nVar.getClass();
                    ((C81477l) kVar.instance).f222901b = nVar;
                    lVar = (C81477l) kVar.build();
                    akVar.f213990r = new C77737e(new C77739g(akVar.f213978f, Math.max(0, 0)));
                    Optional of = Optional.m71637of(new VoiceInputInfo(lVar, akVar.f213992t, akVar.f213990r));
                    return of;
                }
            }
            lVar = (C81477l) kVar.build();
            akVar.f213990r = new C77737e(new C77739g(akVar.f213978f, Math.max(0, 0)));
            Optional of2 = Optional.m71637of(new VoiceInputInfo(lVar, akVar.f213992t, akVar.f213990r));
            return of2;
        }
    }
}
