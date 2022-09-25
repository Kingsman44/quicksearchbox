package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p6056o.C76470a;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.clientop.p1847g.C22504i;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51064fa;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51102gl;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.ada;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.m */
/* compiled from: PG */
public final class C76270m extends C22538o {

    /* renamed from: a */
    private static final C58528ij f211291a = new C58759qy("android.intent.category.HOME");

    /* renamed from: b */
    private final C76470a f211292b;

    /* renamed from: c */
    private final PackageManager f211293c;

    /* renamed from: d */
    private final C74946b f211294d;

    /* renamed from: e */
    private final C22504i f211295e;

    /* renamed from: f */
    private final C91142g f211296f;

    public C76270m(C76470a aVar, PackageManager packageManager, C74946b bVar, C22504i iVar, C91142g gVar) {
        this.f211292b = aVar;
        this.f211293c = packageManager;
        this.f211294d = bVar;
        this.f211295e = iVar;
        this.f211296f = gVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r4.equals("STANDARD") != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m122858b(java.lang.String r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r0 = 4
            r1 = 0
            r2 = 1
            if (r2 == r11) goto L_0x0007
            r11 = 0
            goto L_0x0008
        L_0x0007:
            r11 = 4
        L_0x0008:
            android.content.Intent r9 = android.content.Intent.parseUri(r9, r11)     // Catch:{ URISyntaxException -> 0x00b1 }
            java.lang.String r11 = "utterance_id"
            java.lang.String r3 = r9.getStringExtra(r11)
            if (r3 != 0) goto L_0x0016
            java.lang.String r3 = ""
        L_0x0016:
            r9.removeExtra(r11)
            java.lang.String r11 = "start_mode"
            java.lang.String r4 = r9.getStringExtra(r11)
            if (r4 == 0) goto L_0x0066
            int r5 = r4.hashCode()
            r6 = 3
            r7 = 2
            switch(r5) {
                case -2077450683: goto L_0x0048;
                case -1692809360: goto L_0x003e;
                case -950427323: goto L_0x0034;
                case 2095255229: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x0052
        L_0x002b:
            java.lang.String r5 = "STANDARD"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "GRPC_TRUSTED_INTENT"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0052
            r1 = 3
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "ASSISTANT_ACTIVITY"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0052
            r1 = 2
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "VOICE_INTERACTION"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = -1
        L_0x0053:
            if (r1 == 0) goto L_0x0066
            if (r1 == r2) goto L_0x0064
            if (r1 == r7) goto L_0x0062
            if (r1 != r6) goto L_0x005c
            goto L_0x0067
        L_0x005c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x0062:
            r0 = 3
            goto L_0x0067
        L_0x0064:
            r0 = 2
            goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            r9.removeExtra(r11)
            if (r10 == 0) goto L_0x0078
            com.google.android.apps.gsa.nga.engine.o.a r10 = r8.f211292b
            r10.mo72200a(r9)
            com.google.assistant.e.j.ec r9 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x0078:
            java.lang.String r10 = "android.intent.action.MAIN"
            java.lang.String r11 = r9.getAction()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0095
            com.google.common.b.ij r10 = f211291a
            java.util.Set r11 = r9.getCategories()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0095
            com.google.android.apps.gsa.nga.engine.am.p.b r10 = r8.f211294d
            r10.mo71313c()
        L_0x0095:
            com.google.android.apps.gsa.nga.engine.o.a r10 = r8.f211292b
            boolean r9 = r10.mo72204e(r9, r0, r3)
            if (r9 == 0) goto L_0x00a4
            com.google.assistant.e.j.ec r9 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x00a4:
            com.google.assistant.e.j.kf r9 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r10 = "Unable to open provider, intent starter failed"
            com.google.assistant.e.j.ec r9 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r9, r10)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        L_0x00b1:
            com.google.assistant.e.j.kf r10 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            java.util.Locale r11 = java.util.Locale.US
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r9
            java.lang.String r9 = "Unable to open provider, malformed intentUri: %s"
            java.lang.String r9 = java.lang.String.format(r11, r9, r0)
            com.google.assistant.e.j.ec r9 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r10, r9)
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b.C76270m.m122858b(java.lang.String, boolean, boolean):com.google.common.util.concurrent.cx");
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51058ev evVar;
        C51064fa faVar;
        C51064fa faVar2;
        if (dyVar.f135936b.equals("provider.OPEN")) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            ada ada = (ada) m41992m(dwVar, "open_provider_args", ada.f134865f.getParserForType());
            C51098gh ghVar = ada.f134868b;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b != 1) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unable to open provider, no android app info."));
            }
            C51098gh ghVar2 = ada.f134868b;
            if (ghVar2 == null) {
                ghVar2 = C51098gh.f133009e;
            }
            if (ghVar2.f133012b == 1) {
                evVar = (C51058ev) ghVar2.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            if (!evVar.f132956n.isEmpty() && !evVar.f132944b.isEmpty()) {
                return C60856cj.m92900i(this.f211295e.mo27633a(evVar.f132956n, evVar.f132944b));
            } else if ((evVar.f132943a & 32) != 0) {
                C51102gl glVar = ada.f134869c;
                if (glVar == null) {
                    glVar = C51102gl.f133019c;
                }
                if (glVar.f133021a == 1) {
                    faVar2 = (C51064fa) glVar.f133022b;
                } else {
                    faVar2 = C51064fa.f132965d;
                }
                return m122858b(evVar.f132949g, evVar.f132954l, faVar2.f132969c);
            } else {
                C51102gl glVar2 = ada.f134869c;
                if (glVar2 == null) {
                    glVar2 = C51102gl.f133019c;
                }
                if (glVar2.f133021a == 1) {
                    faVar = (C51064fa) glVar2.f133022b;
                } else {
                    faVar = C51064fa.f132965d;
                }
                if ((evVar.f132943a & 1) == 0) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Unsupported args for provider.OPEN ClientOp."));
                }
                String str = evVar.f132944b;
                boolean z = faVar.f132968b;
                Intent launchIntentForPackage = this.f211293c.getLaunchIntentForPackage(str);
                if (launchIntentForPackage == null) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "Can't resolve package name."));
                }
                if (!this.f211296f.mo85405j(C90126fx.f251032bE) || !z) {
                    if (this.f211292b.mo72204e(launchIntentForPackage, 1, BuildConfig.FLAVOR)) {
                        return C60856cj.m92900i(C22402a.f61893a);
                    }
                } else if (this.f211292b.mo72205f(launchIntentForPackage, 1)) {
                    return C60856cj.m92900i(C22402a.f61893a);
                }
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.INTERNAL, "Can't start intent with a package name"));
            }
        } else {
            throw new C22428d(dyVar);
        }
    }
}
