package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.android.apps.gsa.shared.util.p7158b.C90745b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23103f;
import com.google.common.p4552o.C59767ex;
import com.google.common.p4552o.C59769ez;
import com.google.common.p4552o.C59774fb;
import com.google.protobuf.MessageLite;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.m */
/* compiled from: PG */
public final class C90977m extends C90983s {
    public C90977m(C90974j jVar) {
        super(jVar);
    }

    /* renamed from: b */
    private static String m148605b(long j) {
        return C90745b.m148220a(new Date(j));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85255a(MessageLite messageLite) {
        String str;
        C59774fb fbVar = (C59774fb) messageLite;
        if (fbVar.f161513a.size() != 0) {
            this.f254188a.mo85258b("Event Log");
            this.f254188a.mo85261e();
            this.f254188a.mo85257a(String.format("Logger start time: %s", new Object[]{m148605b(fbVar.f161514b)}));
            for (C59767ex exVar : fbVar.f161513a) {
                C59769ez ezVar = exVar.f161491c;
                if (ezVar == null) {
                    ezVar = C59769ez.f161493g;
                }
                Object[] objArr = new Object[3];
                objArr[0] = m148605b((exVar.f161489a / 1000000) + fbVar.f161514b);
                objArr[1] = m148605b((exVar.f161490b / 1000000) + fbVar.f161514b);
                int a = C23103f.m43284a(ezVar.f161498d);
                if (a != 0) {
                    switch (a) {
                        case 1:
                            break;
                        case 2:
                            str = "RENDERER_ON_INITIALIZE";
                            break;
                        case 3:
                            str = "RENDERER_ON_BIND";
                            break;
                        case 4:
                            str = "CLIENT_ON_START";
                            break;
                        case 5:
                            str = "CONTROLLER_ON_INITIALIZE";
                            break;
                        case 6:
                            str = "CONTROLLER_ON_CREATE";
                            break;
                        case 7:
                            str = "CONTROLLER_ON_RESTORE";
                            break;
                        case 8:
                            str = "CONTROLLER_ON_DESTROY";
                            break;
                        case 9:
                            str = "RENDERER_ON_UNBIND";
                            break;
                        case 10:
                            str = "RENDERER_ON_DESTROY";
                            break;
                        case 11:
                            str = "CLIENT_ON_RESUME";
                            break;
                        case 12:
                            str = "CLIENT_ON_SHOW";
                            break;
                        case 13:
                            str = "CLIENT_ON_HIDE";
                            break;
                        case 14:
                            str = "CLIENT_ON_PAUSE";
                            break;
                        case 15:
                            str = "CLIENT_ON_STOP";
                            break;
                        case 16:
                            str = "CLIENT_ON_BACK_PRESSED";
                            break;
                        case 17:
                            str = "SCOPE_LOAD";
                            break;
                        case 18:
                            str = "CUSTOM_EVENT";
                            break;
                        default:
                            str = "BOOTSTRAP";
                            break;
                    }
                }
                str = "UNKNOWN";
                objArr[2] = str;
                String format = String.format("%s to %s: eventType = %s", objArr);
                if ((ezVar.f161495a & 2) != 0) {
                    format = String.valueOf(format).concat(String.valueOf(String.format(", featureId = %s", new Object[]{ezVar.f161499e})));
                }
                if ((ezVar.f161495a & 4) != 0) {
                    format = String.valueOf(format).concat(String.valueOf(String.format(", featureType = %s", new Object[]{ezVar.f161500f})));
                }
                if (ezVar.f161496b == 4) {
                    format = String.valueOf(format).concat(String.valueOf(String.format(", scopeName = %s", new Object[]{(String) ezVar.f161497c})));
                }
                if (ezVar.f161496b == 5) {
                    format = String.valueOf(format).concat(String.valueOf(String.format(", customEventName = %s", new Object[]{(String) ezVar.f161497c})));
                }
                this.f254188a.mo85257a(format);
            }
            this.f254188a.mo85260d();
        }
    }
}
