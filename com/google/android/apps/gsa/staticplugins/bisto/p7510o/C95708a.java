package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.p10712d.C142359ck;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60235li;
import com.google.common.p4552o.C60236lj;
import com.google.common.p4552o.C60270mk;
import com.google.common.p4552o.C60271ml;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4552o.C60303np;
import com.google.common.p4552o.C60305nr;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.a */
/* compiled from: PG */
public final class C95708a {

    /* renamed from: a */
    private static final C59071e f267960a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.a");

    /* renamed from: b */
    private static final C58528ij f267961b = C58528ij.m90015O(C142359ck.PERFORM_VOICE_INPUT, C142359ck.CANCEL_VOICE_INPUT, C142359ck.FETCH_ANNOUNCEMENTS, C142359ck.EXPAND_ANNOUNCEMENT, C142359ck.TAKE_ACTION_ON_ANNOUNCEMENT, C142359ck.SKIP_CURRENT_ANNOUNCEMENT, C142359ck.STOP_ANNOUNCEMENTS, C142359ck.START_ENDPOINTING_VOICE_INPUT, C142359ck.END_ENDPOINTING_VOICE_INPUT, C142359ck.MIC_MUTE, C142359ck.MIC_UNMUTE);

    /* renamed from: c */
    private final C89656k f267962c;

    /* renamed from: d */
    private final C68214a f267963d;

    public C95708a(C89656k kVar, C68214a aVar) {
        this.f267962c = kVar;
        this.f267963d = aVar;
    }

    /* renamed from: a */
    public static String m158482a(int i) {
        switch (i) {
            case 0:
                return "PLAYING_ANNOUNCEMENT";
            case 1:
                return "PLAYING_MUSIC";
            case 2:
                return "QUIET";
            case 3:
                return "IN_GSA_DIALOG";
            case 4:
                return "IN_ALARM";
            case 5:
                return "MUSIC_OR_QUIET";
            case 6:
                return "TRANSCRIPTION";
            default:
                return "SDK";
        }
    }

    /* renamed from: b */
    public final void mo89667b(List list, C142359ck ckVar, int i) {
        if (ckVar == null) {
            C59104x b = f267960a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ActionLog");
            ((C59052c) ((C59052c) b).mo56372aa(15139)).mo56387q("No handled action, context: %d", i);
            return;
        }
        C59071e eVar = f267960a;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "ActionLog");
        ((C59052c) ((C59052c) b2).mo56372aa(15138)).mo56352E("Handled: %s context: %d", ckVar, i);
        boolean contains = f267961b.contains(ckVar);
        if (this.f267962c.mo83558m() || contains) {
            C60303np npVar = (C60303np) C60305nr.f163179e.createBuilder();
            int i2 = 3;
            if (i != 0) {
                if (i == 1) {
                    i2 = 2;
                } else if (i == 2) {
                    i2 = 5;
                } else if (i != 3) {
                    i2 = 7;
                    if (i != 4) {
                        if (i == 6) {
                            i2 = 8;
                        } else if (i != 7) {
                            C59104x d = eVar.mo56226d();
                            d.mo56378ag(C58975e.f156826a, "ActionLog");
                            ((C59052c) ((C59052c) d).mo56372aa(15137)).mo56387q("Unknown Audio context received. [audioContext=%d]", i);
                            i2 = 1;
                        } else {
                            i2 = 9;
                        }
                    }
                } else {
                    i2 = 6;
                }
            }
            npVar.copyOnWrite();
            C60305nr nrVar = (C60305nr) npVar.instance;
            nrVar.f163182b = i2 - 1;
            nrVar.f163181a |= 1;
            C60305nr nrVar2 = (C60305nr) npVar.build();
            C60235li liVar = (C60235li) C60236lj.f162969c.createBuilder();
            liVar.copyOnWrite();
            C60236lj ljVar = (C60236lj) liVar.instance;
            C62961ch chVar = ljVar.f162971a;
            if (!chVar.mo58948c()) {
                ljVar.f162971a = C62942bv.mutableCopy(chVar);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ljVar.f162971a.mo58916g(((C142359ck) it.next()).f386301H);
            }
            liVar.copyOnWrite();
            C60236lj ljVar2 = (C60236lj) liVar.instance;
            C62961ch chVar2 = ljVar2.f162972b;
            if (!chVar2.mo58948c()) {
                ljVar2.f162972b = C62942bv.mutableCopy(chVar2);
            }
            ljVar2.f162972b.mo58916g(ckVar.f386301H);
            C60236lj ljVar3 = (C60236lj) liVar.build();
            C60270mk mkVar = (C60270mk) C60271ml.f163063c.createBuilder();
            mkVar.copyOnWrite();
            C60271ml mlVar = (C60271ml) mkVar.instance;
            nrVar2.getClass();
            mlVar.f163066b = nrVar2;
            mlVar.f163065a |= 4;
            C60271ml mlVar2 = (C60271ml) mkVar.build();
            C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            mlVar2.getClass();
            nmVar.f163155i = mlVar2;
            nmVar.f163147a |= C89885b.S3REQUEST_VALUE;
            nkVar.copyOnWrite();
            C60300nm nmVar2 = (C60300nm) nkVar.instance;
            ljVar3.getClass();
            nmVar2.f163162p = ljVar3;
            nmVar2.f163147a |= 67108864;
            ((C95307m) this.f267963d.mo27525b()).mo83545c(nkVar);
        }
    }
}
