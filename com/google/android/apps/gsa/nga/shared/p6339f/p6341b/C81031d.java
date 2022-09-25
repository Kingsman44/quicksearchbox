package com.google.android.apps.gsa.nga.shared.p6339f.p6341b;

import com.google.android.apps.gsa.nga.api.C74723ca;
import com.google.android.apps.gsa.nga.api.C74724cb;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.a.bw;
import com.google.android.apps.gsa.nga.api.a.cb;
import com.google.android.apps.gsa.nga.api.p5883a.C74670ac;
import com.google.android.apps.gsa.nga.api.p5883a.C74674bv;
import com.google.android.apps.gsa.nga.api.p5883a.C74675ca;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81062c;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.b.d */
/* compiled from: PG */
public final class C81031d implements C74724cb, C74723ca {

    /* renamed from: a */
    private static final C58974d f222095a = C58974d.m91136j();

    /* renamed from: b */
    private final Set f222096b = C58758qx.m90653k();

    /* renamed from: a */
    public final void mo71098a(C74723ca caVar) {
        this.f222096b.add(caVar);
    }

    /* renamed from: b */
    public final void mo71099b(C74723ca caVar) {
        this.f222096b.remove(caVar);
    }

    /* renamed from: c */
    public final Optional mo71094c(C37672hs hsVar) {
        if (!this.f222096b.isEmpty()) {
            ((C58970a) ((C58970a) f222095a.mo56224b()).mo56372aa(5805)).mo56387q("RohanFollowOn with token %d", hsVar.f100059b);
        }
        Optional empty = Optional.empty();
        for (C74723ca c : this.f222096b) {
            try {
                Optional c2 = c.mo71094c(hsVar);
                if (c2.isPresent()) {
                    if (empty.isPresent()) {
                        ((C58970a) ((C58970a) f222095a.mo56226d()).mo56372aa(5803)).mo56387q("rohanFollowOn with token %d returned more than one RohanToken", hsVar.f100059b);
                    }
                    empty = c2;
                }
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f222095a.mo56226d()).mo56382g(e)).mo56372aa(5804)).mo56386p("Client exception on query status error");
            }
        }
        return empty;
    }

    /* renamed from: d */
    public final void mo71095d(ad adVar) {
        String str;
        if (!this.f222096b.isEmpty()) {
            C58970a aVar = (C58970a) ((C58970a) f222095a.mo56224b()).mo56372aa(5807);
            int a = C74670ac.m120737a(adVar.a);
            switch (a) {
                case 1:
                    str = "PUSH_TO_TALK_ERROR";
                    break;
                case 2:
                    str = "CLIENT_HOTWORD_RESULT";
                    break;
                case 3:
                    str = "TRANSCRIPTION_FAILURE";
                    break;
                case 4:
                    str = "MOBILE_ASSISTANT_RESULT";
                    break;
                case 5:
                    str = "WATCH_ERROR";
                    break;
                case 6:
                    str = "TEXT_QUERY_ERROR";
                    break;
                case 7:
                    str = "TYPE_NOT_SET";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (a != 0) {
                C37672hs hsVar = adVar.c;
                if (hsVar == null) {
                    hsVar = C37672hs.f100056c;
                }
                aVar.mo56354G("InvocationError %s with %s", str, C81062c.m129010a(Optional.m71637of(hsVar)));
            } else {
                throw null;
            }
        }
        for (C74723ca d : this.f222096b) {
            try {
                d.mo71095d(adVar);
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f222095a.mo56226d()).mo56382g(e)).mo56372aa(5806)).mo56386p("Client exception on query status error");
            }
        }
    }

    /* renamed from: e */
    public final void mo71096e(bw bwVar) {
        if (!this.f222096b.isEmpty()) {
            C58970a aVar = (C58970a) ((C58970a) f222095a.mo56224b()).mo56372aa(5809);
            int b = C74674bv.m120744b(bwVar.b);
            if (b == 0) {
                b = 1;
            }
            String a = C74674bv.m120743a(b);
            C37672hs hsVar = bwVar.a;
            if (hsVar == null) {
                hsVar = C37672hs.f100056c;
            }
            aVar.mo56354G("ErrorAfterAcceptingInvocation %s with %s", a, C81062c.m129010a(Optional.m71637of(hsVar)));
        }
        for (C74723ca e : this.f222096b) {
            try {
                e.mo71096e(bwVar);
            } catch (Exception e2) {
                ((C58970a) ((C58970a) ((C58970a) f222095a.mo56226d()).mo56382g(e2)).mo56372aa(5808)).mo56386p("Client exception for ErrorAfterAcceptingInvocation");
            }
        }
    }

    /* renamed from: f */
    public final void mo71097f(cb cbVar) {
        String str;
        if (!this.f222096b.isEmpty()) {
            C58970a aVar = (C58970a) ((C58970a) f222095a.mo56224b()).mo56372aa(5811);
            int a = C74675ca.m120745a(cbVar.a);
            switch (a) {
                case 1:
                    str = "HOTWORD_VERIFIED";
                    break;
                case 2:
                    str = "LISTENING";
                    break;
                case 3:
                    str = "RECOGNITION";
                    break;
                case 4:
                    str = "NO_SPEECH_DETECTED";
                    break;
                case 5:
                    str = "DEVICE_ACTION";
                    break;
                case 6:
                    str = "MEDIA_CONTROL";
                    break;
                case 7:
                    str = "AUDIO_FOCUS_LOSS";
                    break;
                case 8:
                    str = "EXECUTING";
                    break;
                case 9:
                    str = "IDLE";
                    break;
                case 10:
                    str = "PARTIAL_RECOGNITION";
                    break;
                case 11:
                    str = "GACS_EXECUTE_RESULT";
                    break;
                case 12:
                    str = "QUERY_REQUEST_ID";
                    break;
                case 13:
                    str = "QUERYSTATUSDATA_NOT_SET";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (a != 0) {
                C37672hs hsVar = cbVar.c;
                if (hsVar == null) {
                    hsVar = C37672hs.f100056c;
                }
                aVar.mo56354G("Query status update %s with %s", str, C81062c.m129010a(Optional.m71637of(hsVar)));
            } else {
                throw null;
            }
        }
        for (C74723ca f : this.f222096b) {
            try {
                f.mo71097f(cbVar);
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f222095a.mo56226d()).mo56382g(e)).mo56372aa(5810)).mo56386p("Client exception on query status update");
            }
        }
    }
}
