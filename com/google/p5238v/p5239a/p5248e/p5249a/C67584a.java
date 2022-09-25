package com.google.p5238v.p5239a.p5248e.p5249a;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.C67902r;
import com.google.p5238v.p5239a.C67905u;
import com.google.p5238v.p5239a.C67906v;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.v.a.e.a.a */
/* compiled from: PG */
public final class C67584a {

    /* renamed from: a */
    public C67906v f183508a = null;

    /* renamed from: b */
    public String f183509b = null;

    /* renamed from: c */
    public C67902r f183510c = null;

    /* renamed from: d */
    public C67905u f183511d;

    /* renamed from: e */
    public C67589f f183512e = null;

    /* renamed from: f */
    private C67486a f183513f = null;

    /* renamed from: b */
    private final C67486a m97742b() {
        String str = C67585b.f183514a;
        C67587d dVar = new C67587d();
        boolean c = dVar.mo59934c(this.f183509b);
        if (!c) {
            try {
                String str2 = this.f183509b;
                if (!new C67587d().mo59934c(str2)) {
                    String d = C67870bp.m98086d(str2);
                    KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                    instance.init(new KeyGenParameterSpec.Builder(d, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                    instance.generateKey();
                } else {
                    throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str2}));
                }
            } catch (GeneralSecurityException | ProviderException e) {
                Log.w(C67585b.f183514a, "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        }
        try {
            return dVar.mo59932a(this.f183509b);
        } catch (GeneralSecurityException | ProviderException e2) {
            if (!c) {
                Log.w(C67585b.f183514a, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
            throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f183509b}), e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[ExcHandler: GeneralSecurityException (e java.security.GeneralSecurityException), Splitter:B:2:0x0004] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.p5238v.p5239a.C67905u m97743c() {
        /*
            r5 = this;
            com.google.v.a.a r0 = r5.f183513f
            if (r0 == 0) goto L_0x005e
            com.google.v.a.v r1 = r5.f183508a     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            r2 = 0
            byte[] r2 = new byte[r2]     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.v.a.e.a.e r1 = (com.google.p5238v.p5239a.p5248e.p5249a.C67588e) r1     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            byte[] r1 = r1.mo59935b()     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.v.a.j.cc r4 = com.google.p5238v.p5239a.p5255j.C67700cc.f183697c     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.v.a.j.cc r1 = (com.google.p5238v.p5239a.p5255j.C67700cc) r1     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            if (r1 == 0) goto L_0x004c
            com.google.protobuf.z r3 = r1.f183699a     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            int r3 = r3.mo59031d()     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            if (r3 == 0) goto L_0x004c
            com.google.v.a.t r3 = new com.google.v.a.t     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.protobuf.z r1 = r1.f183699a     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            byte[] r1 = r1.mo59174N()     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            byte[] r0 = r0.mo59877a(r1, r2)     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            com.google.v.a.j.de r2 = com.google.p5238v.p5239a.p5255j.C67729de.f183760c     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            com.google.v.a.j.de r0 = (com.google.p5238v.p5239a.p5255j.C67729de) r0     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            com.google.p5238v.p5239a.C67904t.m98169d(r0)     // Catch:{ ct -> 0x0044, GeneralSecurityException -> 0x0054 }
            r3.<init>(r0)     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            com.google.v.a.u r0 = com.google.p5238v.p5239a.C67905u.m98172b(r3)     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            return r0
        L_0x0044:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            java.lang.String r1 = "invalid keyset, corrupted key material"
            r0.<init>(r1)     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            throw r0     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
        L_0x004c:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            java.lang.String r1 = "empty keyset"
            r0.<init>(r1)     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
            throw r0     // Catch:{ ct -> 0x0056, GeneralSecurityException -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            goto L_0x0057
        L_0x0056:
            r0 = move-exception
        L_0x0057:
            java.lang.String r1 = com.google.p5238v.p5239a.p5248e.p5249a.C67585b.f183514a
            java.lang.String r2 = "cannot decrypt keyset: "
            android.util.Log.w(r1, r2, r0)
        L_0x005e:
            com.google.v.a.v r0 = r5.f183508a
            com.google.v.a.t r0 = com.google.p5238v.p5239a.C67545c.m97647a(r0)
            com.google.v.a.u r0 = com.google.p5238v.p5239a.C67905u.m98172b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5248e.p5249a.C67584a.m97743c():com.google.v.a.u");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00db */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.p5238v.p5239a.p5248e.p5249a.C67585b mo59930a() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = r7.f183509b     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x000b
            com.google.v.a.a r0 = r7.m97742b()     // Catch:{ all -> 0x011a }
            r7.f183513f = r0     // Catch:{ all -> 0x011a }
        L_0x000b:
            com.google.v.a.u r0 = r7.m97743c()     // Catch:{ FileNotFoundException -> 0x0011 }
            goto L_0x0101
        L_0x0011:
            r0 = move-exception
            java.lang.String r1 = com.google.p5238v.p5239a.p5248e.p5249a.C67585b.f183514a     // Catch:{ all -> 0x011a }
            r2 = 4
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x011a }
            r2 = 0
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = com.google.p5238v.p5239a.p5248e.p5249a.C67585b.f183514a     // Catch:{ all -> 0x011a }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x011a }
            r3[r2] = r0     // Catch:{ all -> 0x011a }
            java.lang.String r0 = "keyset not found, will generate a new one. %s"
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch:{ all -> 0x011a }
            android.util.Log.i(r1, r0)     // Catch:{ all -> 0x011a }
        L_0x0030:
            com.google.v.a.r r0 = r7.f183510c     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0112
            com.google.v.a.u r0 = new com.google.v.a.u     // Catch:{ all -> 0x011a }
            com.google.v.a.j.de r1 = com.google.p5238v.p5239a.p5255j.C67729de.f183760c     // Catch:{ all -> 0x011a }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x011a }
            com.google.v.a.j.db r1 = (com.google.p5238v.p5239a.p5255j.C67726db) r1     // Catch:{ all -> 0x011a }
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            com.google.v.a.r r1 = r7.f183510c     // Catch:{ all -> 0x011a }
            r0.mo60044c(r1)     // Catch:{ all -> 0x011a }
            com.google.v.a.t r1 = r0.mo60043a()     // Catch:{ all -> 0x011a }
            com.google.v.a.j.de r1 = r1.f184084a     // Catch:{ all -> 0x011a }
            com.google.v.a.j.di r1 = com.google.p5238v.p5239a.C67541al.m97641a(r1)     // Catch:{ all -> 0x011a }
            com.google.protobuf.cq r1 = r1.f183773b     // Catch:{ all -> 0x011a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x011a }
            com.google.v.a.j.dh r1 = (com.google.p5238v.p5239a.p5255j.C67732dh) r1     // Catch:{ all -> 0x011a }
            int r1 = r1.f183768c     // Catch:{ all -> 0x011a }
            r0.mo60046e(r1)     // Catch:{ all -> 0x011a }
            com.google.v.a.a r1 = r7.f183513f     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x00e3
            com.google.v.a.t r1 = r0.mo60043a()     // Catch:{ all -> 0x011a }
            com.google.v.a.e.a.f r3 = r7.f183512e     // Catch:{ all -> 0x011a }
            com.google.v.a.a r4 = r7.f183513f     // Catch:{ all -> 0x011a }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x011a }
            com.google.v.a.j.de r1 = r1.f184084a     // Catch:{ all -> 0x011a }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x011a }
            byte[] r5 = r4.mo59878b(r5, r2)     // Catch:{ all -> 0x011a }
            byte[] r2 = r4.mo59877a(r5, r2)     // Catch:{ ct -> 0x00db }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x00db }
            com.google.v.a.j.de r6 = com.google.p5238v.p5239a.p5255j.C67729de.f183760c     // Catch:{ ct -> 0x00db }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x00db }
            com.google.v.a.j.de r2 = (com.google.p5238v.p5239a.p5255j.C67729de) r2     // Catch:{ ct -> 0x00db }
            boolean r2 = r2.equals(r1)     // Catch:{ ct -> 0x00db }
            if (r2 == 0) goto L_0x00d3
            com.google.v.a.j.cc r2 = com.google.p5238v.p5239a.p5255j.C67700cc.f183697c     // Catch:{ all -> 0x011a }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x011a }
            com.google.v.a.j.cb r2 = (com.google.p5238v.p5239a.p5255j.C67699cb) r2     // Catch:{ all -> 0x011a }
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96139A(r5)     // Catch:{ all -> 0x011a }
            r2.copyOnWrite()     // Catch:{ all -> 0x011a }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x011a }
            com.google.v.a.j.cc r5 = (com.google.p5238v.p5239a.p5255j.C67700cc) r5     // Catch:{ all -> 0x011a }
            r5.f183699a = r4     // Catch:{ all -> 0x011a }
            com.google.v.a.j.di r1 = com.google.p5238v.p5239a.C67541al.m97641a(r1)     // Catch:{ all -> 0x011a }
            r2.copyOnWrite()     // Catch:{ all -> 0x011a }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x011a }
            com.google.v.a.j.cc r4 = (com.google.p5238v.p5239a.p5255j.C67700cc) r4     // Catch:{ all -> 0x011a }
            r1.getClass()     // Catch:{ all -> 0x011a }
            r4.f183700b = r1     // Catch:{ all -> 0x011a }
            com.google.protobuf.bv r1 = r2.build()     // Catch:{ all -> 0x011a }
            com.google.v.a.j.cc r1 = (com.google.p5238v.p5239a.p5255j.C67700cc) r1     // Catch:{ all -> 0x011a }
            android.content.SharedPreferences$Editor r2 = r3.f183522a     // Catch:{ all -> 0x011a }
            java.lang.String r3 = r3.f183523b     // Catch:{ all -> 0x011a }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x011a }
            java.lang.String r1 = com.google.p5238v.p5239a.p5259m.C67849av.m98040a(r1)     // Catch:{ all -> 0x011a }
            android.content.SharedPreferences$Editor r1 = r2.putString(r3, r1)     // Catch:{ all -> 0x011a }
            boolean r1 = r1.commit()     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x00cb
            goto L_0x0101
        L_0x00cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "Failed to write to SharedPreferences"
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x00d3:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ ct -> 0x00db }
            java.lang.String r1 = "cannot encrypt keyset"
            r0.<init>(r1)     // Catch:{ ct -> 0x00db }
            throw r0     // Catch:{ ct -> 0x00db }
        L_0x00db:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "invalid keyset, corrupted key material"
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x00e3:
            com.google.v.a.t r1 = r0.mo60043a()     // Catch:{ all -> 0x011a }
            com.google.v.a.e.a.f r2 = r7.f183512e     // Catch:{ all -> 0x011a }
            com.google.v.a.j.de r1 = r1.f184084a     // Catch:{ all -> 0x011a }
            android.content.SharedPreferences$Editor r3 = r2.f183522a     // Catch:{ all -> 0x011a }
            java.lang.String r2 = r2.f183523b     // Catch:{ all -> 0x011a }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x011a }
            java.lang.String r1 = com.google.p5238v.p5239a.p5259m.C67849av.m98040a(r1)     // Catch:{ all -> 0x011a }
            android.content.SharedPreferences$Editor r1 = r3.putString(r2, r1)     // Catch:{ all -> 0x011a }
            boolean r1 = r1.commit()     // Catch:{ all -> 0x011a }
            if (r1 == 0) goto L_0x010a
        L_0x0101:
            r7.f183511d = r0     // Catch:{ all -> 0x011a }
            com.google.v.a.e.a.b r0 = new com.google.v.a.e.a.b     // Catch:{ all -> 0x011a }
            r0.<init>(r7)     // Catch:{ all -> 0x011a }
            monitor-exit(r7)
            return r0
        L_0x010a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "Failed to write to SharedPreferences"
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x0112:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "cannot read or generate keyset"
            r0.<init>(r1)     // Catch:{ all -> 0x011a }
            throw r0     // Catch:{ all -> 0x011a }
        L_0x011a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p5238v.p5239a.p5248e.p5249a.C67584a.mo59930a():com.google.v.a.e.a.b");
    }
}
