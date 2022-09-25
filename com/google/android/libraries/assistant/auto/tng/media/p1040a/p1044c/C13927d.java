package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1044c;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15471a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.p1104b.C15474b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52558we;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;
import p5535j.p5536a.p5543b.C70963j;
import p5535j.p5536a.p5543b.C70965l;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.c.d */
/* compiled from: PG */
final class C13927d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C37252a f42399a;

    /* renamed from: b */
    final /* synthetic */ C13928e f42400b;

    public C13927d(C13928e eVar, C37252a aVar) {
        this.f42400b = eVar;
        this.f42399a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C13928e.f42401a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(45181)).mo56386p("getAutoAppFlowEventMetadata failed");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        int i;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C15471a aVar = (C15471a) C15474b.f46404j.createBuilder();
            C13931h hVar = (C13931h) optional.get();
            C70963j jVar = (C70963j) C70965l.f189217f.createBuilder();
            String str = null;
            if (!(hVar.mo21360a() == null || hVar.mo21360a().mo1039g() == null)) {
                str = hVar.mo21360a().mo1039g();
            }
            int i2 = 0;
            if (hVar.mo21360a() != null && hVar.mo21360a().mo1038f() != null) {
                switch (hVar.mo21360a().mo1038f().f994a) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    default:
                        i = 1;
                        break;
                }
            } else {
                i = 0;
            }
            C52179id b = hVar.mo21361b();
            if (b != null) {
                i2 = C52558we.m86647a(b.f136953B);
            }
            String c = hVar.mo21362c();
            if (!TextUtils.isEmpty(str)) {
                jVar.copyOnWrite();
                C70965l lVar = (C70965l) jVar.instance;
                str.getClass();
                lVar.f189219a = 1 | lVar.f189219a;
                lVar.f189220b = str;
            }
            if (i != 0) {
                jVar.copyOnWrite();
                C70965l lVar2 = (C70965l) jVar.instance;
                lVar2.f189221c = i - 1;
                lVar2.f189219a |= 2;
            }
            if (i2 != 0) {
                jVar.copyOnWrite();
                C70965l lVar3 = (C70965l) jVar.instance;
                lVar3.f189222d = i2 - 1;
                lVar3.f189219a |= 4;
            }
            if (!TextUtils.isEmpty(c)) {
                jVar.copyOnWrite();
                C70965l lVar4 = (C70965l) jVar.instance;
                c.getClass();
                lVar4.f189219a |= 8;
                lVar4.f189223e = c;
            }
            C70965l lVar5 = (C70965l) jVar.build();
            aVar.copyOnWrite();
            C15474b bVar = (C15474b) aVar.instance;
            lVar5.getClass();
            bVar.f46414i = lVar5;
            bVar.f46406a |= 32;
            C59104x b2 = C13928e.f42401a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
            ((C59052c) ((C59052c) b2).mo56372aa(45182)).mo56386p("about to call appFlowLogger#log");
            this.f42400b.f42402b.mo22353c(this.f42399a, Optional.m71637of((C15474b) aVar.build()));
            C59104x b3 = C13928e.f42401a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AAMediaAppFlowLogger");
            ((C59052c) ((C59052c) b3).mo56372aa(45183)).mo56386p("called appFlowLogger#log");
        }
    }
}
