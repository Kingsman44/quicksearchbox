package com.google.android.apps.gsa.staticplugins.p7706ct;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.android.apps.gsa.languagepack.aj;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import com.google.speech.grammar.pumpkin.ActionFrame;
import com.google.speech.grammar.pumpkin.C66516h;
import com.google.speech.grammar.pumpkin.C66519k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.ct.a */
/* compiled from: PG */
public final class C98527a extends C66519k {

    /* renamed from: h */
    private static final C59071e f275109h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ct.a");

    /* renamed from: a */
    public boolean f275110a = false;

    /* renamed from: b */
    final Map f275111b = new HashMap();

    /* renamed from: c */
    final Map f275112c = new HashMap();

    /* renamed from: d */
    ActionFrame f275113d = null;

    /* renamed from: i */
    private final AssetManager f275114i;

    /* renamed from: j */
    private final String f275115j;

    /* renamed from: k */
    private final String f275116k;

    /* renamed from: l */
    private final Context f275117l;

    /* renamed from: m */
    private final C86124t f275118m;

    /* renamed from: n */
    private final aj f275119n;

    /* renamed from: o */
    private boolean f275120o = false;

    /* renamed from: p */
    private C66516h f275121p = null;

    public C98527a(Context context, String str, C86124t tVar, aj ajVar) {
        this.f275115j = m163199d(str);
        this.f275114i = context.getAssets();
        this.f275116k = str;
        this.f275117l = context;
        this.f275118m = tVar;
        this.f275119n = ajVar;
    }

    /* renamed from: c */
    public static File m163198c(String str) {
        return new File(str.concat(".pumpkin"));
    }

    /* renamed from: d */
    public static String m163199d(String str) {
        return str.startsWith("en-") ? "en-US" : str;
    }

    /* renamed from: i */
    private static String m163200i(String str) {
        Iterable<String> g = C58869cf.m90936b(new C58903m(' ')).mo56153g(str);
        StringBuilder sb = new StringBuilder();
        for (String str2 : g) {
            if (str2.length() == 4) {
                sb.append((char) Integer.parseInt(str2, 16));
            }
        }
        return sb.toString();
    }

