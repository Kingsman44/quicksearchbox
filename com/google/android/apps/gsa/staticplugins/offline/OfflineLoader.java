package com.google.android.apps.gsa.staticplugins.offline;

import android.content.Context;
import com.google.android.apps.gsa.languagepack.aj;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90727ak;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4541l.C59332o;
import com.google.common.p4541l.C59337t;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p4242bp.p4243a.p4245b.C56154m;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
public class OfflineLoader {

    /* renamed from: a */
    public boolean f295378a = false;

    /* renamed from: b */
    public Set f295379b = new HashSet();

    /* renamed from: c */
    private final Set f295380c = new HashSet();

    /* renamed from: d */
    private final aj f295381d;

    public OfflineLoader(aj ajVar) {
        this.f295381d = ajVar;
    }

    static native boolean initNativeActionBuilder(byte[] bArr);

    static native boolean initNativeActionBuilderActionData(byte[] bArr);

    /* renamed from: a */
    public final synchronized void mo95107a(Query query) {
        if (!this.f295378a) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 941;
            if (query != null) {
                String b = C39191a.m68623b(query.f252749G);
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                b.getClass();
                ufVar2.f164093a |= 4;
                ufVar2.f164259n = b;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            C90727ak.m148184a("offline_actions_jni");
            this.f295378a = true;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0043=Splitter:B:22:0x0043, B:31:0x004e=Splitter:B:31:0x004e} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo95108b(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = r3.f295379b     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)
            return
        L_0x000b:
            com.google.android.apps.gsa.languagepack.aj r0 = r3.f295381d     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "offline_action_data.pb"
            java.io.File r4 = r0.b(r1, r4, r5)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0057
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0052, all -> 0x004d }
            byte[] r4 = com.google.common.p4541l.C59332o.m92213d(r1)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.bp.a.b.g r2 = com.google.p4242bp.p4243a.p4245b.C56148g.f149606b     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r4, (com.google.protobuf.C62921ba) r0)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.bp.a.b.g r4 = (com.google.p4242bp.p4243a.p4245b.C56148g) r4     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            boolean r0 = r3.f295378a     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            if (r0 == 0) goto L_0x0043
            byte[] r4 = r4.toByteArray()     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            boolean r4 = initNativeActionBuilderActionData(r4)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            if (r4 == 0) goto L_0x0043
            java.util.Set r4 = r3.f295379b     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            r4.add(r5)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            com.google.common.p4541l.C59337t.m92221a(r1)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)
            return
        L_0x0043:
            com.google.common.p4541l.C59337t.m92221a(r1)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)
            return
        L_0x0048:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x004b:
            r0 = r1
            goto L_0x0052
        L_0x004d:
            r4 = move-exception
        L_0x004e:
            com.google.common.p4541l.C59337t.m92221a(r0)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x0059 }
        L_0x0052:
            com.google.common.p4541l.C59337t.m92221a(r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r3)
            return
        L_0x0057:
            monitor-exit(r3)
            return
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.offline.OfflineLoader.mo95108b(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public final synchronized void mo95109c(Context context, String str) {
        if (!this.f295380c.contains(str)) {
            File b = this.f295381d.b("semantics.pumpkin", context, str);
            if (b != null) {
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(b);
                    try {
                        if (initNativeActionBuilder(((C56154m) C62942bv.parseFrom((C62942bv) C56154m.f149619a, C59332o.m92213d(fileInputStream2), C62921ba.m95368a())).toByteArray())) {
                            this.f295380c.add(str);
                            C59337t.m92221a(fileInputStream2);
                            return;
                        }
                        C59337t.m92221a(fileInputStream2);
                    } catch (IOException unused) {
                        fileInputStream = fileInputStream2;
                        C59337t.m92221a(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        C59337t.m92221a(fileInputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                    C59337t.m92221a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    C59337t.m92221a(fileInputStream);
                    throw th;
                }
            }
        }
    }
}
