package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.p9522a.C126940b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126980aa;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126981b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126982c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126983d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126985f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126986g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126989j;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126990k;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126991l;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126994o;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126995p;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126996q;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C127001v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C127002w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C127004y;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d.C129349af;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.C34836d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.impl.ConversationStateManager$onInteractionResult$1$1", mo61344c = "ConversationStateManager.kt", mo61345d = "invokeSuspend", mo61346e = {195})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.z */
/* compiled from: PG */
final class C127037z extends C69572j implements C69630p {

    /* renamed from: a */
    int f349820a;

    /* renamed from: b */
    final /* synthetic */ C127012af f349821b;

    /* renamed from: c */
    final /* synthetic */ C119844cl f349822c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127037z(C127012af afVar, C119844cl clVar, C69577g gVar) {
        super(2, gVar);
        this.f349821b = afVar;
        this.f349822c = clVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127037z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C119840ch chVar;
        C126985f fVar;
        C126994o oVar;
        TelephonyManager telephonyManager;
        NetworkCapabilities networkCapabilities;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349820a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127012af afVar = this.f349821b;
            C119844cl clVar = this.f349822c;
            this.f349820a = 1;
            C127001v vVar = afVar.f349748g;
            int i = 4;
            if (clVar.f333790a == 4) {
                chVar = (C119840ch) clVar.f333791b;
            } else {
                chVar = C119840ch.f333779b;
            }
            C34822b bVar = chVar.f333781a;
            if (bVar == null) {
                bVar = C34822b.f92358d;
            }
            C69664n.m101060f(bVar, "interactionResult.failure.exceptionInfo");
            C119834cb cbVar = clVar.f333792c;
            if (cbVar == null) {
                cbVar = null;
            }
            C69664n.m101061g(bVar, "apaExceptionInfo");
            C34834b bVar2 = bVar.f92362c;
            if (bVar2 == null) {
                bVar2 = C34834b.f92401c;
            }
            C34819a b = C34819a.m63579b(bVar2);
            int i2 = C127002w.f349721a;
            switch (((C34836d) b).f92406a.f92404b) {
                case 358807761:
                    int a = b.mo39520a();
                    if (a != C127002w.f349722b) {
                        if (a != C127002w.f349723c) {
                            fVar = C126985f.ERROR_GENERIC;
                            break;
                        } else {
                            fVar = C126985f.ERROR_MIC;
                            break;
                        }
                    } else {
                        fVar = C126985f.ERROR_AUDIO_PERMISSION_DENIED;
                        break;
                    }
                case 367597068:
                    if (b.mo39520a() != C127002w.f349721a) {
                        fVar = C126985f.ERROR_GENERIC;
                        break;
                    } else {
                        fVar = C126985f.ERROR_ARBITRATION_LOST;
                        break;
                    }
                case 368028363:
                    fVar = C126985f.ERROR_AUDIO_FOCUS_LOST;
                    break;
                case 372332208:
                    if (b.mo39520a() != C127002w.f349726f) {
                        fVar = C126985f.ERROR_GENERIC;
                        break;
                    } else {
                        fVar = C126985f.ERROR_AUDIO_FOCUS_LOST;
                        break;
                    }
                case 386306917:
                    fVar = C126985f.ERROR_NETWORK;
                    break;
                case 414356165:
                    int a2 = b.mo39520a();
                    if (a2 != C127002w.f349724d) {
                        if (a2 != C127002w.f349725e) {
                            fVar = C126985f.ERROR_GENERIC;
                            break;
                        } else {
                            fVar = C126985f.ERROR_NETWORK;
                            break;
                        }
                    } else {
                        fVar = C126985f.ERROR_AUTH_RECOVERABLE;
                        break;
                    }
                default:
                    fVar = C126985f.ERROR_GENERIC;
                    break;
            }
            C126986g gVar = (C126986g) C126988i.f349669h.createBuilder();
            C69664n.m101060f(gVar, "newBuilder()");
            C126981b a3 = C69664n.m101061g(gVar, "builder");
            a3.mo107883c(fVar);
            if (cbVar != null) {
                a3.mo107884d(cbVar);
            }
            int ordinal = fVar.ordinal();
            if (ordinal == 1) {
                C126940b bVar3 = (C126940b) vVar.f349719a;
                WifiManager wifiManager = bVar3.f349482d;
                boolean isWifiEnabled = wifiManager != null ? wifiManager.isWifiEnabled() : false;
                ConnectivityManager connectivityManager = bVar3.f349481c;
                Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
                if (activeNetwork != null && (networkCapabilities = bVar3.f349481c.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(17)) {
                    i = 18;
                } else if (Settings.Global.getInt(bVar3.f349480b.getContentResolver(), "airplane_mode_on", 0) != 0) {
                    i = isWifiEnabled ? 3 : 2;
                } else {
                    ConnectivityManager connectivityManager2 = bVar3.f349481c;
                    if ((connectivityManager2 != null ? connectivityManager2.getNetworkInfo(0) : null) != null) {
                        if (bVar3.mo107861a() != 5) {
                            int a4 = bVar3.mo107861a();
                            i = a4 == 1 ? isWifiEnabled ? 7 : 6 : C126940b.f349477a.contains(Integer.valueOf(a4)) ? isWifiEnabled ? 9 : 8 : isWifiEnabled ? 11 : 10;
                        } else {
                            TelephonyManager telephonyManager2 = bVar3.f349483e;
                            if (telephonyManager2 == null || !telephonyManager2.isDataEnabled()) {
                                i = isWifiEnabled ? 13 : 12;
                            } else {
                                TelephonyManager telephonyManager3 = bVar3.f349483e;
                                i = (telephonyManager3 == null || !telephonyManager3.isNetworkRoaming() || ((telephonyManager = bVar3.f349483e) != null && telephonyManager.isDataRoamingEnabled())) ? bVar3.mo107862b() != 4 ? isWifiEnabled ? 17 : 16 : 1 : isWifiEnabled ? 15 : 14;
                            }
                        }
                    } else if (isWifiEnabled) {
                        i = 5;
                    }
                }
                switch (i - 1) {
                    case 0:
                        oVar = C126994o.NETWORK_UNKNOWN_REASON;
                        break;
                    case 1:
                        oVar = C126994o.NETWORK_AIRPLANE_ON_WIFI_OFF;
                        break;
                    case 2:
                        oVar = C126994o.NETWORK_AIRPLANE_ON_WIFI_ON;
                        break;
                    case 3:
                        oVar = C126994o.NETWORK_NO_CELL_SUPPORT_WIFI_OFF;
                        break;
                    case 4:
                        oVar = C126994o.NETWORK_NO_CELL_SUPPORT_WIFI_ON;
                        break;
                    case 5:
                        oVar = C126994o.NETWORK_NO_SIM_CARD_WIFI_OFF;
                        break;
                    case 6:
                        oVar = C126994o.NETWORK_NO_SIM_CARD_WIFI_ON;
                        break;
                    case 7:
                    case 8:
                        oVar = C126994o.NETWORK_SIM_CARD_LOCKED;
                        break;
                    case 9:
                        oVar = C126994o.NETWORK_SIM_CARD_ERROR_WIFI_OFF;
                        break;
                    case 10:
                        oVar = C126994o.NETWORK_SIM_CARD_ERROR_WIFI_ON;
                        break;
                    case 11:
                        oVar = C126994o.NETWORK_MOBILE_DATA_OFF_WIFI_OFF;
                        break;
                    case 12:
                        oVar = C126994o.NETWORK_MOBILE_DATA_OFF_WIFI_ON;
                        break;
                    case 13:
                        oVar = C126994o.NETWORK_DATA_ROAMING_OFF_WIFI_OFF;
                        break;
                    case 14:
                        oVar = C126994o.NETWORK_DATA_ROAMING_OFF_WIFI_ON;
                        break;
                    case 15:
                    case 16:
                        oVar = C126994o.NETWORK_NO_DATA_CONNECTION;
                        break;
                    default:
                        oVar = C126994o.NETWORK_CAPTIVE_PORTAL_DETECTED;
                        break;
                }
                C69664n.m101061g(oVar, "value");
                C126986g gVar2 = a3.f349652a;
                gVar2.copyOnWrite();
                C126988i iVar = (C126988i) gVar2.instance;
                iVar.f349673c = Integer.valueOf(oVar.f349704q);
                iVar.f349672b = 5;
                C126991l lVar = (C126991l) C126992m.f349681d.createBuilder();
                C69664n.m101060f(lVar, "newBuilder()");
                C127004y a5 = C69664n.m101061g(lVar, "builder");
                String string = vVar.f349720b.getString(C129349af.m211169a(oVar));
                C69664n.m101060f(string, "context.getString(ErrorU…ason(errorNetworkReason))");
                C69664n.m101061g(string, "value");
                C126991l lVar2 = a5.f349727a;
                lVar2.copyOnWrite();
                C126992m mVar = (C126992m) lVar2.instance;
                string.getClass();
                mVar.f349683a = 1 | mVar.f349683a;
                mVar.f349684b = string;
                a3.mo107885e(a5.mo107891a());
            } else if (ordinal == 3) {
                a3.mo107882b(bVar);
                C126995p pVar = (C126995p) C126996q.f349705c.createBuilder();
                C69664n.m101060f(pVar, "newBuilder()");
                C126980aa a6 = C69664n.m101061g(pVar, "builder");
                Context context = vVar.f349720b;
                int i3 = C129349af.f355240a;
                String string2 = context.getString(R.string.assistant_mic_occupied_error);
                C69664n.m101060f(string2, "context.getString(ErrorU…rMessageForMicOccupied())");
                a6.mo107880b(string2);
                a3.mo107886f(a6.mo107879a());
            } else if (ordinal == 6 || ordinal == 8) {
                a3.mo107882b(bVar);
                C126982c cVar = (C126982c) C126983d.f349653a.createBuilder();
                C69664n.m101060f(cVar, "newBuilder()");
                C69664n.m101061g(cVar, "builder");
                C62942bv build = cVar.build();
                C69664n.m101060f(build, "_builder.build()");
                C126983d dVar = (C126983d) build;
                C69664n.m101061g(dVar, "value");
                C126986g gVar3 = a3.f349652a;
                gVar3.copyOnWrite();
                C126988i iVar2 = (C126988i) gVar3.instance;
                dVar.getClass();
                iVar2.f349675e = dVar;
                iVar2.f349674d = 6;
            } else if (ordinal != 9) {
                a3.mo107882b(bVar);
                C126991l lVar3 = (C126991l) C126992m.f349681d.createBuilder();
                C69664n.m101060f(lVar3, "newBuilder()");
                a3.mo107885e(C69664n.m101061g(lVar3, "builder").mo107891a());
            } else {
                a3.mo107882b(bVar);
                C126989j jVar = (C126989j) C126990k.f349679a.createBuilder();
                C69664n.m101060f(jVar, "newBuilder()");
                C69664n.m101061g(jVar, "builder");
                C62942bv build2 = jVar.build();
                C69664n.m101060f(build2, "_builder.build()");
                C126990k kVar = (C126990k) build2;
                C69664n.m101061g(kVar, "value");
                C126986g gVar4 = a3.f349652a;
                gVar4.copyOnWrite();
                C126988i iVar3 = (C126988i) gVar4.instance;
                kVar.getClass();
                iVar3.f349675e = kVar;
                iVar3.f349674d = 9;
            }
            C126988i a7 = a3.mo107881a();
            C59052c cVar2 = (C59052c) C127012af.f349742a.mo56224b();
            cVar2.mo56379ah(new C59094n(37361));
            cVar2.mo56389s("Got error %s", a7);
            Object c = C71663i.m104690c(afVar.f349744c.mo107971b(a7), this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127037z(this.f349821b, this.f349822c, gVar);
    }
}
