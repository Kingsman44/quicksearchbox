package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16942e;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16978b;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16982f;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16987k;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16988l;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16990n;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16991o;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.g */
/* compiled from: PG */
final class C33373g implements C16942e {

    /* renamed from: a */
    final /* synthetic */ C33375i f89416a;

    public C33373g(C33375i iVar) {
        this.f89416a = iVar;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo23099i(C16978b bVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo23100j(C16982f fVar) {
    }

    /* renamed from: k */
    public final void mo23101k(C16988l lVar) {
        String str;
        int a = C16991o.m34084a(lVar.f49624a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        if (i != 1) {
            if (i != 4) {
                if (i == 5) {
                    this.f89416a.mo38820j(4);
                    this.f89416a.mo38818h(lVar);
                    return;
                } else if (i != 6) {
                    return;
                }
            }
            this.f89416a.mo38820j(3);
            C33375i iVar = this.f89416a;
            C16987k kVar = (C16987k) lVar.toBuilder();
            C62910ar arVar = C62948a.f169987b;
            kVar.copyOnWrite();
            arVar.getClass();
            ((C16988l) kVar.instance).f49627d = arVar;
            iVar.mo38818h((C16988l) kVar.build());
            return;
        }
        C59052c cVar = (C59052c) ((C59052c) C33375i.f89417a.mo56225c()).mo56372aa(50996);
        int a2 = C16991o.m34084a(lVar.f49624a);
        if (a2 != 0) {
            switch (a2) {
                case 2:
                    str = "STATE_UNKNOWN";
                    break;
                case 3:
                    str = "STATE_ERROR";
                    break;
                case 4:
                    str = "STATE_NONE";
                    break;
                case 5:
                    str = "STATE_BUFFERING";
                    break;
                case 6:
                    str = "STATE_PAUSED";
                    break;
                case 7:
                    str = "STATE_PLAYING";
                    break;
                case 8:
                    str = "STATE_STOPPED";
                    break;
            }
        }
        str = "UNRECOGNIZED";
        cVar.mo56389s("Playback in error state: %s", str);
    }

    /* renamed from: l */
    public final /* synthetic */ void mo23102l(C16990n nVar) {
    }
}
