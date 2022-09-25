package com.google.android.apps.gsa.staticplugins.accl.performers.p7346g;

import android.os.Bundle;
import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52158hj;
import com.google.assistant.p3897e.p3921j.C52159hk;
import com.google.assistant.p3897e.p3921j.C52179id;
import com.google.assistant.p3897e.p3921j.C52186ik;
import com.google.assistant.p3897e.p3921j.C52188im;
import com.google.assistant.p3897e.p3921j.C52190io;
import com.google.assistant.p3897e.p3921j.C52194is;
import com.google.assistant.p3897e.p3921j.C52197iv;
import com.google.assistant.p3897e.p3921j.C52198iw;
import com.google.assistant.p3897e.p3921j.C52201iz;
import com.google.assistant.p3897e.p3921j.C52203ja;
import com.google.assistant.p3897e.p3921j.C52206jd;
import com.google.assistant.p3897e.p3921j.C52207je;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.g.p */
/* compiled from: PG */
public final class C93109p extends C22538o {

    /* renamed from: a */
    private final C93108o f259735a;

    public C93109p(C93108o oVar) {
        this.f259735a = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        int i;
        int a;
        RatingCompat ratingCompat;
        String str = dyVar.f135936b;
        int i2 = 1;
        if (str.equals("media.NEXT")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52159hk hkVar = (C52159hk) m41992m(dwVar, "common_media_control_args", C52159hk.f136860e.getParserForType());
            C93108o oVar = this.f259735a;
            oVar.mo87543c();
            String b = C93108o.m153188b(hkVar);
            C93107n nVar = C93107n.f259722a;
            int a2 = C52158hj.m86523a(hkVar.f136865d);
            if (a2 != 0) {
                i2 = a2;
            }
            return oVar.mo87544d("media.NEXT", b, nVar, i2);
        } else if (str.equals("media.PAUSE")) {
            C51807dw dwVar2 = dyVar.f135938d;
            if (dwVar2 == null) {
                dwVar2 = C51807dw.f135930b;
            }
            C52159hk hkVar2 = (C52159hk) m41992m(dwVar2, "common_media_control_args", C52159hk.f136860e.getParserForType());
            C93108o oVar2 = this.f259735a;
            oVar2.mo87543c();
            String b2 = C93108o.m153188b(hkVar2);
            C93097d dVar = C93097d.f259710a;
            int a3 = C52158hj.m86523a(hkVar2.f136865d);
            if (a3 != 0) {
                i2 = a3;
            }
            return oVar2.mo87544d("media.PAUSE", b2, dVar, i2);
        } else if (str.equals("media.PREVIOUS")) {
            C51807dw dwVar3 = dyVar.f135938d;
            if (dwVar3 == null) {
                dwVar3 = C51807dw.f135930b;
            }
            C52159hk hkVar3 = (C52159hk) m41992m(dwVar3, "common_media_control_args", C52159hk.f136860e.getParserForType());
            C93108o oVar3 = this.f259735a;
            oVar3.mo87543c();
            String b3 = C93108o.m153188b(hkVar3);
            C93106m mVar = C93106m.f259721a;
            int a4 = C52158hj.m86523a(hkVar3.f136865d);
            if (a4 != 0) {
                i2 = a4;
            }
            return oVar3.mo87544d("media.PREVIOUS", b3, mVar, i2);
        } else if (str.equals("media.RESUME")) {
            C51807dw dwVar4 = dyVar.f135938d;
            if (dwVar4 == null) {
                dwVar4 = C51807dw.f135930b;
            }
            C52159hk hkVar4 = (C52159hk) m41992m(dwVar4, "common_media_control_args", C52159hk.f136860e.getParserForType());
            C93108o oVar4 = this.f259735a;
            oVar4.mo87543c();
            String b4 = C93108o.m153188b(hkVar4);
            C93104k kVar = C93104k.f259719a;
            int a5 = C52158hj.m86523a(hkVar4.f136865d);
            if (a5 != 0) {
                i2 = a5;
            }
            return oVar4.mo87544d("media.RESUME", b4, kVar, i2);
        } else if (str.equals("media.SEEK_RELATIVE")) {
            C51807dw dwVar5 = dyVar.f135938d;
            if (dwVar5 == null) {
                dwVar5 = C51807dw.f135930b;
            }
            C52188im imVar = (C52188im) m41992m(dwVar5, "seek_relative_args", C52188im.f136973d.getParserForType());
            C93108o oVar5 = this.f259735a;
            if ((imVar.f136975a & 4) != 0) {
                long j = imVar.f136977c;
                C52159hk hkVar5 = imVar.f136976b;
                if (hkVar5 == null) {
                    hkVar5 = C52159hk.f136860e;
                }
                return oVar5.mo87542a("media.SEEK_RELATIVE", j, C93108o.m153188b(hkVar5));
            }
            C59104x c = C93108o.f259723a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) c).mo56372aa(13296)).mo56386p("seek_off_set_ms field is not set in SeekRelativeArgs.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No seek_offset_ms in SeekRelativeArgs"));
        } else if (str.equals("media.SEEK_TO_POSITION")) {
            C51807dw dwVar6 = dyVar.f135938d;
            if (dwVar6 == null) {
                dwVar6 = C51807dw.f135930b;
            }
            C52190io ioVar = (C52190io) m41992m(dwVar6, "seek_to_position_args", C52190io.f136978d.getParserForType());
            C93108o oVar6 = this.f259735a;
            if ((ioVar.f136980a & 4) != 0) {
                long j2 = ioVar.f136982c;
                C52159hk hkVar6 = ioVar.f136981b;
                if (hkVar6 == null) {
                    hkVar6 = C52159hk.f136860e;
                }
                return oVar6.mo87542a("media.SEEK_TO_POSITION", j2, C93108o.m153188b(hkVar6));
            }
            C59104x c2 = C93108o.f259723a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
            ((C59052c) ((C59052c) c2).mo56372aa(13297)).mo56386p("seek_off_set_ms field is not set in SeekToPositionArgs.");
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No seek_off_set_ms in SeekToPositionArgs"));
        } else {
            int i3 = 2;
            int i4 = 0;
            if (str.equals("media.SET_RATING")) {
                C51807dw dwVar7 = dyVar.f135938d;
                if (dwVar7 == null) {
                    dwVar7 = C51807dw.f135930b;
                }
                C52198iw iwVar = (C52198iw) m41992m(dwVar7, "set_rating_args", C52198iw.f136995d.getParserForType());
                C93108o oVar7 = this.f259735a;
                C93094ap apVar = (C93094ap) oVar7.f259726d.mo17428b();
                C52159hk hkVar7 = iwVar.f136998b;
                if (hkVar7 == null) {
                    hkVar7 = C52159hk.f136860e;
                }
                String b5 = C93108o.m153188b(hkVar7);
                C0320v a6 = apVar.mo87533a(b5, false);
                if (a6 == null) {
                    return C60856cj.m92900i(C93094ap.m153160c(b5));
                }
                if (C93094ap.m153166p(a6)) {
                    return C60856cj.m92900i(C93094ap.m153159b(b5, C52179id.AUTHENTICATION_EXPIRED, a6.mo1038f().f1000g));
                }
                if ((iwVar.f136997a & 4) != 0) {
                    int a7 = C52197iv.m86538a(iwVar.f136999c);
                    ratingCompat = (a7 != 0 && a7 == 2) ? ((C87594r) oVar7.f259725c.mo27525b()).mo81723b(a6) : ((C87594r) oVar7.f259725c.mo27525b()).mo81724c(a6);
                } else {
                    ratingCompat = null;
                }
                if (ratingCompat == null) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No valid rating type."));
                }
                C58976aa aaVar = C58975e.f156826a;
                return apVar.mo87538k("media.SET_RATING", new C93103j(ratingCompat), a6, false);
            } else if (str.equals("media.STOP")) {
                C51807dw dwVar8 = dyVar.f135938d;
                if (dwVar8 == null) {
                    dwVar8 = C51807dw.f135930b;
                }
                C52159hk hkVar8 = (C52159hk) m41992m(dwVar8, "common_media_control_args", C52159hk.f136860e.getParserForType());
                C93108o oVar8 = this.f259735a;
                oVar8.mo87543c();
                String b6 = C93108o.m153188b(hkVar8);
                C93098e eVar2 = C93098e.f259711a;
                int a8 = C52158hj.m86523a(hkVar8.f136865d);
                if (a8 != 0) {
                    i2 = a8;
                }
                return oVar8.mo87544d("media.STOP", b6, eVar2, i2);
            } else if (str.equals("media.REPLAY_MEDIA_ITEM")) {
                C51807dw dwVar9 = dyVar.f135938d;
                if (dwVar9 == null) {
                    dwVar9 = C51807dw.f135930b;
                }
                C52186ik ikVar = (C52186ik) m41992m(dwVar9, "replay_media_item_args", C52186ik.f136967d.getParserForType());
                C93108o oVar9 = this.f259735a;
                if ((ikVar.f136969a & 2) != 0) {
                    C52568wo woVar = ikVar.f136971c;
                    if (woVar == null) {
                        woVar = C52568wo.f137992v;
                    }
                    if ((woVar.f137994a & 512) != 0) {
                        C52159hk hkVar9 = ikVar.f136970b;
                        if (hkVar9 == null) {
                            hkVar9 = C52159hk.f136860e;
                        }
                        String b7 = C93108o.m153188b(hkVar9);
                        C52567wn b8 = C52567wn.m86649b(woVar.f138003j);
                        if (b8 == null) {
                            b8 = C52567wn.UNKNOWN;
                        }
                        if (b8.equals(C52567wn.PLAYLIST)) {
                            return oVar9.mo87544d("media.REPLAY_MEDIA_ITEM", b7, C93077a.f259628a, 1);
                        }
                        return oVar9.mo87544d("media.REPLAY_MEDIA_ITEM", b7, C93099f.f259712a, 1);
                    }
                }
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Media metadata type is not set."));
            } else if (str.equals("media.SHUFFLE")) {
                C51807dw dwVar10 = dyVar.f135938d;
                if (dwVar10 == null) {
                    dwVar10 = C51807dw.f135930b;
                }
                C52207je jeVar = (C52207je) m41992m(dwVar10, "shuffle_args", C52207je.f137009d.getParserForType());
                C93108o oVar10 = this.f259735a;
                if (!((jeVar.f137011a & 4) == 0 || (a = C52206jd.m86540a(jeVar.f137013c)) == 0 || a != 2)) {
                    i4 = 1;
                }
                C52159hk hkVar10 = jeVar.f137012b;
                if (hkVar10 == null) {
                    hkVar10 = C52159hk.f136860e;
                }
                return oVar10.mo87544d("media.SHUFFLE", C93108o.m153188b(hkVar10), new C93102i(i4), 1);
            } else if (str.equals("media.SET_REPEAT")) {
                C51807dw dwVar11 = dyVar.f135938d;
                if (dwVar11 == null) {
                    dwVar11 = C51807dw.f135930b;
                }
                C52203ja jaVar = (C52203ja) m41992m(dwVar11, "set_repeat_args", C52203ja.f137003d.getParserForType());
                C93108o oVar11 = this.f259735a;
                if ((jaVar.f137005a & 2) == 0 || (i = C52201iz.m86539a(jaVar.f137007c)) == 0) {
                    i = 1;
                }
                if (i != 3) {
                    i3 = i == 2 ? 1 : 0;
                }
                C52159hk hkVar11 = jaVar.f137006b;
                if (hkVar11 == null) {
                    hkVar11 = C52159hk.f136860e;
                }
                return oVar11.mo87544d("media.SET_REPEAT", C93108o.m153188b(hkVar11), new C93105l(i3), 1);
            } else if (str.equals("media.SET_PLAYBACK_RATE")) {
                C51807dw dwVar12 = dyVar.f135938d;
                if (dwVar12 == null) {
                    dwVar12 = C51807dw.f135930b;
                }
                C52194is isVar = (C52194is) m41992m(dwVar12, "set_playback_rate_args", C52194is.f136988e.getParserForType());
                C93108o oVar12 = this.f259735a;
                int i5 = isVar.f136990a;
                int i6 = i5 & 2;
                if (i6 == 0 && (i5 & 4) == 0) {
                    C59104x c3 = C93108o.f259723a.mo56225c();
                    c3.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                    ((C59052c) ((C59052c) c3).mo56372aa(13300)).mo56386p("Neither playback_rate field nor relative_playback_rate_field is not set in SetPlaybackRateArgs.");
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Neither playback_rate nor relative_playback_rate_field in SetPlaybackRateArgs."));
                } else if (i6 == 0 || (i5 & 4) == 0) {
                    C52159hk hkVar12 = isVar.f136991b;
                    if (hkVar12 == null) {
                        hkVar12 = C52159hk.f136860e;
                    }
                    String b9 = C93108o.m153188b(hkVar12);
                    C93094ap apVar2 = (C93094ap) oVar12.f259726d.mo17428b();
                    C0320v a9 = apVar2.mo87533a(b9, false);
                    if (a9 == null) {
                        return C60856cj.m92900i(C93094ap.m153160c(b9));
                    }
                    if (C93094ap.m153166p(a9)) {
                        return C60856cj.m92900i(C93094ap.m153159b(b9, C52179id.AUTHENTICATION_EXPIRED, a9.mo1038f().f1000g));
                    }
                    float f = (isVar.f136990a & 4) != 0 ? a9.mo1038f().f997d * ((float) isVar.f136993d) : (float) isVar.f136992c;
                    Bundle bundle = new Bundle();
                    bundle.putFloat("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed", f);
                    bundle.putBoolean("com.google.android.apps.gsa.search.core.work.audioplayer.TrimSilence", false);
                    C58976aa aaVar2 = C58975e.f156826a;
                    return apVar2.mo87538k("media.SET_PLAYBACK_RATE", new C93100g(bundle), a9, false);
                } else {
                    C59104x c4 = C93108o.f259723a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "MediaControlPerformer");
                    ((C59052c) ((C59052c) c4).mo56372aa(13299)).mo56386p("Both playback_rate field and relative_playback_rate_field are set in SetPlaybackRateArgs. Only one should be set.");
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Both playback_rate and relative_playback_rate_field in SetPlaybackRateArgs. Only one should be set."));
                }
            } else {
                throw new C22428d(dyVar);
            }
        }
    }
}
