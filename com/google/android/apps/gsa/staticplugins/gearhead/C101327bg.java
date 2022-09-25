package com.google.android.apps.gsa.staticplugins.gearhead;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.handsfree.notifications.CarRemoteNotification;
import com.google.android.apps.gsa.handsfree.notifications.CarRemoteSms;
import com.google.android.apps.gsa.handsfree.notifications.MessagingRemoteNotification;
import com.google.android.apps.gsa.search.core.carassistant.C85703e;
import com.google.android.apps.gsa.search.core.carassistant.C85730h;
import com.google.android.apps.gsa.search.core.carassistant.C85735m;
import com.google.android.apps.gsa.search.core.carassistant.C85736n;
import com.google.android.apps.gsa.search.core.carassistant.C85737o;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.gearhead.sdk.assistant.ClientStateSnapshot;
import com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.gearhead.sdk.assistant.VoiceSessionConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p681d.C11636b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55421x;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bg */
/* compiled from: PG */
public final class C101327bg {

    /* renamed from: a */
    public static final C59071e f282800a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.gearhead.bg");

    /* renamed from: b */
    public final C86124t f282801b;

    /* renamed from: c */
    public final Query f282802c;

    /* renamed from: d */
    public final C85737o f282803d;

    /* renamed from: e */
    public final C11636b f282804e;

    /* renamed from: f */
    private final Context f282805f;

    /* renamed from: g */
    private final C86054o f282806g;

    /* renamed from: h */
    private final C21370a f282807h;

    public C101327bg(Context context, C86124t tVar, C86054o oVar, C21370a aVar, Query query, C85737o oVar2, C11636b bVar) {
        this.f282805f = context;
        this.f282801b = tVar;
        this.f282806g = oVar;
        this.f282807h = aVar;
        this.f282802c = query;
        this.f282803d = oVar2;
        this.f282804e = bVar;
    }

    /* renamed from: e */
    private final Query m167618e(VoiceSessionConfig voiceSessionConfig, String str, MessagingInfo messagingInfo) {
        QueryTriggerType queryTriggerType = QueryTriggerType.OPA_PROACTIVE_NOTIFICATION;
        C85737o oVar = this.f282803d;
        C85735m m = C85736n.m137758m();
        C85703e eVar = (C85703e) m;
        eVar.f231747b = voiceSessionConfig.f387133d;
        m.mo79341e(voiceSessionConfig.f387134e);
        m.mo79340d(!this.f282801b.mo79746e(C90086ek.f250288aM));
        m.mo79338b(mo92243a(voiceSessionConfig));
        m.mo79342f(queryTriggerType);
        eVar.f231748c = m167619f(queryTriggerType, voiceSessionConfig.f387138i);
        eVar.f231749d = str;
        Query a = oVar.mo79386a(m.mo79337a());
        if (this.f282806g.mo79683q() && messagingInfo.f387124j.equals("com.google.android.talk")) {
            C59104x b = f282800a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
            ((C59052c) ((C59052c) b).mo56372aa(20061)).mo56386p("Forcing offline for Auto dasher user");
            a = a.mo84238A();
        }
        return a.mo84494v();
    }

    /* renamed from: f */
    private static String m167619f(QueryTriggerType queryTriggerType, boolean z) {
        QueryTriggerType queryTriggerType2 = QueryTriggerType.USER;
        int ordinal = queryTriggerType.ordinal();
        if (ordinal == 5) {
            return true != z ? "and.opa.hotword" : "and.gsa.fusion.hotword";
        }
        if (ordinal == 6) {
            return true != z ? "and.opa.bluetooth" : "and.gsa.fusion.bluetooth";
        }
        if (ordinal != 15) {
            if (ordinal == 31) {
                return true != z ? "and.opa.notification" : "and.gsa.fusion.notification";
            }
            switch (ordinal) {
                case 22:
                    break;
                case 23:
                case 24:
                    return true != z ? "and.opa.hardware.button" : "and.gsa.fusion.hardware.button";
                default:
                    return null;
            }
        }
        return true != z ? "and.opa.gsamic" : "and.gsa.fusion.mic";
    }

    /* renamed from: a */
    public final long mo92243a(VoiceSessionConfig voiceSessionConfig) {
        if (voiceSessionConfig.f387135f == 4) {
            return voiceSessionConfig.f387137h.getLong("TRIGGER_ELAPSED_REALTIME_MILLIS_KEY");
        }
        return voiceSessionConfig.f387136g + (this.f282807h.mo26871c() - this.f282807h.mo26870b());
    }

