package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.p3286a.C42146a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42419ap;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42430i;
import com.google.android.libraries.social.populous.storage.C42680d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57880c;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57882e;
import com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69280a;

/* renamed from: com.google.android.libraries.social.populous.e.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C42459aj implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C42463an f111374a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f111375b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f111376c;

    public /* synthetic */ C42459aj(C42463an anVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f111374a = anVar;
        this.f111375b = cxVar;
        this.f111376c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C58833ax axVar;
        C42419ap apVar;
        C42463an anVar = this.f111374a;
        C60870cx cxVar = this.f111375b;
        C60870cx cxVar2 = this.f111376c;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58833ax axVar2 = (C58833ax) C60856cj.m92909r(cxVar2);
        if (!axVar2.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            C57883f fVar = ((C42680d) axVar2.mo56107c()).f111895d;
            if (fVar == null) {
                axVar = C58836b.f156633a;
            } else {
                C58480gp e = C58485gu.m89837e();
                for (C57882e eVar : fVar.f154843c) {
                    C42430i iVar = new C42430i();
                    int a = C57880c.m88556a(eVar.f154835a);
                    if (a == 0) {
                        a = 1;
                    }
                    int i = a - 1;
                    switch (i) {
                        case 1:
                            apVar = C42419ap.TIMES_CONTACTED;
                            break;
                        case 2:
                            apVar = C42419ap.SECONDS_SINCE_LAST_TIME_CONTACTED;
                            break;
                        case 3:
                            apVar = C42419ap.IS_SECONDARY_GOOGLE_ACCOUNT;
                            break;
                        case 4:
                            apVar = C42419ap.FIELD_TIMES_USED;
                            break;
                        case 5:
                            apVar = C42419ap.FIELD_SECONDS_SINCE_LAST_TIME_USED;
                            break;
                        case 6:
                            apVar = C42419ap.IS_CONTACT_STARRED;
                            break;
                        case 7:
                            apVar = C42419ap.HAS_POSTAL_ADDRESS;
                            break;
                        case 8:
                            apVar = C42419ap.HAS_NICKNAME;
                            break;
                        case 9:
                            apVar = C42419ap.HAS_BIRTHDAY;
                            break;
                        case 10:
                            apVar = C42419ap.HAS_CUSTOM_RINGTONE;
                            break;
                        case 11:
                            apVar = C42419ap.HAS_AVATAR;
                            break;
                        case 12:
                            apVar = C42419ap.IS_SENT_TO_VOICEMAIL;
                            break;
                        case 13:
                            apVar = C42419ap.IS_PINNED;
                            break;
                        case 14:
                            apVar = C42419ap.PINNED_POSITION;
                            break;
                        case 15:
                            apVar = C42419ap.NUM_COMMUNICATION_CHANNELS;
                            break;
                        case 16:
                            apVar = C42419ap.NUM_RAW_CONTACTS;
                            break;
                        case 17:
                            apVar = C42419ap.FIELD_IS_PRIMARY;
                            break;
                        case 18:
                            apVar = C42419ap.FIELD_IS_SUPER_PRIMARY;
                            break;
                        default:
                            throw new IllegalArgumentException("No mapping for " + Integer.toString(i) + ".");
                    }
                    iVar.mo45442c(apVar);
                    iVar.mo45443d(eVar.f154836b);
                    iVar.mo45441b(eVar.f154837c);
                    e.mo55395g(iVar.mo45440a());
                }
                axVar = C58833ax.m90834k(new C42495v(System.currentTimeMillis(), anVar.f111386d.f111089a, e.mo55394f()));
            }
        }
        C58480gp e2 = C58485gu.m89837e();
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            C42405ab g = ((C42457ah) guVar.get(i2)).mo45506g(anVar.f111386d.f111089a, axVar);
            if (!C69280a.m100466c() || !anVar.f111390h.mo56113h() || !g.mo45411m()) {
                e2.mo55395g(C60856cj.m92900i(g));
            } else {
                e2.mo55395g(((C42146a) anVar.f111390h.mo56107c()).mo44845a());
            }
        }
        return C60922j.m93044g(C60856cj.m92896e(e2.mo55394f()), new C42460ak(), anVar.f111389g);
    }
}
