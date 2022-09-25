package com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79937al;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80008e;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112557l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113344co;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.e.c.e */
/* compiled from: PG */
public final class C111771e implements C111772f {

    /* renamed from: a */
    public static final C59071e f310669a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.e.c.e");

    /* renamed from: b */
    private final Context f310670b;

    /* renamed from: c */
    private final C112557l f310671c;

    /* renamed from: d */
    private final C22871g f310672d;

    public C111771e(Context context, C112557l lVar, C22871g gVar) {
        this.f310670b = context;
        this.f310671c = lVar;
        this.f310672d = gVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0069 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File mo99226a(com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8526a.C111765b r7, java.lang.String r8) {
        /*
            r6 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r6.f310670b
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = ".tmp"
            java.lang.String r2 = r8.concat(r2)
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            android.content.Context r2 = r6.f310670b
            java.io.File r2 = r2.getFilesDir()
            r1.<init>(r2, r8)
            r1.delete()
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006a }
            r8.<init>(r0)     // Catch:{ IOException -> 0x006a }
            r2 = 0
            r3 = 1
            r7.writeTo(r8)     // Catch:{ all -> 0x004e }
            r8.close()     // Catch:{ IOException -> 0x006a }
            java.nio.file.Path r7 = r0.toPath()     // Catch:{ IOException -> 0x003e }
            java.nio.file.Path r8 = r1.toPath()     // Catch:{ IOException -> 0x003e }
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r3]     // Catch:{ IOException -> 0x003e }
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch:{ IOException -> 0x003e }
            r0[r2] = r3     // Catch:{ IOException -> 0x003e }
            java.nio.file.Files.move(r7, r8, r0)     // Catch:{ IOException -> 0x003e }
            return r1
        L_0x003e:
            r7 = move-exception
            java.lang.String r8 = "Failed to move to: "
            java.lang.String r0 = r1.toString()
            java.lang.String r8 = r8.concat(r0)
            java.lang.AssertionError r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.e$$ExternalSyntheticBackport0.m185599m(r8, r7)
            throw r7
        L_0x004e:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0069
        L_0x0053:
            r8 = move-exception
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0069 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r1[r2] = r4     // Catch:{ Exception -> 0x0069 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r1 = r4.getDeclaredMethod(r5, r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0069 }
            r3[r2] = r8     // Catch:{ Exception -> 0x0069 }
            r1.invoke(r7, r3)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            throw r7     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            r7 = move-exception
            java.lang.String r8 = "Failed to write to: "
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = r8.concat(r0)
            java.lang.AssertionError r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.e$$ExternalSyntheticBackport0.m185599m(r8, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8525e.p8529c.C111771e.mo99226a(com.google.android.apps.gsa.staticplugins.opa.tapas.e.a.b, java.lang.String):java.io.File");
    }

    /* renamed from: b */
    public final void mo99227b(List list, String str) {
        C80008e eVar = (C80008e) C80012i.f219558i.createBuilder();
        eVar.copyOnWrite();
        C80012i iVar = (C80012i) eVar.instance;
        str.getClass();
        iVar.f219561a |= 2;
        iVar.f219562b = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String valueOf = String.valueOf(((Suggestion) it.next()).f108908i);
            C79937al alVar = (C79937al) C79938am.f219175F.createBuilder();
            alVar.copyOnWrite();
            C79938am amVar = (C79938am) alVar.instance;
            valueOf.getClass();
            amVar.f219182a |= 1;
            amVar.f219183b = valueOf;
            eVar.mo74275a(alVar);
        }
        this.f310672d.mo28212l("[EvalLogger] logAutocompleteSuggestions", new C111767a(this, eVar));
    }

    /* renamed from: c */
    public final void mo99228c(C113408es esVar, List list, String str, Optional optional) {
        C80008e eVar = (C80008e) C80012i.f219558i.createBuilder();
        eVar.copyOnWrite();
        C80012i iVar = (C80012i) eVar.instance;
        str.getClass();
        iVar.f219561a |= 2;
        iVar.f219562b = str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C113344co coVar = (C113344co) it.next();
            for (C113415ez a : coVar.f313868b) {
                eVar.mo74275a(this.f310671c.mo99586a(coVar.f313867a, a));
            }
        }
        new C90873ag((C60870cx) ((C58881cr) optional.orElse(C111768b.f310664a)).mo6453a(), this.f310672d, "[EvalLogger] logAutocomplete", new C111769c(this, eVar, esVar)).mo85223a(C111770d.f310668a);
    }
}
