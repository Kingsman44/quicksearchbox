package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import android.util.Base64;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.util.debug.C91020d;
import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.common.base.C58827ar;
import com.google.common.p4552o.C59833gz;
import com.google.common.p4552o.p4570p.C60361aq;
import com.google.common.p4552o.p4570p.C60362ar;
import com.google.common.p4552o.p4570p.C60365au;
import com.google.common.p4552o.p4570p.C60367aw;
import com.google.common.p4552o.p4570p.C60368ax;
import com.google.common.p4552o.p4570p.C60372ba;
import com.google.common.p4552o.p4570p.C60373bb;
import com.google.common.p4552o.p4570p.C60376be;
import com.google.common.p4552o.p4570p.C60378bg;
import com.google.common.p4552o.p4570p.C60380bi;
import com.google.common.p4552o.p4570p.C60381bj;
import com.google.common.p4575r.C60761r;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.i */
/* compiled from: PG */
public final class C90973i extends C90983s {
    public C90973i(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private static String m148594b(String str, long j) {
        return String.format(Locale.US, "%s: %dms", new Object[]{str, Long.valueOf(j)});
    }

    /* renamed from: a */
    public final /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        String str2;
        String str3;
        C59833gz gzVar = (C59833gz) messageLite;
        if (gzVar != null) {
            String format = String.format(Locale.US, "%s: %s", new Object[]{C90745b.m148220a(new Date(gzVar.f161688b)), C91020d.m148681a(gzVar.f161689c)});
            ArrayList arrayList = new ArrayList();
            if ((gzVar.f161687a & 4) != 0) {
                arrayList.add("request ID: " + C60761r.m92757c(Base64.decode(gzVar.f161690d, 11)));
            }
            if ((gzVar.f161687a & 256) != 0) {
                arrayList.add("GWS event ID: ".concat(String.valueOf(gzVar.f161695i)));
            }
            if ((gzVar.f161687a & 1024) != 0) {
                arrayList.add("latency ID: " + gzVar.f161697k);
            }
            if ((gzVar.f161687a & 8) != 0) {
                switch (gzVar.f161691e) {
                    case 1:
                        str3 = "gel";
                        break;
                    case 2:
                        str3 = "velvet";
                        break;
                    case 3:
                        str3 = "headless";
                        break;
                    case 4:
                        str3 = "onevoice";
                        break;
                    case 5:
                        str3 = "hotwordservice";
                        break;
                    case 6:
                        str3 = "speakerid-enrollment";
                        break;
                    case 7:
                        str3 = "clockwork";
                        break;
                    case 8:
                        str3 = "query-entry";
                        break;
                    case 9:
                        str3 = "lockscreen-entry";
                        break;
                    case 10:
                        str3 = "lockscreen-search";
                        break;
                    case 11:
                        str3 = "search-now";
                        break;
                    case 12:
                        str3 = "android-auto";
                        break;
                    case 13:
                        str3 = "gmm";
                        break;
                    case 14:
                        str3 = "eyesfree-screenless";
                        break;
                    case 15:
                        str3 = "opa-android";
                        break;
                    default:
                        str3 = "unknown";
                        break;
                }
                arrayList.add("client: ".concat(str3));
            }
            if ((gzVar.f161687a & 16) != 0) {
                arrayList.add("error code: " + gzVar.f161692f);
            }
            if ((gzVar.f161687a & 2048) != 0) {
                arrayList.add("bug: " + gzVar.f161698l);
            }
            if ((gzVar.f161687a & 32) != 0) {
                int i = gzVar.f161693g;
                switch (i) {
                    case 1:
                        str2 = "VOICE_RECOGNITION";
                        break;
                    case 2:
                        str2 = "VOICE_RECOGNITION_CALL_CONTACT";
                        break;
                    case 3:
                        str2 = "VOICE_RECOGNITION_COMMAND";
                        break;
                    case 4:
                        str2 = "VOICE_RECOGNITION_DISAMBIG";
                        break;
                    case 5:
                        str2 = "SONG_RECOGNITION";
                        break;
                    case 6:
                        str2 = "TEXT_SEARCH";
                        break;
                    case 7:
                        str2 = "TV_CONTENT_RECOGNITION";
                        break;
                    case 8:
                        str2 = "VOICE_RECOGNITION_PROMPT_RECIPIENT";
                        break;
                    case 9:
                        str2 = "VOICE_RECOGNITION_PROMPT_MESSAGE";
                        break;
                    default:
                        str2 = "RequestType(" + i + ")";
                        break;
                }
                arrayList.add("request type: ".concat(str2));
            }
            if ((gzVar.f161687a & 64) != 0) {
                arrayList.add("application ID:".concat(String.valueOf(gzVar.f161694h)));
            }
            if ((gzVar.f161687a & 8192) != 0) {
                C89851ag a = C89851ag.m146284a(gzVar.f161700n);
                if (a == null) {
                    a = C89851ag.UNKNOWN;
                }
                arrayList.add("appflow type: ".concat(String.valueOf(String.valueOf(a))));
            }
            if ((gzVar.f161687a & 512) != 0) {
                C60368ax axVar = gzVar.f161696j;
                if (axVar == null) {
                    axVar = C60368ax.f163383j;
                }
                int a2 = C60367aw.m92573a(axVar.f163387c);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i2 = a2 - 1;
                if (i2 == 0) {
                    str = "unknown (wtf?)";
                } else if (i2 == 1) {
                    str = "store start";
                } else if (i2 == 2) {
                    str = "store end";
                } else if (i2 == 3) {
                    str = "db write done";
                } else if (i2 == 4) {
                    str = "compile complete";
                } else if (i2 == 100) {
                    str = "load start";
                } else if (i2 == 101) {
                    str = "load end";
                } else if (i2 == 201) {
                    str = "js ep load fail";
                } else if (i2 == 202) {
                    str = "js create obj fail";
                } else if (i2 == 300) {
                    str = "release switch";
                } else if (i2 != 301) {
                    str = "unmapped(" + Integer.toString(i2) + ")";
                } else {
                    str = "release switch attempt";
                }
                arrayList.add("type: ".concat(str));
                if ((axVar.f163385a & 1) != 0) {
                    arrayList.add("jar ID: ".concat(String.valueOf(axVar.f163386b)));
                }
                if ((axVar.f163385a & 8) != 0) {
                    C60381bj bjVar = axVar.f163389e;
                    if (bjVar == null) {
                        bjVar = C60381bj.f163402e;
                    }
                    arrayList.add("feature: ".concat(String.valueOf(bjVar.f163404a)));
                    C60381bj bjVar2 = axVar.f163389e;
                    if (bjVar2 == null) {
                        bjVar2 = C60381bj.f163402e;
                    }
                    int a3 = C60380bi.m92577a(bjVar2.f163405b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    arrayList.add("status: ".concat(Integer.toString(a3 - 1)));
                    C60381bj bjVar3 = axVar.f163389e;
                    if (bjVar3 == null) {
                        bjVar3 = C60381bj.f163402e;
                    }
                    int a4 = C60376be.m92575a(bjVar3.f163406c);
                    if (a4 == 0) {
                        a4 = 4;
                    }
                    StringBuilder sb = new StringBuilder("classloader: ");
                    sb.append(a4 - 1);
                    arrayList.add(sb.toString());
                    C60381bj bjVar4 = axVar.f163389e;
                    if (bjVar4 == null) {
                        bjVar4 = C60381bj.f163402e;
                    }
                    int a5 = C60378bg.m92576a(bjVar4.f163407d);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    StringBuilder sb2 = new StringBuilder("dex optimized: ");
                    sb2.append(a5 - 1);
                    arrayList.add(sb2.toString());
                }
                if ((axVar.f163385a & 4) != 0) {
                    C60373bb bbVar = axVar.f163388d;
                    if (bbVar == null) {
                        bbVar = C60373bb.f163395b;
                    }
                    int a6 = C60372ba.m92574a(bbVar.f163397a);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    StringBuilder sb3 = new StringBuilder("status: ");
                    sb3.append(a6 - 1);
                    arrayList.add(sb3.toString());
                }
                if ((axVar.f163385a & 32) != 0) {
                    arrayList.add("old: ".concat(String.valueOf(axVar.f163390f)));
                }
                if ((axVar.f163385a & 64) != 0) {
                    arrayList.add("new: ".concat(String.valueOf(axVar.f163391g)));
                }
                if ((axVar.f163385a & 128) != 0) {
                    C60365au auVar = axVar.f163392h;
                    if (auVar == null) {
                        auVar = C60365au.f163371j;
                    }
                    if ((auVar.f163373a & 1) != 0) {
                        arrayList.add(m148594b("load started", auVar.f163374b));
                    }
                    if ((2 & auVar.f163373a) != 0) {
                        arrayList.add(m148594b("refreshed", auVar.f163375c));
                    }
                    if ((auVar.f163373a & 4) != 0) {
                        arrayList.add(m148594b("info retrieved", auVar.f163376d));
                    }
                    if ((auVar.f163373a & 8) != 0) {
                        arrayList.add(m148594b("repo locked", auVar.f163377e));
                    }
                    if ((auVar.f163373a & 16) != 0) {
                        arrayList.add(m148594b("load ended", auVar.f163378f));
                    }
                    if ((auVar.f163373a & 32) != 0) {
                        arrayList.add(m148594b("loaded", auVar.f163379g));
                    }
                    if ((auVar.f163373a & 64) != 0) {
                        arrayList.add(m148594b("instantiated", auVar.f163380h));
                    }
                    if ((auVar.f163373a & 128) != 0) {
                        arrayList.add(m148594b("finished", auVar.f163381i));
                    }
                }
                if ((axVar.f163385a & 256) != 0) {
                    C60362ar arVar = axVar.f163393i;
                    if (arVar == null) {
                        arVar = C60362ar.f163366c;
                    }
                    int a7 = C60361aq.m92572a(arVar.f163369b);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    int i3 = a7 - 1;
                    arrayList.add("result: ".concat(i3 != 0 ? i3 != 1 ? "forced" : "failed blocked" : "success"));
                    arrayList.add("new version: ".concat(String.valueOf(arVar.f163368a)));
                }
            }
            if (!arrayList.isEmpty()) {
                format = format + " (" + new C58827ar("; ").mo56097d(arrayList) + ")";
            }
            this.f254188a.mo85257a(format);
        }
    }
}