    /* renamed from: b */
    public final CarAssistantSessionManager.CarAssistantSessionRequest mo92244b(VoiceSessionConfig voiceSessionConfig, ClientStateSnapshot clientStateSnapshot) {
        int i;
        QueryTriggerType queryTriggerType;
        Query query;
        String str;
        C58976aa aaVar = C58975e.f156826a;
        GearheadStateSnapshot gearheadStateSnapshot = clientStateSnapshot.f387107c;
        if (gearheadStateSnapshot != null) {
            i = gearheadStateSnapshot.f387108a;
        } else {
            C59104x c = f282800a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
            ((C59052c) ((C59052c) c).mo56372aa(20042)).mo56386p("Missing GH state snapshot");
            i = 0;
        }
        C58485gu m = C58485gu.m89845m();
        if (this.f282801b.mo79746e(C90120fr.f250858y)) {
            m = mo92245c(voiceSessionConfig, clientStateSnapshot.f387106b, C55421x.UNKNOWN_ACTION_TYPE);
        }
        if (!(voiceSessionConfig.f387133d == null || i == 2)) {
            C59104x d = f282800a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
            ((C59052c) ((C59052c) d).mo56372aa(20052)).mo56386p("Audio content provider specified for non-projected mode");
        }
        int i2 = voiceSessionConfig.f387135f;
        if (i2 == 4) {
            int i3 = voiceSessionConfig.f387137h.getInt("VOICE_SESSION_TRIGGER_KEY", 0);
            if (i3 == 1) {
                queryTriggerType = QueryTriggerType.HOTWORD;
            } else if (i3 == 2) {
                queryTriggerType = QueryTriggerType.PROXY_VOICE_BUTTON;
            } else if (i3 == 3) {
                queryTriggerType = QueryTriggerType.BT_HEADSET_BUTTON;
            } else {
                queryTriggerType = QueryTriggerType.USER;
            }
        } else if (i2 == 1) {
            queryTriggerType = QueryTriggerType.GEARHEAD_SCREEN_MIC;
        } else if (i2 == 2) {
            queryTriggerType = QueryTriggerType.GEARHEAD_CONTROLLER;
        } else if (i2 == 3) {
            queryTriggerType = QueryTriggerType.GEARHEAD_HARDWARE_MIC;
        } else {
            List list = clientStateSnapshot.f387106b;
            if (list == null || list.isEmpty()) {
                queryTriggerType = QueryTriggerType.USER;
            } else {
                queryTriggerType = QueryTriggerType.OPA_PROACTIVE_NOTIFICATION;
            }
        }
        C58485gu d2 = mo92246d(clientStateSnapshot.f387106b, voiceSessionConfig.f387139j);
        C85735m m2 = C85736n.m137758m();
        Bundle bundle = voiceSessionConfig.f387137h;
        if (bundle == null) {
            query = null;
        } else {
            query = (Query) bundle.getParcelable("HOTWORD_QUERY_KEY");
        }
        C85703e eVar = (C85703e) m2;
        eVar.f231746a = query;
        eVar.f231747b = voiceSessionConfig.f387133d;
        m2.mo79341e(voiceSessionConfig.f387134e);
        m2.mo79340d(!this.f282801b.mo79746e(C90086ek.f250288aM));
        m2.mo79338b(mo92243a(voiceSessionConfig));
        m2.mo79342f(queryTriggerType);
        eVar.f231748c = m167619f(queryTriggerType, voiceSessionConfig.f387138i);
        GearheadStateSnapshot gearheadStateSnapshot2 = clientStateSnapshot.f387107c;
        if (!(gearheadStateSnapshot2 == null || (str = gearheadStateSnapshot2.f387111d) == null)) {
            eVar.f231750e = str;
        }
        C85730h q = CarAssistantSessionManager.CarAssistantSessionRequest.m137614q(this.f282803d.mo79386a(m2.mo79337a()));
        q.mo79309d(d2);
        q.mo79308c(m);
        return q.mo79306a();
    }

