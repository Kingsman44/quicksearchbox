package com.google.android.apps.gsa.shared.p7006ax;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.mdns.MdnsServiceInfo;
import com.google.assistant.p3861at.C49875cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.ax.h */
/* compiled from: PG */
public final /* synthetic */ class C89329h implements C89323b {

    /* renamed from: a */
    public static final /* synthetic */ C89329h f242190a = new C89329h();

    private /* synthetic */ C89329h() {
    }

    /* renamed from: a */
    public final Object mo83248a(MdnsServiceInfo mdnsServiceInfo) {
        Map a = mdnsServiceInfo.mo120610a();
        C89325d dVar = new C89325d();
        if (a.containsKey("su")) {
            dVar.mo83261d(Integer.parseInt((String) a.get("su")));
            if (a.containsKey("gi")) {
                String str = (String) a.get("gi");
                if (str != null) {
                    dVar.f242170a = str;
                    if (a.containsKey("3m")) {
                        String str2 = (String) a.get("3m");
                        if (str2 != null) {
                            dVar.f242173d = str2;
                            if (a.containsKey("ci")) {
                                String str3 = (String) a.get("ci");
                                if (str3 != null) {
                                    dVar.f242172c = str3;
                                    if (a.containsKey("cf")) {
                                        String str4 = (String) a.get("cf");
                                        if (str4 != null) {
                                            dVar.f242174e = str4;
                                            if (a.containsKey("lo")) {
                                                String str5 = (String) a.get("lo");
                                                if (str5 != null) {
                                                    dVar.f242175f = str5;
                                                    if (a.containsKey("3n")) {
                                                        dVar.mo83260c((String) a.get("3n"));
                                                    } else {
                                                        C59104x d = C89328g.f242189a.mo56226d();
                                                        d.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                                                        ((C59052c) ((C59052c) d).mo56372aa(11158)).mo56386p("Can't find device name");
                                                        dVar.f242171b = BuildConfig.FLAVOR;
                                                    }
                                                    if (a.containsKey("mu")) {
                                                        dVar.mo83262e(((String) a.get("mu")).equals("1"));
                                                    } else {
                                                        dVar.mo83262e(false);
                                                        C59104x d2 = C89328g.f242189a.mo56226d();
                                                        d2.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                                                        ((C59052c) ((C59052c) d2).mo56372aa(11159)).mo56386p("Can't find multi_user_enabled");
                                                    }
                                                    dVar.mo83259b(C49875cf.LIBASSISTANT);
                                                    return dVar.mo83258a();
                                                }
                                                throw new NullPointerException("Null locale");
                                            }
                                            C59104x c = C89328g.f242189a.mo56225c();
                                            c.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                                            ((C59052c) ((C59052c) c).mo56372aa(11157)).mo56386p("Can't find Locale");
                                            return null;
                                        }
                                        throw new NullPointerException("Null certificate");
                                    }
                                    C59104x c2 = C89328g.f242189a.mo56225c();
                                    c2.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                                    ((C59052c) ((C59052c) c2).mo56372aa(11156)).mo56386p("Can't find certificate");
                                    return null;
                                }
                                throw new NullPointerException("Null clientId");
                            }
                            C59104x c3 = C89328g.f242189a.mo56225c();
                            c3.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                            ((C59052c) ((C59052c) c3).mo56372aa(11155)).mo56386p("Can't find client id");
                            return null;
                        }
                        throw new NullPointerException("Null deviceModelId");
                    }
                    C59104x c4 = C89328g.f242189a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
                    ((C59052c) ((C59052c) c4).mo56372aa(11154)).mo56386p("Can't find device model id");
                    return null;
                }
                throw new NullPointerException("Null libassistantId");
            }
            C59104x c5 = C89328g.f242189a.mo56225c();
            c5.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
            ((C59052c) ((C59052c) c5).mo56372aa(11153)).mo56386p("Can't find libassistant id");
            return null;
        }
        C59104x c6 = C89328g.f242189a.mo56225c();
        c6.mo56378ag(C58975e.f156826a, "LibAssistantDevice");
        ((C59052c) ((C59052c) c6).mo56372aa(11152)).mo56386p("Can't find num of signed in users");
        return null;
    }
}