    /* renamed from: j */
    private final void m163201j(File file) {
        BufferedReader bufferedReader;
        FileReader fileReader;
        IOException e;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        List i = C58869cf.m90936b(new C58903m(';')).mo56155i(readLine);
                        if (i.size() == 2) {
                            String i2 = m163200i((String) i.get(0));
                            String i3 = m163200i((String) i.get(1));
                            if (i2.length() == 1) {
                                this.f275111b.put(Character.valueOf(i2.charAt(0)), i3);
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        try {
                            ((C59052c) ((C59052c) ((C59052c) f275109h.mo56225c()).mo56382g(e)).mo56372aa(30764)).mo56389s("Failed to read from %s", file.getName());
                            C59337t.m92222b(fileReader);
                            C59337t.m92222b(bufferedReader);
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            } catch (IOException e3) {
                IOException iOException = e3;
                bufferedReader = null;
                e = iOException;
                ((C59052c) ((C59052c) ((C59052c) f275109h.mo56225c()).mo56382g(e)).mo56372aa(30764)).mo56389s("Failed to read from %s", file.getName());
                C59337t.m92222b(fileReader);
                C59337t.m92222b(bufferedReader);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                fileReader2 = fileReader;
                C59337t.m92222b(fileReader2);
                C59337t.m92222b(bufferedReader);
                throw th;
            }
        } catch (IOException e4) {
            bufferedReader = null;
            e = e4;
            fileReader = null;
            ((C59052c) ((C59052c) ((C59052c) f275109h.mo56225c()).mo56382g(e)).mo56372aa(30764)).mo56389s("Failed to read from %s", file.getName());
            C59337t.m92222b(fileReader);
            C59337t.m92222b(bufferedReader);
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            C59337t.m92222b(fileReader2);
            C59337t.m92222b(bufferedReader);
            throw th;
        }
        C59337t.m92222b(fileReader);
        C59337t.m92222b(bufferedReader);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.speech.grammar.pumpkin.ActionFrame mo91160a(java.io.File r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.languagepack.aj r0 = r4.f275119n
            java.lang.String r1 = r5.toString()
            android.content.Context r2 = r4.f275117l
            java.lang.String r3 = r4.f275116k
            java.io.File r0 = r0.b(r1, r2, r3)
            if (r0 == 0) goto L_0x0023
            com.google.common.l.ac r1 = new com.google.common.l.ac     // Catch:{ IOException -> 0x0023 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0023 }
            byte[] r0 = r1.mo56803a()     // Catch:{ IOException -> 0x0023 }
            com.google.speech.grammar.pumpkin.ActionFrameManager r1 = r4.f180916e     // Catch:{ IOException -> 0x0023 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r1.mo59649b(r0)     // Catch:{ IOException -> 0x0023 }
            r1 = 1
            r4.f275110a = r1     // Catch:{ IOException -> 0x0023 }
            return r0
        L_0x0023:
            byte[] r5 = r4.mo91162g(r5)     // Catch:{ IOException -> 0x0031 }
            com.google.speech.grammar.pumpkin.ActionFrameManager r0 = r4.f180916e     // Catch:{ IOException -> 0x0031 }
            com.google.speech.grammar.pumpkin.ActionFrame r5 = r0.mo59649b(r5)     // Catch:{ IOException -> 0x0031 }
            r0 = 0
            r4.f275110a = r0     // Catch:{ IOException -> 0x0031 }
            return r5
        L_0x0031:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98527a.mo91160a(java.io.File):com.google.speech.grammar.pumpkin.ActionFrame");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:4|5)|6|7|(1:9)|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.speech.grammar.pumpkin.C66516h mo59665b() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.common.f.e r0 = f275109h     // Catch:{ all -> 0x0053 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "load pumpkin config bytes"
            r2 = 30739(0x7813, float:4.3075E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0053 }
            com.google.android.apps.gsa.languagepack.aj r0 = r4.f275119n     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "config"
            java.io.File r1 = m163198c(r1)     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0053 }
            android.content.Context r2 = r4.f275117l     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = r4.f275116k     // Catch:{ all -> 0x0053 }
            java.io.File r0 = r0.b(r1, r2, r3)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0037
            com.google.common.l.ac r1 = new com.google.common.l.ac     // Catch:{ IOException -> 0x0037 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0037 }
            byte[] r0 = r1.mo56803a()     // Catch:{ IOException -> 0x0037 }
            com.google.speech.grammar.pumpkin.h r1 = com.google.speech.grammar.pumpkin.C66516h.f180902a     // Catch:{ IOException -> 0x0037 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r0)     // Catch:{ IOException -> 0x0037 }
            com.google.speech.grammar.pumpkin.h r0 = (com.google.speech.grammar.pumpkin.C66516h) r0     // Catch:{ IOException -> 0x0037 }
            r4.f275121p = r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            com.google.speech.grammar.pumpkin.h r0 = r4.f275121p     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "config"
            java.io.File r0 = m163198c(r0)     // Catch:{ all -> 0x0053 }
            byte[] r0 = r4.mo91162g(r0)     // Catch:{ all -> 0x0053 }
            com.google.speech.grammar.pumpkin.h r1 = com.google.speech.grammar.pumpkin.C66516h.f180902a     // Catch:{ all -> 0x0053 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r0)     // Catch:{ all -> 0x0053 }
            com.google.speech.grammar.pumpkin.h r0 = (com.google.speech.grammar.pumpkin.C66516h) r0     // Catch:{ all -> 0x0053 }
            r4.f275121p = r0     // Catch:{ all -> 0x0053 }
        L_0x004f:
            com.google.speech.grammar.pumpkin.h r0 = r4.f275121p     // Catch:{ all -> 0x0053 }
            monitor-exit(r4)
            return r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98527a.mo59665b():com.google.speech.grammar.pumpkin.h");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0020=Splitter:B:11:0x0020, B:28:0x0094=Splitter:B:28:0x0094, B:15:0x002f=Splitter:B:15:0x002f} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo59666e() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.apps.gsa.speech.p7272e.p7275c.C92274k.m151521a()     // Catch:{ all -> 0x0243 }
            boolean r0 = r10.f275120o     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r10)
            return
        L_0x000a:
            com.google.android.apps.gsa.languagepack.aj r0 = r10.f275119n     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = "pumpkin.mmap"
            android.content.Context r2 = r10.f275117l     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = r10.f275116k     // Catch:{ all -> 0x0243 }
            java.io.File r0 = r0.b(r1, r2, r3)     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = r0.toString()     // Catch:{ IllegalArgumentException -> 0x0020 }
            r10.mo59667h(r0)     // Catch:{ IllegalArgumentException -> 0x0020 }
            goto L_0x002f
        L_0x0020:
            com.google.common.f.e r0 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = "Fail to init ActionFrameManager with memory map."
            r2 = 30743(0x7817, float:4.308E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0243 }
            monitor-exit(r10)
            return
        L_0x002f:
            super.mo59666e()     // Catch:{ all -> 0x0243 }
            com.google.android.apps.gsa.languagepack.aj r0 = r10.f275119n     // Catch:{ all -> 0x0243 }
            java.lang.String r1 = "monastery_config.pumpkin"
            android.content.Context r2 = r10.f275117l     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = r10.f275116k     // Catch:{ all -> 0x0243 }
            java.io.File r0 = r0.b(r1, r2, r3)     // Catch:{ all -> 0x0243 }
            r1 = 1
            if (r0 != 0) goto L_0x0043
            goto L_0x01fd
        L_0x0043:
            com.google.common.l.ac r2 = new com.google.common.l.ac     // Catch:{ IOException -> 0x01f0 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01f0 }
            byte[] r0 = r2.mo56803a()     // Catch:{ IOException -> 0x01f0 }
            com.google.speech.grammar.pumpkin.d r2 = com.google.speech.grammar.pumpkin.C66512d.f180896b     // Catch:{ IOException -> 0x01f0 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0)     // Catch:{ IOException -> 0x01f0 }
            com.google.speech.grammar.pumpkin.d r0 = (com.google.speech.grammar.pumpkin.C66512d) r0     // Catch:{ IOException -> 0x01f0 }
            com.google.android.apps.gsa.languagepack.aj r2 = r10.f275119n     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "custom_action_config.pumpkin"
            android.content.Context r4 = r10.f275117l     // Catch:{ all -> 0x0243 }
            java.lang.String r5 = r10.f275116k     // Catch:{ all -> 0x0243 }
            java.io.File r2 = r2.b(r3, r4, r5)     // Catch:{ all -> 0x0243 }
            r3 = 0
            if (r2 != 0) goto L_0x0072
            com.google.common.f.e r2 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0243 }
            java.lang.String r4 = "No custom action grammar file present"
            r5 = 30761(0x7829, float:4.3105E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)     // Catch:{ all -> 0x0243 }
            r2 = r3
            goto L_0x0094
        L_0x0072:
            com.google.common.f.e r4 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0243 }
            java.lang.String r5 = "Parsing custom action grammar file"
            r6 = 30750(0x781e, float:4.309E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)     // Catch:{ all -> 0x0243 }
            com.google.common.l.ac r4 = new com.google.common.l.ac     // Catch:{ IOException -> 0x01e2 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x01e2 }
            byte[] r2 = r4.mo56803a()     // Catch:{ IOException -> 0x01e2 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ IOException -> 0x01e2 }
            com.google.speech.grammar.pumpkin.d r5 = com.google.speech.grammar.pumpkin.C66512d.f180896b     // Catch:{ IOException -> 0x01e2 }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ IOException -> 0x01e2 }
            com.google.speech.grammar.pumpkin.d r2 = (com.google.speech.grammar.pumpkin.C66512d) r2     // Catch:{ IOException -> 0x01e2 }
        L_0x0094:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0243 }
            com.google.protobuf.cq r5 = r0.f180898a     // Catch:{ all -> 0x0243 }
            int r5 = r5.size()     // Catch:{ all -> 0x0243 }
            r4.<init>(r5)     // Catch:{ all -> 0x0243 }
            if (r2 == 0) goto L_0x00b9
            com.google.protobuf.cq r2 = r2.f180898a     // Catch:{ all -> 0x0243 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0243 }
        L_0x00a7:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0243 }
            if (r5 == 0) goto L_0x00b9
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.b r5 = (com.google.speech.grammar.pumpkin.C66510b) r5     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = r5.f180892a     // Catch:{ all -> 0x0243 }
            r4.add(r5)     // Catch:{ all -> 0x0243 }
            goto L_0x00a7
        L_0x00b9:
            com.google.protobuf.cq r0 = r0.f180898a     // Catch:{ all -> 0x0243 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0243 }
            r2 = r3
            r5 = r2
        L_0x00c1:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0243 }
            if (r6 == 0) goto L_0x0135
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.b r6 = (com.google.speech.grammar.pumpkin.C66510b) r6     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = r6.f180892a     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = "FollowOn"
            boolean r7 = r7.endsWith(r8)     // Catch:{ all -> 0x0243 }
            if (r7 == 0) goto L_0x012f
            com.google.speech.grammar.pumpkin.d r7 = com.google.speech.grammar.pumpkin.C66512d.f180896b     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.c r7 = (com.google.speech.grammar.pumpkin.C66511c) r7     // Catch:{ all -> 0x0243 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.d r8 = (com.google.speech.grammar.pumpkin.C66512d) r8     // Catch:{ all -> 0x0243 }
            r6.getClass()     // Catch:{ all -> 0x0243 }
            r8.mo59664a()     // Catch:{ all -> 0x0243 }
            com.google.protobuf.cq r8 = r8.f180898a     // Catch:{ all -> 0x0243 }
            r8.add(r6)     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.d r7 = (com.google.speech.grammar.pumpkin.C66512d) r7     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = r6.f180892a     // Catch:{ all -> 0x0243 }
            java.lang.String r9 = "DialogCoreFollowOn"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0243 }
            if (r8 == 0) goto L_0x0103
            r3 = r7
            goto L_0x00c1
        L_0x0103:
            java.lang.String r8 = r6.f180892a     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = com.google.android.apps.gsa.shared.util.C90772bp.m148290Q(r8)     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrameManager r9 = r10.f180916e     // Catch:{ all -> 0x0243 }
            byte[] r7 = r7.toByteArray()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r7 = r9.mo59649b(r7)     // Catch:{ all -> 0x0243 }
            java.util.Map r9 = r10.f275112c     // Catch:{ all -> 0x0243 }
            r9.put(r8, r7)     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = r6.f180892a     // Catch:{ all -> 0x0243 }
            java.lang.String r9 = "SendMessageFollowOn"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0243 }
            if (r1 != r8) goto L_0x0123
            r5 = r7
        L_0x0123:
            java.lang.String r6 = r6.f180892a     // Catch:{ all -> 0x0243 }
            java.lang.String r8 = "CommunicationDialogFollowOn"
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0243 }
            if (r1 != r6) goto L_0x00c1
            r2 = r7
            goto L_0x00c1
        L_0x012f:
            java.lang.String r7 = r6.f180892a     // Catch:{ all -> 0x0243 }
            r4.add(r6)     // Catch:{ all -> 0x0243 }
            goto L_0x00c1
        L_0x0135:
            if (r3 == 0) goto L_0x0173
            com.google.speech.grammar.pumpkin.ActionFrameManager r0 = r10.f180916e     // Catch:{ all -> 0x0243 }
            byte[] r3 = r3.toByteArray()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r0.mo59649b(r3)     // Catch:{ all -> 0x0243 }
            java.util.Map r3 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = "Planning"
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r3 = (com.google.speech.grammar.pumpkin.ActionFrame) r3     // Catch:{ all -> 0x0243 }
            if (r3 == 0) goto L_0x015a
            com.google.speech.grammar.pumpkin.ActionFrameManager r6 = r10.f180916e     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r3 = r6.mo59648a(r3, r0)     // Catch:{ all -> 0x0243 }
            java.util.Map r6 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r7 = "Planning"
            r6.put(r7, r3)     // Catch:{ all -> 0x0243 }
        L_0x015a:
            java.util.Map r3 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = "SearchMessage"
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r3 = (com.google.speech.grammar.pumpkin.ActionFrame) r3     // Catch:{ all -> 0x0243 }
            if (r3 == 0) goto L_0x0173
            com.google.speech.grammar.pumpkin.ActionFrameManager r6 = r10.f180916e     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r6.mo59648a(r3, r0)     // Catch:{ all -> 0x0243 }
            java.util.Map r3 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r6 = "SearchMessage"
            r3.put(r6, r0)     // Catch:{ all -> 0x0243 }
        L_0x0173:
            if (r5 == 0) goto L_0x0195
            java.util.Map r0 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "SearchMessage"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = (com.google.speech.grammar.pumpkin.ActionFrame) r0     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x0195
            com.google.speech.grammar.pumpkin.ActionFrameManager r3 = r10.f180916e     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r3.mo59648a(r0, r5)     // Catch:{ all -> 0x0243 }
            java.util.Map r3 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r5 = "SearchMessage"
            r3.put(r5, r0)     // Catch:{ all -> 0x0243 }
            java.util.Map r3 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r5 = "SendMessage"
            r3.put(r5, r0)     // Catch:{ all -> 0x0243 }
        L_0x0195:
            if (r2 == 0) goto L_0x01b8
            java.util.Map r0 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "Travel"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = (com.google.speech.grammar.pumpkin.ActionFrame) r0     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x01b1
            com.google.speech.grammar.pumpkin.ActionFrameManager r3 = r10.f180916e     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r3.mo59648a(r2, r0)     // Catch:{ all -> 0x0243 }
            java.util.Map r2 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "Travel"
            r2.put(r3, r0)     // Catch:{ all -> 0x0243 }
            goto L_0x01b8
        L_0x01b1:
            java.util.Map r0 = r10.f275112c     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "Travel"
            r0.put(r3, r2)     // Catch:{ all -> 0x0243 }
        L_0x01b8:
            com.google.speech.grammar.pumpkin.d r0 = com.google.speech.grammar.pumpkin.C66512d.f180896b     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.c r0 = (com.google.speech.grammar.pumpkin.C66511c) r0     // Catch:{ all -> 0x0243 }
            r0.copyOnWrite()     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.d r2 = (com.google.speech.grammar.pumpkin.C66512d) r2     // Catch:{ all -> 0x0243 }
            r2.mo59664a()     // Catch:{ all -> 0x0243 }
            com.google.protobuf.cq r2 = r2.f180898a     // Catch:{ all -> 0x0243 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r2)     // Catch:{ all -> 0x0243 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.d r0 = (com.google.speech.grammar.pumpkin.C66512d) r0     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrameManager r2 = r10.f180916e     // Catch:{ all -> 0x0243 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0243 }
            com.google.speech.grammar.pumpkin.ActionFrame r0 = r2.mo59649b(r0)     // Catch:{ all -> 0x0243 }
            r10.f275113d = r0     // Catch:{ all -> 0x0243 }
            goto L_0x01fd
        L_0x01e2:
            com.google.common.f.e r0 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0243 }
            java.lang.String r2 = "Failed to parse custom action config"
            r3 = 30760(0x7828, float:4.3104E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0243 }
            goto L_0x01fd
        L_0x01f0:
            com.google.common.f.e r0 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0243 }
            java.lang.String r2 = "Failed to load Monastery action config."
            r3 = 30762(0x782a, float:4.3107E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0243 }
        L_0x01fd:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f275118m     // Catch:{ all -> 0x0243 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250383cB     // Catch:{ all -> 0x0243 }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x023f
            java.lang.String r0 = "normalization.pumpkin"
            com.google.android.apps.gsa.languagepack.aj r2 = r10.f275119n     // Catch:{ all -> 0x0243 }
            android.content.Context r3 = r10.f275117l     // Catch:{ all -> 0x0243 }
            java.lang.String r4 = r10.f275116k     // Catch:{ all -> 0x0243 }
            java.lang.String r4 = m163199d(r4)     // Catch:{ all -> 0x0243 }
            java.io.File r2 = r2.b(r0, r3, r4)     // Catch:{ all -> 0x0243 }
            if (r2 == 0) goto L_0x021d
            r10.m163201j(r2)     // Catch:{ all -> 0x0243 }
            goto L_0x022a
        L_0x021d:
            com.google.common.f.e r2 = f275109h     // Catch:{ all -> 0x0243 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x0243 }
            java.lang.String r3 = "No %s file found in Language Pack which contains common character conversion rules."
            r4 = 30745(0x7819, float:4.3083E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56389s(r3, r0)     // Catch:{ all -> 0x0243 }
        L_0x022a:
            com.google.android.apps.gsa.languagepack.aj r0 = r10.f275119n     // Catch:{ all -> 0x0243 }
            java.lang.String r2 = "override_normalization.pumpkin"
            android.content.Context r3 = r10.f275117l     // Catch:{ all -> 0x0243 }
            java.lang.String r4 = r10.f275116k     // Catch:{ all -> 0x0243 }
            java.lang.String r4 = m163199d(r4)     // Catch:{ all -> 0x0243 }
            java.io.File r0 = r0.b(r2, r3, r4)     // Catch:{ all -> 0x0243 }
            if (r0 == 0) goto L_0x023f
            r10.m163201j(r0)     // Catch:{ all -> 0x0243 }
        L_0x023f:
            r10.f275120o = r1     // Catch:{ all -> 0x0243 }
            monitor-exit(r10)
            return
        L_0x0243:
            r0 = move-exception
            monitor-exit(r10)
            goto L_0x0247
        L_0x0246:
            throw r0
        L_0x0247:
            goto L_0x0246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7706ct.C98527a.mo59666e():void");
    }

    /* renamed from: f */
    public final boolean mo91161f() {
        return this.f275113d != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final byte[] mo91162g(File file) {
        try {
            return C90772bp.m148287N(this.f275114i, this.f275115j + '/' + file);
        } catch (IOException e) {
            throw e;
        }
    }
}