    /* renamed from: c */
    public final C58485gu mo92245c(VoiceSessionConfig voiceSessionConfig, List list, C55421x xVar) {
        String str;
        String str2;
        VoiceSessionConfig voiceSessionConfig2 = voiceSessionConfig;
        C55421x xVar2 = xVar;
        C58976aa aaVar = C58975e.f156826a;
        if (list == null) {
            C59104x c = f282800a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
            ((C59052c) ((C59052c) c).mo56372aa(20068)).mo56386p("createLegacyNotifications(): RecentMessages is null.");
            return C58485gu.m89845m();
        } else if (list.isEmpty()) {
            C59104x c2 = f282800a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
            ((C59052c) ((C59052c) c2).mo56372aa(20067)).mo56386p("createLegacyNotifications(): No messages in RecentMessages.");
            return C58485gu.m89845m();
        } else {
            C58480gp e = C58485gu.m89837e();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessagingInfo messagingInfo = (MessagingInfo) it.next();
                String str3 = "google";
                CarRemoteSms carRemoteSms = null;
                if (messagingInfo.f387119e.isEmpty() || messagingInfo.f387123i == null || messagingInfo.f387122h == null || (str2 = messagingInfo.f387120f) == null) {
                    PendingIntent pendingIntent = messagingInfo.f387121g;
                    if (pendingIntent == null) {
                        C59104x c3 = f282800a.mo56225c();
                        c3.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                        ((C59052c) ((C59052c) c3).mo56372aa(20049)).mo56386p("createRemoteNotification(): missing read pending intent.");
                    } else {
                        String str4 = messagingInfo.f387117c;
                        if (str4.isEmpty()) {
                            C59104x c4 = f282800a.mo56225c();
                            c4.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                            ((C59052c) ((C59052c) c4).mo56372aa(20048)).mo56386p("createRemoteNotification(): missing sender display name.");
                        } else {
                            StatusBarNotification statusBarNotification = messagingInfo.f387115a;
                            List list2 = messagingInfo.f387116b;
                            if (list2 == null || list2.isEmpty()) {
                                String str5 = str3;
                                if (statusBarNotification != null) {
                                    carRemoteSms = new CarRemoteNotification(statusBarNotification.getNotification(), messagingInfo.f387118d, statusBarNotification.getPostTime(), pendingIntent, str4, statusBarNotification.getPackageName());
                                    if (xVar2 != C55421x.UNKNOWN_ACTION_TYPE) {
                                        carRemoteSms.b = xVar2;
                                        if (carRemoteSms.b.ordinal() != 79) {
                                            str = str5;
                                        } else {
                                            str = carRemoteSms.d;
                                        }
                                        carRemoteSms.c = m167618e(voiceSessionConfig2, str, messagingInfo);
                                    }
                                } else {
                                    C59104x c5 = f282800a.mo56225c();
                                    c5.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                                    ((C59052c) ((C59052c) c5).mo56372aa(20045)).mo56386p("createRemoteNotification(): No message found");
                                }
                            } else {
                                String str6 = "read my messages";
                                String str7 = str3;
                                carRemoteSms = new CarRemoteSms(list2, messagingInfo.f387118d, pendingIntent, str4);
                                if (xVar2 != C55421x.UNKNOWN_ACTION_TYPE) {
                                    carRemoteSms.a = xVar2;
                                    carRemoteSms.b = m167618e(voiceSessionConfig2, carRemoteSms.a.ordinal() != 79 ? str7 : str6, messagingInfo);
                                }
                            }
                        }
                    }
                } else if (messagingInfo.f387121g == null) {
                    C59104x c6 = f282800a.mo56225c();
                    c6.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                    ((C59052c) ((C59052c) c6).mo56372aa(20044)).mo56386p("createMessagingRemoteNotification(): missing read pending intent.");
                } else if (str2.isEmpty()) {
                    C59104x c7 = f282800a.mo56225c();
                    c7.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                    ((C59052c) ((C59052c) c7).mo56372aa(20043)).mo56386p("createMessagingRemoteNotification(): missing conversation title.");
                } else {
                    if (xVar2 == C55421x.READ_NOTIFICATION) {
                        str3 = "read my messages";
                    }
                    Query query = Query.f252741b;
                    if (xVar2 != C55421x.UNKNOWN_ACTION_TYPE) {
                        query = m167618e(voiceSessionConfig2, str3, messagingInfo);
                    }
                    carRemoteSms = new MessagingRemoteNotification(messagingInfo, xVar, str3, query, this.f282805f.getString(R.string.sender_says_message), this.f282805f.getString(R.string.two_message_concatenation));
                }
                if (carRemoteSms == null) {
                    C59104x c8 = f282800a.mo56225c();
                    c8.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                    ((C59052c) ((C59052c) c8).mo56372aa(20065)).mo56386p("createLegacyNotifications(): Failed to create a RemoteNotification.");
                } else {
                    e.mo55395g(carRemoteSms);
                }
            }
            C58485gu f = e.mo55394f();
            if (f.isEmpty()) {
                C59104x c9 = f282800a.mo56225c();
                c9.mo56378ag(C58975e.f156826a, "GearheadVSRFactory");
                ((C59052c) ((C59052c) c9).mo56372aa(20064)).mo56386p("createLegacyNotifications(): Empty message list.");
            }
            return f;
        }
    }

    /* renamed from: d */
    public final C58485gu mo92246d(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return C58485gu.m89845m();
        }
        boolean z2 = false;
        if (z && this.f282801b.mo79746e(C90014bt.f247266ds)) {
            z2 = true;
        }
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.mo55395g(new NotificationWrapper((MessagingInfo) it.next(), z2));
        }
        return e.mo55394f();
    }
}
