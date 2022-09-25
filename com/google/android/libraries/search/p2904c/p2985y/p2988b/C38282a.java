package com.google.android.libraries.search.p2904c.p2985y.p2988b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2904c.C37338ac;
import com.google.android.libraries.search.p2904c.C37341af;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.android.libraries.search.p2904c.C37354as;
import com.google.android.libraries.search.p2904c.C37359ax;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37412bq;
import com.google.android.libraries.search.p2904c.C37416bu;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37464cm;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37469cr;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37494da;
import com.google.android.libraries.search.p2904c.C37496dc;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37567eh;
import com.google.android.libraries.search.p2904c.C37569ej;
import com.google.android.libraries.search.p2904c.C37570ek;
import com.google.android.libraries.search.p2904c.C37572em;
import com.google.android.libraries.search.p2904c.C37574eo;
import com.google.android.libraries.search.p2904c.C37576eq;
import com.google.android.libraries.search.p2904c.C37589fa;
import com.google.android.libraries.search.p2904c.C37591fc;
import com.google.android.libraries.search.p2904c.C37592fd;
import com.google.android.libraries.search.p2904c.C37594ff;
import com.google.android.libraries.search.p2904c.C37595fg;
import com.google.android.libraries.search.p2904c.C37597fi;
import com.google.android.libraries.search.p2904c.C37598fj;
import com.google.android.libraries.search.p2904c.C37600fl;
import com.google.android.libraries.search.p2904c.C37604fp;
import com.google.android.libraries.search.p2904c.C37606fr;
import com.google.android.libraries.search.p2904c.C37608ft;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p2904c.C37664hk;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37668ho;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.android.libraries.search.p2904c.p2933j.C37772b;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.format.DateTimeFormatter;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.y.b.a */
/* compiled from: PG */
public final class C38282a {
    /* renamed from: b */
    public static String m67595b(C37360ay ayVar) {
        StringBuilder sb = new StringBuilder("AudioLibInputParams: [");
        if ((ayVar.f99226a & 1) != 0) {
            sb.append(" sourceType: ");
            sb.append(ayVar.f99227b);
        }
        if ((ayVar.f99226a & 2) != 0) {
            sb.append(" sampleRateHz: ");
            sb.append(ayVar.f99228c);
        }
        if ((ayVar.f99226a & 4) != 0) {
            sb.append(" channelConfig: ");
            sb.append(ayVar.f99229d);
        }
        if ((ayVar.f99226a & 8) != 0) {
            sb.append(" encodingFormat: ");
            sb.append(ayVar.f99230e);
        }
        if ((ayVar.f99226a & 32) != 0) {
            sb.append("  audioEffects: [");
            C37354as asVar = ayVar.f99232g;
            if (asVar == null) {
                asVar = C37354as.f99211d;
            }
            if ((asVar.f99213a & 1) != 0) {
                sb.append("  noiseSuppressionEnabled: ");
                C37354as asVar2 = ayVar.f99232g;
                if (asVar2 == null) {
                    asVar2 = C37354as.f99211d;
                }
                sb.append(asVar2.f99214b);
            }
            C37354as asVar3 = ayVar.f99232g;
            if (asVar3 == null) {
                asVar3 = C37354as.f99211d;
            }
            if ((asVar3.f99213a & 2) != 0) {
                sb.append("  acousticEchoCancellationEnabled: ");
                C37354as asVar4 = ayVar.f99232g;
                if (asVar4 == null) {
                    asVar4 = C37354as.f99211d;
                }
                sb.append(asVar4.f99215c);
            }
            sb.append("]");
        }
        if ((ayVar.f99226a & 16) != 0) {
            sb.append(" customAudioBufferLengthInSec: ");
            sb.append(ayVar.f99231f);
        }
        if ((ayVar.f99226a & 128) != 0) {
            sb.append(" customAudioResourceTimeoutMs: ");
            sb.append(ayVar.f99234i);
        }
        if ((ayVar.f99226a & 512) != 0) {
            sb.append(" usePushMechanism: ");
            sb.append(ayVar.f99236k);
        }
        if ((ayVar.f99226a & 256) != 0) {
            sb.append(" timestampPollingMs: ");
            C37359ax axVar = ayVar.f99235j;
            if (axVar == null) {
                axVar = C37359ax.f99220b;
            }
            sb.append(axVar.f99222a);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    private static String m67596c(C37410bo boVar) {
        C37655hb hbVar;
        C37655hb hbVar2;
        StringBuilder sb = new StringBuilder("AudioRequestMicInputParams: [AudioInputMode: ");
        int i = boVar.f99333b;
        boolean z = false;
        int i2 = 5;
        if (i != 0) {
            i2 = i != 3 ? i != 5 ? i != 10 ? i != 13 ? 0 : 1 : 4 : 3 : 2;
        }
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 0) {
                sb.append("uri");
            } else if (i3 == 1) {
                sb.append("handoff_data: [handoff_id: ");
                if (boVar.f99333b == 3) {
                    hbVar = (C37655hb) boVar.f99334c;
                } else {
                    hbVar = C37655hb.f100025d;
                }
                sb.append(hbVar.f100028b);
                sb.append(", handoff_offset: ");
                if (boVar.f99333b == 3) {
                    hbVar2 = (C37655hb) boVar.f99334c;
                } else {
                    hbVar2 = C37655hb.f100025d;
                }
                sb.append(hbVar2.f100029c);
                sb.append("]");
            } else if (i3 == 2) {
                sb.append("file_path");
            } else if (i3 == 3) {
                sb.append("enable_zero_latency_mic: ");
                if (boVar.f99333b == 10) {
                    z = ((Boolean) boVar.f99334c).booleanValue();
                }
                sb.append(z);
            } else if (i3 == 4) {
                sb.append("built-in mic");
            }
            if ((boVar.f99332a & 1) != 0) {
                sb.append(", ");
                C37360ay ayVar = boVar.f99337f;
                if (ayVar == null) {
                    ayVar = C37360ay.f99224l;
                }
                sb.append(m67595b(ayVar));
            }
            if ((boVar.f99332a & 32) != 0) {
                sb.append(" enableEmulatedMicrophone: ");
                sb.append(boVar.f99338g);
            }
            if ((boVar.f99332a & 64) != 0) {
                sb.append(" micForTalkBack: ");
                sb.append(boVar.f99339h);
            }
            if ((boVar.f99332a & 128) != 0) {
                sb.append(" fastFailIfOpNotAllowed: ");
                sb.append(boVar.f99340i);
            }
            if ((boVar.f99332a & 1024) != 0) {
                sb.append(" fastFailIfMicOccupied: ");
                sb.append(boVar.f99341j);
            }
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }

    /* renamed from: a */
    public static String m67594a(C37570ek ekVar) {
        String str;
        C37592fd fdVar;
        String str2;
        C37407bl blVar;
        C37410bo boVar;
        C37662hi hiVar;
        C37668ho hoVar;
        C37346ak akVar;
        C37462ck ckVar;
        String str3;
        C37494da daVar;
        C37469cr crVar;
        C37496dc dcVar;
        C37496dc dcVar2;
        C37502di diVar;
        C37598fj fjVar;
        String str4;
        C37416bu buVar;
        C37519dz dzVar;
        C37563ed edVar;
        C37418bw bwVar;
        String str5;
        C37418bw bwVar2;
        C37512ds dsVar;
        C37516dw dwVar;
        C37338ac acVar;
        C37348am amVar;
        C37572em emVar;
        C37464cm cmVar;
        C37460ci ciVar;
        C37664hk hkVar;
        String str6;
        C37519dz dzVar2;
        C37666hm hmVar;
        String str7;
        C37666hm hmVar2;
        C37512ds dsVar2;
        C37604fp fpVar;
        C37464cm cmVar2;
        C37460ci ciVar2;
        C37595fg fgVar;
        C37574eo eoVar;
        C37606fr frVar;
        C37567eh ehVar;
        Object obj;
        C37570ek ekVar2 = ekVar;
        int i = ekVar2.f99839b;
        int a = C37569ej.m66575a(i);
        int i2 = a - 1;
        if (a != 0) {
            if (i2 != 0) {
                str = BuildConfig.FLAVOR;
                if (i2 == 1) {
                    if (i == 3) {
                        fjVar = (C37598fj) ekVar2.f99840c;
                    } else {
                        fjVar = C37598fj.f99912h;
                    }
                    int i3 = fjVar.f99915b;
                    int a2 = C37597fi.m66587a(i3);
                    int i4 = a2 - 1;
                    if (a2 != 0) {
                        switch (i4) {
                            case 0:
                                if (i3 == 1) {
                                    buVar = (C37416bu) fjVar.f99916c;
                                } else {
                                    buVar = C37416bu.f99347c;
                                }
                                C37561eb ebVar = buVar.f99350b;
                                if (ebVar == null) {
                                    ebVar = C37561eb.f99800c;
                                }
                                if (ebVar.f99802a != 1) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[2];
                                    if (ebVar.f99802a == 2) {
                                        dzVar = C37519dz.m66524a(((Integer) ebVar.f99803b).intValue());
                                        if (dzVar == null) {
                                            dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                                        }
                                    } else {
                                        dzVar = C37519dz.UNKNOWN_OPENING_FAILURE;
                                    }
                                    objArr[0] = dzVar.name();
                                    objArr[1] = Long.valueOf(fjVar.f99917d);
                                    str = String.format(locale, "StartListeningResult failure: %s, sessionToken: %d", objArr);
                                    break;
                                } else {
                                    Locale locale2 = Locale.US;
                                    Object[] objArr2 = new Object[2];
                                    if (ebVar.f99802a == 1) {
                                        edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
                                        if (edVar == null) {
                                            edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                                        }
                                    } else {
                                        edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
                                    }
                                    objArr2[0] = edVar.name();
                                    objArr2[1] = Long.valueOf(fjVar.f99917d);
                                    str = String.format(locale2, "StartListeningResult success: %s, sessionToken: %d", objArr2);
                                    break;
                                }
                            case 1:
                                if (i3 == 2) {
                                    bwVar = (C37418bw) fjVar.f99916c;
                                } else {
                                    bwVar = C37418bw.f99351d;
                                }
                                C37514du duVar = bwVar.f99354b;
                                if (duVar == null) {
                                    duVar = C37514du.f99629c;
                                }
                                Locale locale3 = Locale.US;
                                Object[] objArr3 = new Object[3];
                                if (duVar.f99631a == 1) {
                                    Locale locale4 = Locale.US;
                                    Object[] objArr4 = new Object[1];
                                    if (duVar.f99631a == 1) {
                                        dwVar = C37516dw.m66521a(((Integer) duVar.f99632b).intValue());
                                        if (dwVar == null) {
                                            dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                                        }
                                    } else {
                                        dwVar = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                                    }
                                    objArr4[0] = dwVar.name();
                                    str5 = String.format(locale4, "success: %s", objArr4);
                                } else {
                                    Locale locale5 = Locale.US;
                                    Object[] objArr5 = new Object[1];
                                    if (duVar.f99631a == 2) {
                                        dsVar = C37512ds.m66519a(((Integer) duVar.f99632b).intValue());
                                        if (dsVar == null) {
                                            dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                                        }
                                    } else {
                                        dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
                                    }
                                    objArr5[0] = dsVar.name();
                                    str5 = String.format(locale5, "failure: %s", objArr5);
                                }
                                objArr3[0] = str5;
                                if (fjVar.f99915b == 2) {
                                    bwVar2 = (C37418bw) fjVar.f99916c;
                                } else {
                                    bwVar2 = C37418bw.f99351d;
                                }
                                C37565ef a3 = C37565ef.m66573a(bwVar2.f99355c);
                                if (a3 == null) {
                                    a3 = C37565ef.UNSET;
                                }
                                objArr3[1] = a3.name();
                                objArr3[2] = Long.valueOf(fjVar.f99917d);
                                str = String.format(locale3, "StopListeningResult %s, StopListeningReason: %s, sessionToken: %d", objArr3);
                                break;
                            case 2:
                                Locale locale6 = Locale.US;
                                Object[] objArr6 = new Object[2];
                                if (fjVar.f99915b == 5) {
                                    acVar = (C37338ac) fjVar.f99916c;
                                } else {
                                    acVar = C37338ac.f99176c;
                                }
                                C37341af a4 = C37341af.m66350a(acVar.f99179b);
                                if (a4 == null) {
                                    a4 = C37341af.UNKNOWN_ACQUIRING_STATUS;
                                }
                                objArr6[0] = a4.name();
                                C37493b bVar = fjVar.f99918e;
                                if (bVar == null) {
                                    bVar = C37493b.f99541c;
                                }
                                objArr6[1] = Integer.valueOf(bVar.f99544b);
                                str = String.format(locale6, "AudioFocusAcquiringStatus: %s, audioFocusToken: %d", objArr6);
                                break;
                            case 3:
                                Locale locale7 = Locale.US;
                                Object[] objArr7 = new Object[2];
                                if (fjVar.f99915b == 6) {
                                    amVar = (C37348am) fjVar.f99916c;
                                } else {
                                    amVar = C37348am.f99205c;
                                }
                                C37344ai a5 = C37344ai.m66353a(amVar.f99208b);
                                if (a5 == null) {
                                    a5 = C37344ai.UNKNOWN_RELEASING_STATUS;
                                }
                                objArr7[0] = a5.name();
                                C37493b bVar2 = fjVar.f99918e;
                                if (bVar2 == null) {
                                    bVar2 = C37493b.f99541c;
                                }
                                objArr7[1] = Integer.valueOf(bVar2.f99544b);
                                str = String.format(locale7, "AudioFocusReleasingStatus: %s, audioFocusToken: %d", objArr7);
                                break;
                            case 4:
                                if (i3 == 8) {
                                    emVar = (C37572em) fjVar.f99916c;
                                } else {
                                    emVar = C37572em.f99843c;
                                }
                                if (emVar.f99845a != 2) {
                                    Locale locale8 = Locale.US;
                                    Object[] objArr8 = new Object[2];
                                    if (emVar.f99845a == 1) {
                                        cmVar = (C37464cm) emVar.f99846b;
                                    } else {
                                        cmVar = C37464cm.f99446c;
                                    }
                                    C37504dk a6 = C37504dk.m66506a(cmVar.f99449b);
                                    if (a6 == null) {
                                        a6 = C37504dk.UNKNOWN_ROUTING_STATUS;
                                    }
                                    objArr8[0] = a6.name();
                                    objArr8[1] = Long.valueOf(fjVar.f99920g);
                                    str = String.format(locale8, "UpdateRoutingStatus: %s, clientToken: %s", objArr8);
                                    break;
                                } else {
                                    Locale locale9 = Locale.US;
                                    Object[] objArr9 = new Object[2];
                                    if (emVar.f99845a == 2) {
                                        ciVar = (C37460ci) emVar.f99846b;
                                    } else {
                                        ciVar = C37460ci.f99438c;
                                    }
                                    C37476cy a7 = C37476cy.m66492a(ciVar.f99441b);
                                    if (a7 == null) {
                                        a7 = C37476cy.UNKNOWN_DISCONNECT_REASON;
                                    }
                                    objArr9[0] = a7.name();
                                    objArr9[1] = Long.valueOf(fjVar.f99920g);
                                    str = String.format(locale9, "AudioRouteDisconnectStatus: %s, clientToken: %s", objArr9);
                                    break;
                                }
                            case 5:
                                if (i3 == 100) {
                                    hkVar = (C37664hk) fjVar.f99916c;
                                } else {
                                    hkVar = C37664hk.f100038c;
                                }
                                C37561eb ebVar2 = hkVar.f100041b;
                                if (ebVar2 == null) {
                                    ebVar2 = C37561eb.f99800c;
                                }
                                Locale locale10 = Locale.US;
                                Object[] objArr10 = new Object[1];
                                int i5 = ebVar2.f99802a;
                                if (i5 == 1) {
                                    C37563ed a8 = C37563ed.m66571a(((Integer) ebVar2.f99803b).intValue());
                                    if (a8 == null) {
                                        a8 = C37563ed.UNKNOWN_OPENING_SUCCESS;
                                    }
                                    str6 = a8.name();
                                } else {
                                    if (i5 == 2) {
                                        dzVar2 = C37519dz.m66524a(((Integer) ebVar2.f99803b).intValue());
                                        if (dzVar2 == null) {
                                            dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
                                        }
                                    } else {
                                        dzVar2 = C37519dz.UNKNOWN_OPENING_FAILURE;
                                    }
                                    str6 = dzVar2.name();
                                }
                                objArr10[0] = str6;
                                str = String.format(locale10, "HotwordStartListeningStatus: AudioSourceOpeningStatus: %s", objArr10);
                                break;
                            case 6:
                                if (i3 == 101) {
                                    hmVar = (C37666hm) fjVar.f99916c;
                                } else {
                                    hmVar = C37666hm.f100042d;
                                }
                                C37514du duVar2 = hmVar.f100045b;
                                if (duVar2 == null) {
                                    duVar2 = C37514du.f99629c;
                                }
                                Locale locale11 = Locale.US;
                                Object[] objArr11 = new Object[2];
                                int i6 = duVar2.f99631a;
                                if (i6 == 1) {
                                    C37516dw a9 = C37516dw.m66521a(((Integer) duVar2.f99632b).intValue());
                                    if (a9 == null) {
                                        a9 = C37516dw.UNKNOWN_CLOSING_SUCCESS;
                                    }
                                    str7 = a9.name();
                                } else {
                                    if (i6 == 2) {
                                        dsVar2 = C37512ds.m66519a(((Integer) duVar2.f99632b).intValue());
                                        if (dsVar2 == null) {
                                            dsVar2 = C37512ds.UNKNOWN_CLOSING_FAILURE;
                                        }
                                    } else {
                                        dsVar2 = C37512ds.UNKNOWN_CLOSING_FAILURE;
                                    }
                                    str7 = dsVar2.name();
                                }
                                objArr11[0] = str7;
                                if (fjVar.f99915b == 101) {
                                    hmVar2 = (C37666hm) fjVar.f99916c;
                                } else {
                                    hmVar2 = C37666hm.f100042d;
                                }
                                C37565ef a10 = C37565ef.m66573a(hmVar2.f100046c);
                                if (a10 == null) {
                                    a10 = C37565ef.UNSET;
                                }
                                objArr11[1] = a10.name();
                                str = String.format(locale11, "HotwordStoptListeningStatus: AudioSourceOpeningStatus: %s, StopListeningReason: %s", objArr11);
                                break;
                            case 7:
                                if (i3 == 102) {
                                    fpVar = (C37604fp) fjVar.f99916c;
                                } else {
                                    fpVar = C37604fp.f99931c;
                                }
                                if (fpVar.f99933a != 2) {
                                    Locale locale12 = Locale.US;
                                    Object[] objArr12 = new Object[1];
                                    if (fpVar.f99933a == 1) {
                                        cmVar2 = (C37464cm) fpVar.f99934b;
                                    } else {
                                        cmVar2 = C37464cm.f99446c;
                                    }
                                    C37504dk a11 = C37504dk.m66506a(cmVar2.f99449b);
                                    if (a11 == null) {
                                        a11 = C37504dk.UNKNOWN_ROUTING_STATUS;
                                    }
                                    objArr12[0] = a11.name();
                                    str = String.format(locale12, "UpdateRoutingStatus: %s", objArr12);
                                    break;
                                } else {
                                    Locale locale13 = Locale.US;
                                    Object[] objArr13 = new Object[1];
                                    if (fpVar.f99933a == 2) {
                                        ciVar2 = (C37460ci) fpVar.f99934b;
                                    } else {
                                        ciVar2 = C37460ci.f99438c;
                                    }
                                    C37476cy a12 = C37476cy.m66492a(ciVar2.f99441b);
                                    if (a12 == null) {
                                        a12 = C37476cy.UNKNOWN_DISCONNECT_REASON;
                                    }
                                    objArr13[0] = a12.name();
                                    str = String.format(locale13, "AudioRouteDisconnectStatus: %s", objArr13);
                                    break;
                                }
                            case 8:
                                str = "Empty ClientEvent Status.";
                                break;
                        }
                        Locale locale14 = Locale.US;
                        Object[] objArr14 = new Object[2];
                        int a13 = C37597fi.m66587a(fjVar.f99915b);
                        switch (a13) {
                            case 1:
                                str4 = "START_LISTENING_STATUS";
                                break;
                            case 2:
                                str4 = "STOP_LISTENING_STATUS";
                                break;
                            case 3:
                                str4 = "ACQUIRE_AUDIO_FOCUS_STATUS";
                                break;
                            case 4:
                                str4 = "RELEASE_AUDIO_FOCUS_STATUS";
                                break;
                            case 5:
                                str4 = "AUDIO_REQUEST_CLIENT_ROUTE_STATUS";
                                break;
                            case 6:
                                str4 = "HOTWORD_START_LISTENING_STATUS";
                                break;
                            case 7:
                                str4 = "HOTWORD_STOP_LISTENING_STATUS";
                                break;
                            case 8:
                                str4 = "HOTWORD_CLIENT_ROUTE_STATUS";
                                break;
                            case 9:
                                str4 = "RESULT_NOT_SET";
                                break;
                            default:
                                str4 = "null";
                                break;
                        }
                        if (a13 != 0) {
                            objArr14[0] = str4;
                            objArr14[1] = str;
                            str = String.format(locale14, "%s: %s", objArr14);
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (i2 == 2) {
                    if (i == 4) {
                        fgVar = (C37595fg) ekVar2.f99840c;
                    } else {
                        fgVar = C37595fg.f99904g;
                    }
                    int b = C37594ff.m66586b(fgVar.f99907b);
                    String a14 = C37594ff.m66585a(b);
                    if (b != 0) {
                        StringBuilder sb = new StringBuilder(a14);
                        sb.append(":");
                        if ((fgVar.f99906a & 8) != 0) {
                            Locale locale15 = Locale.US;
                            Object[] objArr15 = new Object[1];
                            C37773c cVar = fgVar.f99909d;
                            if (cVar == null) {
                                cVar = C37773c.f100243c;
                            }
                            objArr15[0] = C37331f.m66338b(cVar);
                            sb.append(String.format(locale15, " clientInfo: %s ", objArr15));
                        }
                        if ((fgVar.f99906a & 16) != 0) {
                            sb.append(String.format(Locale.US, " sessionToken: %d ", new Object[]{Long.valueOf(fgVar.f99910e)}));
                        }
                        int i7 = fgVar.f99907b;
                        int b2 = C37594ff.m66586b(i7);
                        int i8 = b2 - 1;
                        if (b2 != 0) {
                            if (i8 == 0) {
                                if (i7 == 1) {
                                    eoVar = (C37574eo) fgVar.f99908c;
                                } else {
                                    eoVar = C37574eo.f99847c;
                                }
                                if ((eoVar.f99849a & 1) != 0) {
                                    Locale locale16 = Locale.US;
                                    Object[] objArr16 = new Object[1];
                                    int b3 = C37576eq.m66577b(eoVar.f99850b);
                                    if (b3 == 0) {
                                        b3 = 1;
                                    }
                                    objArr16[0] = C37576eq.m66576a(b3);
                                    sb.append(String.format(locale16, " %s ", objArr16));
                                } else {
                                    sb.append(String.format(Locale.US, " %s ", new Object[]{"OUTCOME_UNKNOWN_FIRST_BYTE_READ"}));
                                }
                            } else if (i8 == 1) {
                                if (i7 == 2) {
                                    frVar = (C37606fr) fgVar.f99908c;
                                } else {
                                    frVar = C37606fr.f99935c;
                                }
                                String str8 = "OUTCOME_UNKNOWN_HOTWORD_FIRST_BYTE_READ";
                                if ((frVar.f99937a & 1) != 0) {
                                    Locale locale17 = Locale.US;
                                    Object[] objArr17 = new Object[1];
                                    int a15 = C37608ft.m66590a(frVar.f99938b);
                                    if (!(a15 == 0 || a15 == 1)) {
                                        str8 = a15 != 2 ? "OUTCOME_FAILED_READING_HOTWORD_FIRST_BYTE" : "OUTCOME_SUCCESS_HOTWORD_FIRST_BYTE_READ";
                                    }
                                    objArr17[0] = str8;
                                    sb.append(String.format(locale17, " %s ", objArr17));
                                } else {
                                    sb.append(String.format(Locale.US, " %s ", new Object[]{str8}));
                                }
                            } else if (i8 == 2) {
                                if (i7 == 3) {
                                    ehVar = (C37567eh) fgVar.f99908c;
                                } else {
                                    ehVar = C37567eh.f99829f;
                                }
                                sb.append(" [");
                                Locale locale18 = Locale.US;
                                Object[] objArr18 = new Object[1];
                                if ((ehVar.f99831a & 1) != 0) {
                                    C37589fa a16 = C37589fa.m66582a(ehVar.f99832b);
                                    if (a16 == null) {
                                        a16 = C37589fa.OUTCOME_UNKNOWN_BUFFER_AUDIO;
                                    }
                                    obj = a16.name();
                                } else {
                                    obj = C37589fa.OUTCOME_UNKNOWN_BUFFER_AUDIO;
                                }
                                objArr18[0] = obj;
                                sb.append(String.format(locale18, " outcome: %s ", objArr18));
                                if ((ehVar.f99831a & 2) != 0) {
                                    sb.append(String.format(Locale.US, " buffer_id: %s ", new Object[]{ehVar.f99833c}));
                                }
                                if ((ehVar.f99831a & 4) != 0) {
                                    sb.append(String.format(Locale.US, " bytes_available: %s ", new Object[]{Integer.valueOf(ehVar.f99834d)}));
                                }
                                if ((ehVar.f99831a & 8) != 0) {
                                    sb.append(String.format(Locale.US, " raw_error: %s ", new Object[]{Integer.valueOf(ehVar.f99835e)}));
                                }
                                sb.append("]");
                            } else if (i8 == 3) {
                                sb.append(" Empty ClientEvent outcome");
                            }
                            str = sb.toString();
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (i2 == 3) {
                    str = "Empty AudioEvent.";
                }
            } else {
                if (i == 2) {
                    fdVar = (C37592fd) ekVar2.f99840c;
                } else {
                    fdVar = C37592fd.f99888n;
                }
                int b4 = C37600fl.m66589b(fdVar.f99893d);
                if (b4 == 0) {
                    b4 = 1;
                }
                StringBuilder sb2 = new StringBuilder(C37600fl.m66588a(b4));
                if ((fdVar.f99890a & 64) != 0) {
                    sb2.append(", ");
                    C37773c cVar2 = fdVar.f99900k;
                    if (cVar2 == null) {
                        cVar2 = C37773c.f100243c;
                    }
                    sb2.append(C37331f.m66338b(cVar2));
                }
                if ((fdVar.f99890a & 2) != 0) {
                    sb2.append(String.format(Locale.US, ", clientToken: %d", new Object[]{Long.valueOf(fdVar.f99894e)}));
                }
                if ((fdVar.f99890a & 4) != 0) {
                    str2 = "]";
                    sb2.append(String.format(Locale.US, ", sessionToken: %d", new Object[]{Long.valueOf(fdVar.f99895f)}));
                } else {
                    str2 = "]";
                }
                if ((fdVar.f99890a & 128) != 0) {
                    sb2.append(String.format(Locale.US, ", routeSessionToken: %d", new Object[]{Long.valueOf(fdVar.f99901l)}));
                }
                if ((fdVar.f99890a & 16) != 0) {
                    Locale locale19 = Locale.US;
                    Object[] objArr19 = new Object[1];
                    C37493b bVar3 = fdVar.f99897h;
                    if (bVar3 == null) {
                        bVar3 = C37493b.f99541c;
                    }
                    objArr19[0] = Integer.valueOf(bVar3.f99544b);
                    sb2.append(String.format(locale19, ", audioFocusToken: %d", objArr19));
                }
                if ((fdVar.f99890a & 256) != 0) {
                    Locale locale20 = Locale.US;
                    Object[] objArr20 = new Object[1];
                    C37384h a17 = C37384h.m66405a(fdVar.f99902m);
                    if (a17 == null) {
                        a17 = C37384h.BISTO;
                    }
                    objArr20[0] = a17.name();
                    sb2.append(String.format(locale20, ", audioAdapter: %s", objArr20));
                }
                if (fdVar.f99898i.size() > 0) {
                    Locale locale21 = Locale.US;
                    Object[] objArr21 = new Object[1];
                    C62971cq<C37539c> cqVar = fdVar.f99898i;
                    C69664n.m101061g(cqVar, "<this>");
                    ArrayList arrayList = new ArrayList(C69540x.m100804k(cqVar, 10));
                    for (C37539c cVar3 : cqVar) {
                        arrayList.add(Long.valueOf(cVar3.f99731b));
                    }
                    objArr21[0] = arrayList.toString();
                    sb2.append(String.format(locale21, ", audioSourceConnectionTokens: %s", objArr21));
                }
                if ((fdVar.f99890a & 8) != 0) {
                    Locale locale22 = Locale.US;
                    Object[] objArr22 = new Object[1];
                    C37565ef a18 = C37565ef.m66573a(fdVar.f99896g);
                    if (a18 == null) {
                        a18 = C37565ef.UNSET;
                    }
                    objArr22[0] = a18.name();
                    sb2.append(String.format(locale22, ", StopListeningReason: %s", objArr22));
                }
                if ((fdVar.f99890a & 32) != 0) {
                    Locale locale23 = Locale.US;
                    Object[] objArr23 = new Object[1];
                    int b5 = C37412bq.m66437b(fdVar.f99899j);
                    if (b5 == 0) {
                        b5 = 1;
                    }
                    objArr23[0] = C37412bq.m66436a(b5);
                    sb2.append(String.format(locale23, ", ClientDeactivatingStatus: %s", objArr23));
                }
                int a19 = C37591fc.m66584a(fdVar.f99891b);
                int i9 = a19 - 1;
                if (a19 != 0) {
                    if (i9 == 0) {
                        String str9 = str2;
                        sb2.append(", ");
                        if (fdVar.f99891b == 200) {
                            blVar = (C37407bl) fdVar.f99892c;
                        } else {
                            blVar = C37407bl.f99325c;
                        }
                        StringBuilder sb3 = new StringBuilder("AudioRequestActivationParams [");
                        if ((blVar.f99327a & 1) != 0) {
                            C37773c cVar4 = blVar.f99328b;
                            if (cVar4 == null) {
                                cVar4 = C37773c.f100243c;
                            }
                            sb3.append(C37331f.m66338b(cVar4));
                        }
                        sb3.append(str9);
                        sb2.append(sb3.toString());
                    } else if (i9 == 1) {
                        sb2.append(", ");
                        if (fdVar.f99891b == 201) {
                            boVar = (C37410bo) fdVar.f99892c;
                        } else {
                            boVar = C37410bo.f99330k;
                        }
                        sb2.append(m67596c(boVar));
                    } else if (i9 == 2) {
                        String str10 = str2;
                        int i10 = 3;
                        sb2.append(", ");
                        if (fdVar.f99891b == 202) {
                            hiVar = (C37662hi) fdVar.f99892c;
                        } else {
                            hiVar = C37662hi.f100030g;
                        }
                        StringBuilder sb4 = new StringBuilder("HotwordMicInputParams: [AudioInputMode: ");
                        int i11 = hiVar.f100033b;
                        if (i11 != 0) {
                            i10 = i11 != 9 ? i11 != 13 ? 0 : 1 : 2;
                        }
                        int i12 = i10 - 1;
                        if (i10 != 0) {
                            if (i12 == 0) {
                                sb4.append("uri");
                            } else if (i12 == 1) {
                                sb4.append("media_sync_event: ");
                                if (hiVar.f100033b == 9) {
                                    hoVar = (C37668ho) hiVar.f100034c;
                                } else {
                                    hoVar = C37668ho.f100047c;
                                }
                                sb4.append(hoVar.f100049a);
                            } else if (i12 == 2) {
                                sb4.append("built-in mic");
                            }
                            if ((hiVar.f100032a & 1) != 0) {
                                sb4.append(", ");
                                C37360ay ayVar = hiVar.f100035d;
                                if (ayVar == null) {
                                    ayVar = C37360ay.f99224l;
                                }
                                sb4.append(m67595b(ayVar));
                            }
                            if ((hiVar.f100032a & 8) != 0) {
                                sb4.append(" enableEmulatedMicrophone: ");
                                sb4.append(hiVar.f100036e);
                            }
                            if ((hiVar.f100032a & 16) != 0) {
                                sb4.append(" ");
                                C37773c cVar5 = hiVar.f100037f;
                                if (cVar5 == null) {
                                    cVar5 = C37773c.f100243c;
                                }
                                sb4.append(C37331f.m66338b(cVar5));
                            }
                            sb4.append(str10);
                            sb2.append(sb4.toString());
                        } else {
                            throw null;
                        }
                    } else if (i9 == 3) {
                        String str11 = str2;
                        sb2.append(", ");
                        if (fdVar.f99891b == 203) {
                            akVar = (C37346ak) fdVar.f99892c;
                        } else {
                            akVar = C37346ak.f99197g;
                        }
                        StringBuilder sb5 = new StringBuilder("AudioFocusRequestParams: [ audioFocusGain: ");
                        sb5.append(akVar.f99200b);
                        sb5.append(" streamType: ");
                        sb5.append(akVar.f99201c);
                        if ((akVar.f99199a & 8) != 0) {
                            sb5.append(" ");
                            C37773c cVar6 = akVar.f99203e;
                            if (cVar6 == null) {
                                cVar6 = C37773c.f100243c;
                            }
                            sb5.append(C37331f.m66338b(cVar6));
                        }
                        sb5.append(str11);
                        sb2.append(sb5.toString());
                    } else if (i9 == 4) {
                        sb2.append(", ");
                        if (fdVar.f99891b == 204) {
                            ckVar = (C37462ck) fdVar.f99892c;
                        } else {
                            ckVar = C37462ck.f99442c;
                        }
                        C37467cp cpVar = ckVar.f99445b;
                        if (cpVar == null) {
                            cpVar = C37467cp.f99458c;
                        }
                        C69664n.m101061g(cpVar, "<this>");
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("AudioRouteType[name=".concat(String.valueOf(C37465cn.m66491a(cpVar.f99460a).name())));
                        C37465cn a20 = C37465cn.m66491a(cpVar.f99460a);
                        C37772b bVar4 = C37772b.AUDIO_LIB;
                        int ordinal = a20.ordinal();
                        if (ordinal == 2) {
                            str3 = str2;
                            if (cpVar.f99460a == 3) {
                                daVar = (C37494da) cpVar.f99461b;
                            } else {
                                daVar = C37494da.f99545c;
                            }
                            sb6.append(",captureSessionId=" + daVar.f99548b);
                        } else if (ordinal == 3) {
                            str3 = str2;
                            if (cpVar.f99460a == 4) {
                                crVar = (C37469cr) cpVar.f99461b;
                            } else {
                                crVar = C37469cr.f99462d;
                            }
                            C37500dg dgVar = crVar.f99466c;
                            if (dgVar == null) {
                                dgVar = C37500dg.f99557c;
                            }
                            sb6.append(",precachedBufferId=[opaqueToken=" + dgVar.f99560b + str3);
                        } else if (ordinal == 4) {
                            str3 = str2;
                            if (cpVar.f99460a == 5) {
                                dcVar = (C37496dc) cpVar.f99461b;
                            } else {
                                dcVar = C37496dc.f99549c;
                            }
                            C37655hb hbVar = dcVar.f99552b;
                            if (hbVar == null) {
                                hbVar = C37655hb.f100025d;
                            }
                            int i13 = hbVar.f100028b;
                            if (cpVar.f99460a == 5) {
                                dcVar2 = (C37496dc) cpVar.f99461b;
                            } else {
                                dcVar2 = C37496dc.f99549c;
                            }
                            C37655hb hbVar2 = dcVar2.f99552b;
                            if (hbVar2 == null) {
                                hbVar2 = C37655hb.f100025d;
                            }
                            sb6.append(",handoffData=[handoffId=" + i13 + ",handoffOffset=" + hbVar2.f100029c + str3);
                        } else if (ordinal != 5) {
                            str3 = str2;
                        } else {
                            if (cpVar.f99460a == 6) {
                                diVar = (C37502di) cpVar.f99461b;
                            } else {
                                diVar = C37502di.f99561c;
                            }
                            C37500dg dgVar2 = diVar.f99564b;
                            if (dgVar2 == null) {
                                dgVar2 = C37500dg.f99557c;
                            }
                            int i14 = dgVar2.f99560b;
                            StringBuilder sb7 = new StringBuilder(",precachedBufferId=[opaqueToken=");
                            sb7.append(i14);
                            str3 = str2;
                            sb7.append(str3);
                            sb6.append(sb7.toString());
                        }
                        sb6.append(str3);
                        sb2.append("AudioRouteRequestParams: [" + sb6.toString() + str3);
                    }
                    str = sb2.toString();
                } else {
                    throw null;
                }
            }
            return String.format(Locale.US, "timestamp: %s | event: %s", new Object[]{Instant.ofEpochMilli(ekVar2.f99841d).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS")), str});
        }
        throw null;
    }
}
