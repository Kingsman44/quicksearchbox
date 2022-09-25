package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.p060c.C0977g;
import androidx.p060c.C0983m;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.measurement.p10848a.C145144av;
import com.google.android.gms.measurement.p10848a.C145146ax;
import com.google.android.gms.measurement.p10848a.C145148az;
import com.google.android.gms.measurement.p10848a.C145153bd;
import com.google.android.gms.measurement.p10848a.C145169r;
import com.google.android.gms.measurement.p10848a.C145170s;
import com.google.android.gms.measurement.p10848a.C145171t;
import com.google.android.gms.measurement.p10848a.C145172u;
import com.google.android.gms.measurement.p10848a.C145173v;
import com.google.android.gms.measurement.p10848a.C145175x;
import com.google.p4583d.p4584a.C60969c;
import com.google.p4583d.p4584a.C60973d;
import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4588d.C60978e;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ew */
/* compiled from: PG */
public final class C145351ew extends C145478jo implements C145221aa {

    /* renamed from: a */
    public final Map f392888a = new C0977g();

    /* renamed from: b */
    final Map f392889b = new C0977g();

    /* renamed from: c */
    final Map f392890c = new C0977g();

    /* renamed from: d */
    final Map f392891d = new C0977g();

    /* renamed from: e */
    public final Map f392892e = new C0977g();

    /* renamed from: f */
    public final Map f392893f = new C0977g();

    /* renamed from: g */
    final C0983m f392894g = new C145348et(this);

    /* renamed from: h */
    public final Map f392895h = new C0977g();

    /* renamed from: i */
    public final Map f392896i = new C0977g();

    /* renamed from: j */
    public final Map f392897j = new C0977g();

    /* renamed from: k */
    final C145349eu f392898k = new C145349eu(this);

    public C145351ew(C145488jy jyVar) {
        super(jyVar);
    }

    /* renamed from: n */
    private final C145173v m236153n(String str, byte[] bArr) {
        if (bArr == null) {
            return C145173v.f392387k;
        }
        try {
            C145173v vVar = (C145173v) ((C145172u) C145491ka.m236458k((C145172u) C145173v.f392387k.createBuilder(), bArr)).build();
            C145323dv dvVar = this.f393011w.mo120965ar().f392803k;
            int i = vVar.f392389a;
            String str2 = null;
            Long valueOf = (i & 1) != 0 ? Long.valueOf(vVar.f392390b) : null;
            if ((i & 2) != 0) {
                str2 = vVar.f392391c;
            }
            dvVar.mo120896c("Parsed config. version, gmp_app_id", valueOf, str2);
            return vVar;
        } catch (C62974ct e) {
            this.f393011w.mo120965ar().f392798f.mo120896c("Unable to merge remote config. appId", C145325dx.m236116a(str), e);
            return C145173v.f392387k;
        } catch (RuntimeException e2) {
            this.f393011w.mo120965ar().f392798f.mo120896c("Unable to merge remote config. appId", C145325dx.m236116a(str), e2);
            return C145173v.f392387k;
        }
    }

    /* renamed from: o */
    private final void m236154o(String str, C145172u uVar) {
        HashSet hashSet = new HashSet();
        C0977g gVar = new C0977g();
        C0977g gVar2 = new C0977g();
        C0977g gVar3 = new C0977g();
        if (uVar != null) {
            for (C145169r rVar : Collections.unmodifiableList(((C145173v) uVar.instance).f392397i)) {
                hashSet.add(rVar.f392378a);
            }
            for (int i = 0; i < ((C145173v) uVar.instance).f392393e.size(); i++) {
                C145170s sVar = (C145170s) ((C145171t) ((C145173v) uVar.instance).f392393e.get(i)).toBuilder();
                if (((C145171t) sVar.instance).f392383b.isEmpty()) {
                    this.f393011w.mo120965ar().f392798f.mo120894a("EventConfig contained null event name");
                } else {
                    String str2 = ((C145171t) sVar.instance).f392383b;
                    String b = C145385gc.m236291b(str2);
                    if (!TextUtils.isEmpty(b)) {
                        sVar.copyOnWrite();
                        C145171t tVar = (C145171t) sVar.instance;
                        b.getClass();
                        tVar.f392382a |= 1;
                        tVar.f392383b = b;
                        uVar.copyOnWrite();
                        C145173v vVar = (C145173v) uVar.instance;
                        C145171t tVar2 = (C145171t) sVar.build();
                        tVar2.getClass();
                        C62971cq cqVar = vVar.f392393e;
                        if (!cqVar.mo58948c()) {
                            vVar.f392393e = C62942bv.mutableCopy(cqVar);
                        }
                        vVar.f392393e.set(i, tVar2);
                    }
                    C145171t tVar3 = (C145171t) sVar.instance;
                    if ((tVar3.f392382a & 2) != 0 && tVar3.f392384c) {
                        gVar.put(str2, true);
                    }
                    C145171t tVar4 = (C145171t) sVar.instance;
                    if ((tVar4.f392382a & 4) != 0 && tVar4.f392385d) {
                        gVar2.put(tVar4.f392383b, true);
                    }
                    C145171t tVar5 = (C145171t) sVar.instance;
                    if ((tVar5.f392382a & 8) != 0) {
                        int i2 = tVar5.f392386e;
                        if (i2 < 2 || i2 > 65535) {
                            C145323dv dvVar = this.f393011w.mo120965ar().f392798f;
                            C145171t tVar6 = (C145171t) sVar.instance;
                            dvVar.mo120896c("Invalid sampling rate. Event name, sample rate", tVar6.f392383b, Integer.valueOf(tVar6.f392386e));
                        } else {
                            gVar3.put(tVar5.f392383b, Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        this.f392889b.put(str, hashSet);
        this.f392890c.put(str, gVar);
        this.f392891d.put(str, gVar2);
        this.f392893f.put(str, gVar3);
    }

    /* renamed from: p */
    private static final Map m236155p(C145173v vVar) {
        C0977g gVar = new C0977g();
        if (vVar != null) {
            for (C145175x xVar : vVar.f392392d) {
                gVar.put(xVar.f392401a, xVar.f392402b);
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public final String mo120764a(String str, String str2) {
        mo120904g();
        mo120939d(str);
        Map map = (Map) this.f392888a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C145173v mo120938b(String str) {
        mo121194J();
        mo120904g();
        C143919bh.m233969l(str);
        mo120939d(str);
        return (C145173v) this.f392892e.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r2 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0130  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120939d(java.lang.String r14) {
        /*
            r13 = this;
            r13.mo121194J()
            r13.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r14)
            java.util.Map r0 = r13.f392892e
            java.lang.Object r0 = r0.get(r14)
            if (r0 != 0) goto L_0x0134
            com.google.android.gms.measurement.internal.jy r0 = r13.f393327l
            com.google.android.gms.measurement.internal.ah r0 = r0.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r0)
            com.google.android.gms.common.internal.C143919bh.m233969l(r14)
            r0.mo120904g()
            r0.mo121194J()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.mo120806d()     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r3 = 3
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r3 = "remote_config"
            r10 = 0
            r4[r10] = r3     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r3 = "config_last_modified_time"
            r11 = 1
            r4[r11] = r3     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r3 = "e_tag"
            r12 = 2
            r4[r12] = r3     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String[] r6 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            r6[r10] = r14     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0096, all -> 0x0093 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0091 }
            if (r3 != 0) goto L_0x0050
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0050:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r4 = r2.getString(r11)     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.measurement.internal.ff r5 = r0.f393011w     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.measurement.internal.ab r5 = r5.f392937g     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.measurement.internal.dk r6 = com.google.android.gms.measurement.internal.C145313dl.f392730aj     // Catch:{ SQLiteException -> 0x0091 }
            boolean r5 = r5.mo120776m(r1, r6)     // Catch:{ SQLiteException -> 0x0091 }
            if (r5 == 0) goto L_0x0069
            java.lang.String r5 = r2.getString(r12)     // Catch:{ SQLiteException -> 0x0091 }
            goto L_0x006a
        L_0x0069:
            r5 = r1
        L_0x006a:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0091 }
            if (r6 == 0) goto L_0x0081
            com.google.android.gms.measurement.internal.ff r6 = r0.f393011w     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.measurement.internal.dx r6 = r6.mo120965ar()     // Catch:{ SQLiteException -> 0x0091 }
            com.google.android.gms.measurement.internal.dv r6 = r6.f392795c     // Catch:{ SQLiteException -> 0x0091 }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r14)     // Catch:{ SQLiteException -> 0x0091 }
            r6.mo120895b(r7, r8)     // Catch:{ SQLiteException -> 0x0091 }
        L_0x0081:
            if (r3 != 0) goto L_0x0086
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0086:
            com.google.android.gms.measurement.internal.ae r6 = new com.google.android.gms.measurement.internal.ae     // Catch:{ SQLiteException -> 0x0091 }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x0091 }
            if (r2 == 0) goto L_0x00b0
            r2.close()
            goto L_0x00b0
        L_0x0091:
            r3 = move-exception
            goto L_0x0099
        L_0x0093:
            r14 = move-exception
            goto L_0x012e
        L_0x0096:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0099:
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x012c }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ all -> 0x012c }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r14)     // Catch:{ all -> 0x012c }
            r0.mo120896c(r4, r5, r3)     // Catch:{ all -> 0x012c }
            if (r2 == 0) goto L_0x00af
        L_0x00ac:
            r2.close()
        L_0x00af:
            r6 = r1
        L_0x00b0:
            if (r6 != 0) goto L_0x00e0
            java.util.Map r0 = r13.f392888a
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392890c
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392889b
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392891d
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392892e
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392895h
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392896i
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392897j
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392893f
            r0.put(r14, r1)
            return
        L_0x00e0:
            byte[] r0 = r6.f392560a
            com.google.android.gms.measurement.a.v r0 = r13.m236153n(r14, r0)
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.gms.measurement.a.u r0 = (com.google.android.gms.measurement.p10848a.C145172u) r0
            r13.m236154o(r14, r0)
            java.util.Map r1 = r13.f392888a
            com.google.protobuf.bv r2 = r0.build()
            com.google.android.gms.measurement.a.v r2 = (com.google.android.gms.measurement.p10848a.C145173v) r2
            java.util.Map r2 = m236155p(r2)
            r1.put(r14, r2)
            java.util.Map r1 = r13.f392892e
            com.google.protobuf.bv r2 = r0.build()
            com.google.android.gms.measurement.a.v r2 = (com.google.android.gms.measurement.p10848a.C145173v) r2
            r1.put(r14, r2)
            com.google.protobuf.bv r1 = r0.build()
            com.google.android.gms.measurement.a.v r1 = (com.google.android.gms.measurement.p10848a.C145173v) r1
            r13.mo120940e(r14, r1)
            java.util.Map r1 = r13.f392895h
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.gms.measurement.a.v r0 = (com.google.android.gms.measurement.p10848a.C145173v) r0
            java.lang.String r0 = r0.f392398j
            r1.put(r14, r0)
            java.util.Map r0 = r13.f392896i
            java.lang.String r1 = r6.f392561b
            r0.put(r14, r1)
            java.util.Map r0 = r13.f392897j
            java.lang.String r1 = r6.f392562c
            r0.put(r14, r1)
            return
        L_0x012c:
            r14 = move-exception
            r1 = r2
        L_0x012e:
            if (r1 == 0) goto L_0x0133
            r1.close()
        L_0x0133:
            throw r14
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145351ew.mo120939d(java.lang.String):void");
    }

    /* renamed from: e */
    public final void mo120940e(String str, C145173v vVar) {
        C60980g gVar;
        if (vVar.f392396h.size() != 0) {
            this.f393011w.mo120965ar().f392803k.mo120895b("EES programs found", Integer.valueOf(vVar.f392396h.size()));
            C145148az azVar = (C145148az) vVar.f392396h.get(0);
            try {
                C60969c cVar = new C60969c();
                cVar.f165085a.f165144d.mo57450a("internal.remoteConfig", new C145345eq(this, str));
                cVar.f165085a.f165144d.mo57450a("internal.appMetadata", new C145346er(this, str));
                cVar.f165085a.f165144d.mo57450a("internal.logger", new C145347es(this));
                cVar.f165086b = cVar.f165085a.f165142b.mo57525a();
                if (!(cVar.f165085a.mo57523a(cVar.f165086b, (C145153bd[]) azVar.f392314a.toArray(new C145153bd[0])) instanceof C60978e)) {
                    C145144av avVar = azVar.f392315b;
                    if (avVar == null) {
                        avVar = C145144av.f392304b;
                    }
                    for (C145146ax axVar : avVar.f392306a) {
                        C62971cq cqVar = axVar.f392310b;
                        String str2 = axVar.f392309a;
                        Iterator it = cqVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C60987n a = cVar.f165085a.mo57523a(cVar.f165086b, (C145153bd) it.next());
                                if (a instanceof C60984k) {
                                    C61012g gVar2 = cVar.f165086b;
                                    if (!gVar2.mo57531g(str2)) {
                                        gVar = null;
                                    } else {
                                        C60987n c = gVar2.mo57527c(str2);
                                        if (c instanceof C60980g) {
                                            gVar = (C60980g) c;
                                        } else {
                                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(str2)));
                                        }
                                    }
                                    if (gVar != null) {
                                        gVar.mo57451a(cVar.f165086b, Collections.singletonList(a));
                                    } else {
                                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(str2)));
                                    }
                                } else {
                                    throw new IllegalArgumentException("Invalid rule definition");
                                }
                            }
                        }
                    }
                    this.f392894g.mo3691e(str, cVar);
                    C145323dv dvVar = this.f393011w.mo120965ar().f392803k;
                    C145144av avVar2 = azVar.f392315b;
                    if (avVar2 == null) {
                        avVar2 = C145144av.f392304b;
                    }
                    dvVar.mo120896c("EES program loaded for appId, activities", str, Integer.valueOf(avVar2.f392306a.size()));
                    C145144av avVar3 = azVar.f392315b;
                    if (avVar3 == null) {
                        avVar3 = C145144av.f392304b;
                    }
                    for (C145146ax axVar2 : avVar3.f392306a) {
                        this.f393011w.mo120965ar().f392803k.mo120895b("EES program activity", axVar2.f392309a);
                    }
                    return;
                }
                throw new IllegalStateException("Program loading failed");
            } catch (C60973d unused) {
                this.f393011w.mo120965ar().f392795c.mo120895b("Failed to load EES program. appId", str);
            } catch (Throwable th) {
                throw new C60973d(th);
            }
        } else {
            this.f392894g.mo3695i(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo120941f(String str) {
        mo120904g();
        C145173v b = mo120938b(str);
        if (b == null) {
            return false;
        }
        return b.f392395g;
    }

    /* renamed from: h */
    public final boolean mo120942h(String str) {
        C145173v vVar;
        if (TextUtils.isEmpty(str) || (vVar = (C145173v) this.f392892e.get(str)) == null || vVar.f392396h.size() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo120943i(String str) {
        return "1".equals(mo120764a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo120944j(String str, String str2) {
        Boolean bool;
        mo120904g();
        mo120939d(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f392891d.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo120945k(String str, String str2) {
        Boolean bool;
        mo120904g();
        mo120939d(str);
        if (mo120943i(str) && C145495ke.m236485ad(str2)) {
            return true;
        }
        if (mo120946l(str) && C145495ke.m236486ae(str2)) {
            return true;
        }
        Map map = (Map) this.f392890c.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo120946l(String str) {
        return "1".equals(mo120764a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x03e0, code lost:
        r0 = r10.f393011w.mo120965ar().f392798f;
        r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27);
        r9 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03f6, code lost:
        if ((r3.f392361a & 1) == 0) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03f8, code lost:
        r3 = java.lang.Integer.valueOf(r3.f392362b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03ff, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0400, code lost:
        r0.mo120897d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0409, code lost:
        r8 = r3.toByteArray();
        r9 = new android.content.ContentValues();
        r9.put("app_id", r2);
        r24 = r0;
        r9.put(r5, java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0424, code lost:
        if ((r3.f392361a & 1) == 0) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0426, code lost:
        r0 = java.lang.Integer.valueOf(r3.f392362b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x042d, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x042e, code lost:
        r9.put("filter_id", r0);
        r25 = r5;
        r9.put("property_name", r3.f392363c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x043e, code lost:
        if ((r3.f392361a & 32) == 0) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0440, code lost:
        r0 = java.lang.Boolean.valueOf(r3.f392367g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0447, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0448, code lost:
        r9.put("session_scoped", r0);
        r9.put("data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x045c, code lost:
        if (r10.mo120806d().insertWithOnConflict("property_filters", (java.lang.String) null, r9, 5) != -1) goto L_0x0470;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x045e, code lost:
        r10.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C145325dx.m236116a(r27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0470, code lost:
        r0 = r24;
        r5 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0476, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r10.f393011w.mo120965ar().f392795c.mo120896c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C145325dx.m236116a(r27), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02b0, code lost:
        r8 = r0.f392321c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02ba, code lost:
        if (r8.hasNext() == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x02c6, code lost:
        if ((((com.google.android.gms.measurement.p10848a.C145163l) r8.next()).f392361a & 1) != 0) goto L_0x02b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02c8, code lost:
        r10.f393011w.mo120965ar().f392798f.mo120896c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C145325dx.m236116a(r27), java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02de, code lost:
        r8 = r0.f392322d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02e8, code lost:
        r5 = "audience_id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02f2, code lost:
        if (r8.hasNext() == false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r9 = (com.google.android.gms.measurement.p10848a.C145155d) r8.next();
        r10.mo121194J();
        r10.mo120904g();
        com.google.android.gms.common.internal.C143919bh.m233969l(r27);
        com.google.android.gms.common.internal.C143919bh.m233958a(r9);
        r23 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x030e, code lost:
        if (r9.f392337c.isEmpty() == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0310, code lost:
        r0 = r10.f393011w.mo120965ar().f392798f;
        r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27);
        r8 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0326, code lost:
        if ((r9.f392335a & 1) == 0) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0328, code lost:
        r19 = java.lang.Integer.valueOf(r9.f392336b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0331, code lost:
        r19 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0333, code lost:
        r0.mo120897d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r5, r8, java.lang.String.valueOf(r19));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x033c, code lost:
        r3 = r9.toByteArray();
        r24 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r2);
        r8.put(r5, java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0355, code lost:
        if ((r9.f392335a & 1) == 0) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0357, code lost:
        r5 = java.lang.Integer.valueOf(r9.f392336b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x035e, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x035f, code lost:
        r8.put("filter_id", r5);
        r8.put("event_name", r9.f392337c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x036d, code lost:
        if ((r9.f392335a & 64) == 0) goto L_0x0376;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x036f, code lost:
        r5 = java.lang.Boolean.valueOf(r9.f392342h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0376, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0377, code lost:
        r8.put("session_scoped", r5);
        r8.put("data", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x038b, code lost:
        if (r10.mo120806d().insertWithOnConflict(r4, (java.lang.String) null, r8, 5) != -1) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x038d, code lost:
        r10.f393011w.mo120965ar().f392795c.mo120895b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C145325dx.m236116a(r27));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039e, code lost:
        r3 = r23;
        r8 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03b8, code lost:
        r23 = r3;
        r0 = r0.f392321c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03c4, code lost:
        if (r0.hasNext() == false) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03c6, code lost:
        r3 = (com.google.android.gms.measurement.p10848a.C145163l) r0.next();
        r10.mo121194J();
        r10.mo120904g();
        com.google.android.gms.common.internal.C143919bh.m233969l(r27);
        com.google.android.gms.common.internal.C143919bh.m233958a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03de, code lost:
        if (r3.f392363c.isEmpty() == false) goto L_0x0409;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0632 A[Catch:{ SQLiteException -> 0x0644 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120947m(java.lang.String r27, byte[] r28, java.lang.String r29, java.lang.String r30) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r29
            r4 = r30
            java.lang.String r5 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r6 = "event_filters"
            java.lang.String r7 = "property_filters"
            r26.mo121194J()
            r26.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)
            com.google.android.gms.measurement.a.v r8 = r26.m236153n(r27, r28)
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.gms.measurement.a.u r8 = (com.google.android.gms.measurement.p10848a.C145172u) r8
            r9 = 0
            if (r8 != 0) goto L_0x0027
            return r9
        L_0x0027:
            r1.m236154o(r2, r8)
            com.google.protobuf.bv r10 = r8.build()
            com.google.android.gms.measurement.a.v r10 = (com.google.android.gms.measurement.p10848a.C145173v) r10
            r1.mo120940e(r2, r10)
            java.util.Map r10 = r1.f392892e
            com.google.protobuf.bv r11 = r8.build()
            com.google.android.gms.measurement.a.v r11 = (com.google.android.gms.measurement.p10848a.C145173v) r11
            r10.put(r2, r11)
            java.util.Map r10 = r1.f392895h
            com.google.protobuf.bv r11 = r8.instance
            com.google.android.gms.measurement.a.v r11 = (com.google.android.gms.measurement.p10848a.C145173v) r11
            java.lang.String r11 = r11.f392398j
            r10.put(r2, r11)
            java.util.Map r10 = r1.f392896i
            r10.put(r2, r3)
            java.util.Map r10 = r1.f392897j
            r10.put(r2, r4)
            java.util.Map r10 = r1.f392888a
            com.google.protobuf.bv r11 = r8.build()
            com.google.android.gms.measurement.a.v r11 = (com.google.android.gms.measurement.p10848a.C145173v) r11
            java.util.Map r11 = m236155p(r11)
            r10.put(r2, r11)
            com.google.android.gms.measurement.internal.jy r10 = r1.f393327l
            com.google.android.gms.measurement.internal.ah r10 = r10.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            com.google.protobuf.bv r12 = r8.instance
            com.google.android.gms.measurement.a.v r12 = (com.google.android.gms.measurement.p10848a.C145173v) r12
            com.google.protobuf.cq r12 = r12.f392394f
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.<init>(r12)
            r12 = 0
        L_0x0079:
            int r13 = r11.size()
            if (r12 >= r13) goto L_0x0229
            java.lang.Object r13 = r11.get(r12)
            com.google.android.gms.measurement.a.b r13 = (com.google.android.gms.measurement.p10848a.C145149b) r13
            com.google.protobuf.bn r13 = r13.toBuilder()
            com.google.android.gms.measurement.a.a r13 = (com.google.android.gms.measurement.p10848a.C145122a) r13
            com.google.protobuf.bv r9 = r13.instance
            com.google.android.gms.measurement.a.b r9 = (com.google.android.gms.measurement.p10848a.C145149b) r9
            com.google.protobuf.cq r9 = r9.f392322d
            int r9 = r9.size()
            if (r9 == 0) goto L_0x019b
            r15 = r13
            r9 = 0
        L_0x0099:
            com.google.protobuf.bv r14 = r15.instance
            com.google.android.gms.measurement.a.b r14 = (com.google.android.gms.measurement.p10848a.C145149b) r14
            com.google.protobuf.cq r14 = r14.f392322d
            int r14 = r14.size()
            if (r9 >= r14) goto L_0x0194
            com.google.protobuf.bv r14 = r15.instance
            com.google.android.gms.measurement.a.b r14 = (com.google.android.gms.measurement.p10848a.C145149b) r14
            com.google.protobuf.cq r14 = r14.f392322d
            java.lang.Object r14 = r14.get(r9)
            com.google.android.gms.measurement.a.d r14 = (com.google.android.gms.measurement.p10848a.C145155d) r14
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.android.gms.measurement.a.c r14 = (com.google.android.gms.measurement.p10848a.C145154c) r14
            com.google.protobuf.bn r18 = r14.clone()
            r4 = r18
            com.google.android.gms.measurement.a.c r4 = (com.google.android.gms.measurement.p10848a.C145154c) r4
            com.google.protobuf.bv r3 = r14.instance
            com.google.android.gms.measurement.a.d r3 = (com.google.android.gms.measurement.p10848a.C145155d) r3
            java.lang.String r3 = r3.f392337c
            java.lang.String r3 = com.google.android.gms.measurement.internal.C145385gc.m236291b(r3)
            if (r3 == 0) goto L_0x00e0
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.android.gms.measurement.a.d r1 = (com.google.android.gms.measurement.p10848a.C145155d) r1
            r18 = r8
            int r8 = r1.f392335a
            r17 = 2
            r8 = r8 | 2
            r1.f392335a = r8
            r1.f392337c = r3
            r1 = 1
            goto L_0x00e3
        L_0x00e0:
            r18 = r8
            r1 = 0
        L_0x00e3:
            r3 = r1
            r1 = 0
        L_0x00e5:
            com.google.protobuf.bv r8 = r14.instance
            com.google.android.gms.measurement.a.d r8 = (com.google.android.gms.measurement.p10848a.C145155d) r8
            com.google.protobuf.cq r8 = r8.f392338d
            int r8 = r8.size()
            if (r1 >= r8) goto L_0x0151
            com.google.protobuf.bv r8 = r14.instance
            com.google.android.gms.measurement.a.d r8 = (com.google.android.gms.measurement.p10848a.C145155d) r8
            com.google.protobuf.cq r8 = r8.f392338d
            java.lang.Object r8 = r8.get(r1)
            com.google.android.gms.measurement.a.f r8 = (com.google.android.gms.measurement.p10848a.C145157f) r8
            r19 = r14
            java.lang.String r14 = r8.f392349e
            r20 = r5
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C145386gd.f393048a
            r21 = r6
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.C145386gd.f393049b
            java.lang.String r5 = com.google.android.gms.measurement.internal.C145422hm.m236341a(r14, r5, r6)
            if (r5 == 0) goto L_0x0148
            com.google.protobuf.bn r3 = r8.toBuilder()
            com.google.android.gms.measurement.a.e r3 = (com.google.android.gms.measurement.p10848a.C145156e) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.gms.measurement.a.f r6 = (com.google.android.gms.measurement.p10848a.C145157f) r6
            int r8 = r6.f392345a
            r8 = r8 | 8
            r6.f392345a = r8
            r6.f392349e = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.gms.measurement.a.f r3 = (com.google.android.gms.measurement.p10848a.C145157f) r3
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.gms.measurement.a.d r5 = (com.google.android.gms.measurement.p10848a.C145155d) r5
            r3.getClass()
            com.google.protobuf.cq r6 = r5.f392338d
            boolean r8 = r6.mo58948c()
            if (r8 != 0) goto L_0x0142
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r5.f392338d = r6
        L_0x0142:
            com.google.protobuf.cq r5 = r5.f392338d
            r5.set(r1, r3)
            r3 = 1
        L_0x0148:
            int r1 = r1 + 1
            r14 = r19
            r5 = r20
            r6 = r21
            goto L_0x00e5
        L_0x0151:
            r20 = r5
            r21 = r6
            if (r3 == 0) goto L_0x0184
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.gms.measurement.a.b r1 = (com.google.android.gms.measurement.p10848a.C145149b) r1
            com.google.protobuf.bv r3 = r4.build()
            com.google.android.gms.measurement.a.d r3 = (com.google.android.gms.measurement.p10848a.C145155d) r3
            r3.getClass()
            com.google.protobuf.cq r4 = r1.f392322d
            boolean r5 = r4.mo58948c()
            if (r5 != 0) goto L_0x0175
            com.google.protobuf.cq r4 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r4)
            r1.f392322d = r4
        L_0x0175:
            com.google.protobuf.cq r1 = r1.f392322d
            r1.set(r9, r3)
            com.google.protobuf.bv r1 = r13.build()
            com.google.android.gms.measurement.a.b r1 = (com.google.android.gms.measurement.p10848a.C145149b) r1
            r11.set(r12, r1)
            r15 = r13
        L_0x0184:
            int r9 = r9 + 1
            r1 = r26
            r3 = r29
            r4 = r30
            r8 = r18
            r5 = r20
            r6 = r21
            goto L_0x0099
        L_0x0194:
            r20 = r5
            r21 = r6
            r18 = r8
            goto L_0x01a2
        L_0x019b:
            r20 = r5
            r21 = r6
            r18 = r8
            r15 = r13
        L_0x01a2:
            com.google.protobuf.bv r1 = r15.instance
            com.google.android.gms.measurement.a.b r1 = (com.google.android.gms.measurement.p10848a.C145149b) r1
            com.google.protobuf.cq r1 = r1.f392321c
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0218
            r1 = 0
        L_0x01af:
            com.google.protobuf.bv r3 = r15.instance
            com.google.android.gms.measurement.a.b r3 = (com.google.android.gms.measurement.p10848a.C145149b) r3
            com.google.protobuf.cq r3 = r3.f392321c
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0218
            com.google.protobuf.bv r3 = r15.instance
            com.google.android.gms.measurement.a.b r3 = (com.google.android.gms.measurement.p10848a.C145149b) r3
            com.google.protobuf.cq r3 = r3.f392321c
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.measurement.a.l r3 = (com.google.android.gms.measurement.p10848a.C145163l) r3
            java.lang.String r4 = r3.f392363c
            java.lang.String[] r5 = com.google.android.gms.measurement.internal.C145387ge.f393052a
            java.lang.String[] r6 = com.google.android.gms.measurement.internal.C145387ge.f393053b
            java.lang.String r4 = com.google.android.gms.measurement.internal.C145422hm.m236341a(r4, r5, r6)
            if (r4 == 0) goto L_0x0215
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.android.gms.measurement.a.k r3 = (com.google.android.gms.measurement.p10848a.C145162k) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.android.gms.measurement.a.l r5 = (com.google.android.gms.measurement.p10848a.C145163l) r5
            int r6 = r5.f392361a
            r8 = 2
            r6 = r6 | r8
            r5.f392361a = r6
            r5.f392363c = r4
            r15.copyOnWrite()
            com.google.protobuf.bv r4 = r15.instance
            com.google.android.gms.measurement.a.b r4 = (com.google.android.gms.measurement.p10848a.C145149b) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.android.gms.measurement.a.l r3 = (com.google.android.gms.measurement.p10848a.C145163l) r3
            r3.getClass()
            com.google.protobuf.cq r5 = r4.f392321c
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x0206
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r4.f392321c = r5
        L_0x0206:
            com.google.protobuf.cq r4 = r4.f392321c
            r4.set(r1, r3)
            com.google.protobuf.bv r3 = r13.build()
            com.google.android.gms.measurement.a.b r3 = (com.google.android.gms.measurement.p10848a.C145149b) r3
            r11.set(r12, r3)
            r15 = r13
        L_0x0215:
            int r1 = r1 + 1
            goto L_0x01af
        L_0x0218:
            int r12 = r12 + 1
            r1 = r26
            r3 = r29
            r4 = r30
            r8 = r18
            r5 = r20
            r6 = r21
            r9 = 0
            goto L_0x0079
        L_0x0229:
            r20 = r5
            r21 = r6
            r18 = r8
            r10.mo121194J()
            r10.mo120904g()
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)
            android.database.sqlite.SQLiteDatabase r1 = r10.mo120806d()
            r1.beginTransaction()
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            android.database.sqlite.SQLiteDatabase r3 = r10.mo120806d()     // Catch:{ all -> 0x0663 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x0663 }
            r6 = 0
            r5[r6] = r2     // Catch:{ all -> 0x0663 }
            r3.delete(r7, r0, r5)     // Catch:{ all -> 0x0663 }
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x0663 }
            r5[r6] = r2     // Catch:{ all -> 0x0663 }
            r4 = r21
            r3.delete(r4, r0, r5)     // Catch:{ all -> 0x0663 }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x0663 }
        L_0x0262:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0663 }
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.b r0 = (com.google.android.gms.measurement.p10848a.C145149b) r0     // Catch:{ all -> 0x0663 }
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r0)     // Catch:{ all -> 0x0663 }
            int r6 = r0.f392319a     // Catch:{ all -> 0x0663 }
            r8 = 1
            r6 = r6 & r8
            if (r6 == 0) goto L_0x04b8
            int r6 = r0.f392320b     // Catch:{ all -> 0x0663 }
            com.google.protobuf.cq r8 = r0.f392322d     // Catch:{ all -> 0x0663 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0663 }
        L_0x0288:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0663 }
            if (r9 == 0) goto L_0x02b0
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.d r9 = (com.google.android.gms.measurement.p10848a.C145155d) r9     // Catch:{ all -> 0x0663 }
            int r9 = r9.f392335a     // Catch:{ all -> 0x0663 }
            r12 = 1
            r9 = r9 & r12
            if (r9 != 0) goto L_0x0288
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r0.mo120896c(r5, r8, r6)     // Catch:{ all -> 0x0663 }
            goto L_0x0262
        L_0x02b0:
            com.google.protobuf.cq r8 = r0.f392321c     // Catch:{ all -> 0x0663 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0663 }
        L_0x02b6:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0663 }
            if (r9 == 0) goto L_0x02de
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.l r9 = (com.google.android.gms.measurement.p10848a.C145163l) r9     // Catch:{ all -> 0x0663 }
            int r9 = r9.f392361a     // Catch:{ all -> 0x0663 }
            r12 = 1
            r9 = r9 & r12
            if (r9 != 0) goto L_0x02b6
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r0.mo120896c(r5, r8, r6)     // Catch:{ all -> 0x0663 }
            goto L_0x0262
        L_0x02de:
            com.google.protobuf.cq r8 = r0.f392322d     // Catch:{ all -> 0x0663 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0663 }
        L_0x02e4:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0663 }
            java.lang.String r15 = "data"
            java.lang.String r12 = "session_scoped"
            java.lang.String r13 = "filter_id"
            java.lang.String r5 = "audience_id"
            java.lang.String r14 = "app_id"
            if (r9 == 0) goto L_0x03b8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.d r9 = (com.google.android.gms.measurement.p10848a.C145155d) r9     // Catch:{ all -> 0x0663 }
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r9)     // Catch:{ all -> 0x0663 }
            r23 = r3
            java.lang.String r3 = r9.f392337c     // Catch:{ all -> 0x0663 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0663 }
            if (r3 == 0) goto L_0x033c
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0663 }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            int r12 = r9.f392335a     // Catch:{ all -> 0x0663 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x0331
            int r9 = r9.f392336b     // Catch:{ all -> 0x0663 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0663 }
            r19 = r9
            goto L_0x0333
        L_0x0331:
            r19 = 0
        L_0x0333:
            java.lang.String r9 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x0663 }
            r0.mo120897d(r3, r5, r8, r9)     // Catch:{ all -> 0x0663 }
            goto L_0x0488
        L_0x033c:
            byte[] r3 = r9.toByteArray()     // Catch:{ all -> 0x0663 }
            r24 = r8
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x0663 }
            r8.<init>()     // Catch:{ all -> 0x0663 }
            r8.put(r14, r2)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r8.put(r5, r14)     // Catch:{ all -> 0x0663 }
            int r5 = r9.f392335a     // Catch:{ all -> 0x0663 }
            r14 = 1
            r5 = r5 & r14
            if (r5 == 0) goto L_0x035e
            int r5 = r9.f392336b     // Catch:{ all -> 0x0663 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0663 }
            goto L_0x035f
        L_0x035e:
            r5 = 0
        L_0x035f:
            r8.put(r13, r5)     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "event_name"
            java.lang.String r13 = r9.f392337c     // Catch:{ all -> 0x0663 }
            r8.put(r5, r13)     // Catch:{ all -> 0x0663 }
            int r5 = r9.f392335a     // Catch:{ all -> 0x0663 }
            r5 = r5 & 64
            if (r5 == 0) goto L_0x0376
            boolean r5 = r9.f392342h     // Catch:{ all -> 0x0663 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0663 }
            goto L_0x0377
        L_0x0376:
            r5 = 0
        L_0x0377:
            r8.put(r12, r5)     // Catch:{ all -> 0x0663 }
            r8.put(r15, r3)     // Catch:{ all -> 0x0663 }
            android.database.sqlite.SQLiteDatabase r3 = r10.mo120806d()     // Catch:{ SQLiteException -> 0x03a4 }
            r5 = 5
            r9 = 0
            long r12 = r3.insertWithOnConflict(r4, r9, r8, r5)     // Catch:{ SQLiteException -> 0x03a4 }
            r8 = -1
            int r3 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x039e
            com.google.android.gms.measurement.internal.ff r3 = r10.f393011w     // Catch:{ SQLiteException -> 0x03a4 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ SQLiteException -> 0x03a4 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ SQLiteException -> 0x03a4 }
            java.lang.String r5 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ SQLiteException -> 0x03a4 }
            r3.mo120895b(r5, r8)     // Catch:{ SQLiteException -> 0x03a4 }
        L_0x039e:
            r3 = r23
            r8 = r24
            goto L_0x02e4
        L_0x03a4:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r3 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Error storing event filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            r3.mo120896c(r5, r8, r0)     // Catch:{ all -> 0x0663 }
            goto L_0x0488
        L_0x03b8:
            r23 = r3
            com.google.protobuf.cq r0 = r0.f392321c     // Catch:{ all -> 0x0663 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0663 }
        L_0x03c0:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0663 }
            if (r3 == 0) goto L_0x04cf
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.l r3 = (com.google.android.gms.measurement.p10848a.C145163l) r3     // Catch:{ all -> 0x0663 }
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233958a(r3)     // Catch:{ all -> 0x0663 }
            java.lang.String r8 = r3.f392363c     // Catch:{ all -> 0x0663 }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x0663 }
            if (r8 == 0) goto L_0x0409
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            int r12 = r3.f392361a     // Catch:{ all -> 0x0663 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03ff
            int r3 = r3.f392362b     // Catch:{ all -> 0x0663 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0663 }
            goto L_0x0400
        L_0x03ff:
            r3 = 0
        L_0x0400:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0663 }
            r0.mo120897d(r5, r8, r9, r3)     // Catch:{ all -> 0x0663 }
            goto L_0x0488
        L_0x0409:
            byte[] r8 = r3.toByteArray()     // Catch:{ all -> 0x0663 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0663 }
            r9.<init>()     // Catch:{ all -> 0x0663 }
            r9.put(r14, r2)     // Catch:{ all -> 0x0663 }
            r24 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r9.put(r5, r0)     // Catch:{ all -> 0x0663 }
            int r0 = r3.f392361a     // Catch:{ all -> 0x0663 }
            r16 = 1
            r0 = r0 & 1
            if (r0 == 0) goto L_0x042d
            int r0 = r3.f392362b     // Catch:{ all -> 0x0663 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0663 }
            goto L_0x042e
        L_0x042d:
            r0 = 0
        L_0x042e:
            r9.put(r13, r0)     // Catch:{ all -> 0x0663 }
            java.lang.String r0 = "property_name"
            r25 = r5
            java.lang.String r5 = r3.f392363c     // Catch:{ all -> 0x0663 }
            r9.put(r0, r5)     // Catch:{ all -> 0x0663 }
            int r0 = r3.f392361a     // Catch:{ all -> 0x0663 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0447
            boolean r0 = r3.f392367g     // Catch:{ all -> 0x0663 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0663 }
            goto L_0x0448
        L_0x0447:
            r0 = 0
        L_0x0448:
            r9.put(r12, r0)     // Catch:{ all -> 0x0663 }
            r9.put(r15, r8)     // Catch:{ all -> 0x0663 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo120806d()     // Catch:{ SQLiteException -> 0x0476 }
            r3 = 5
            r5 = 0
            long r8 = r0.insertWithOnConflict(r7, r5, r9, r3)     // Catch:{ SQLiteException -> 0x0476 }
            r21 = -1
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x0470
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ SQLiteException -> 0x0476 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x0476 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x0476 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ SQLiteException -> 0x0476 }
            r0.mo120895b(r3, r5)     // Catch:{ SQLiteException -> 0x0476 }
            goto L_0x0488
        L_0x0470:
            r0 = r24
            r5 = r25
            goto L_0x03c0
        L_0x0476:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r3 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Error storing property filter. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            r3.mo120896c(r5, r8, r0)     // Catch:{ all -> 0x0663 }
        L_0x0488:
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            android.database.sqlite.SQLiteDatabase r0 = r10.mo120806d()     // Catch:{ all -> 0x0663 }
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ all -> 0x0663 }
            r3 = 0
            r5[r3] = r2     // Catch:{ all -> 0x0663 }
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r8 = 1
            r5[r8] = r3     // Catch:{ all -> 0x0663 }
            r3 = r20
            r0.delete(r7, r3, r5)     // Catch:{ all -> 0x0663 }
            r5 = 2
            java.lang.String[] r8 = new java.lang.String[r5]     // Catch:{ all -> 0x0663 }
            r5 = 0
            r8[r5] = r2     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0663 }
            r6 = 1
            r8[r6] = r5     // Catch:{ all -> 0x0663 }
            r0.delete(r4, r3, r8)     // Catch:{ all -> 0x0663 }
            goto L_0x04cd
        L_0x04b8:
            r23 = r3
            r3 = r20
            com.google.android.gms.measurement.internal.ff r0 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "Audience with no ID. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            r0.mo120895b(r5, r6)     // Catch:{ all -> 0x0663 }
        L_0x04cd:
            r20 = r3
        L_0x04cf:
            r3 = r23
            goto L_0x0262
        L_0x04d3:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0663 }
            r0.<init>()     // Catch:{ all -> 0x0663 }
            java.util.Iterator r3 = r11.iterator()     // Catch:{ all -> 0x0663 }
        L_0x04dc:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0663 }
            if (r4 == 0) goto L_0x04fa
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.a.b r4 = (com.google.android.gms.measurement.p10848a.C145149b) r4     // Catch:{ all -> 0x0663 }
            int r5 = r4.f392319a     // Catch:{ all -> 0x0663 }
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x04f5
            int r4 = r4.f392320b     // Catch:{ all -> 0x0663 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0663 }
            goto L_0x04f6
        L_0x04f5:
            r9 = 0
        L_0x04f6:
            r0.add(r9)     // Catch:{ all -> 0x0663 }
            goto L_0x04dc
        L_0x04fa:
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)     // Catch:{ all -> 0x0663 }
            r10.mo121194J()     // Catch:{ all -> 0x0663 }
            r10.mo120904g()     // Catch:{ all -> 0x0663 }
            android.database.sqlite.SQLiteDatabase r3 = r10.mo120806d()     // Catch:{ all -> 0x0663 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0596 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x0596 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r10.mo120803a(r4, r5)     // Catch:{ SQLiteException -> 0x0596 }
            com.google.android.gms.measurement.internal.ff r6 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.ab r6 = r6.f392937g     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dk r7 = com.google.android.gms.measurement.internal.C145313dl.f392698E     // Catch:{ all -> 0x0663 }
            int r6 = r6.mo120768d(r2, r7)     // Catch:{ all -> 0x0663 }
            r7 = 2000(0x7d0, float:2.803E-42)
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x0663 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x0663 }
            long r7 = (long) r6     // Catch:{ all -> 0x0663 }
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x052f
            goto L_0x05a8
        L_0x052f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0663 }
            r4.<init>()     // Catch:{ all -> 0x0663 }
            r5 = 0
        L_0x0535:
            int r7 = r0.size()     // Catch:{ all -> 0x0663 }
            if (r5 >= r7) goto L_0x0551
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x0663 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0663 }
            if (r7 == 0) goto L_0x05a8
            int r7 = r7.intValue()     // Catch:{ all -> 0x0663 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0663 }
            r4.add(r7)     // Catch:{ all -> 0x0663 }
            int r5 = r5 + 1
            goto L_0x0535
        L_0x0551:
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x0663 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0663 }
            r4.<init>()     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "("
            r4.append(r5)     // Catch:{ all -> 0x0663 }
            r4.append(r0)     // Catch:{ all -> 0x0663 }
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch:{ all -> 0x0663 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0663 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0663 }
            r4.<init>()     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r4.append(r5)     // Catch:{ all -> 0x0663 }
            r4.append(r0)     // Catch:{ all -> 0x0663 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r4.append(r0)     // Catch:{ all -> 0x0663 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0663 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0663 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0663 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x0663 }
            java.lang.String r5 = "audience_filter_values"
            r3.delete(r5, r0, r4)     // Catch:{ all -> 0x0663 }
            goto L_0x05a8
        L_0x0596:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r3 = r10.f393011w     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dx r3 = r3.mo120965ar()     // Catch:{ all -> 0x0663 }
            com.google.android.gms.measurement.internal.dv r3 = r3.f392795c     // Catch:{ all -> 0x0663 }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ all -> 0x0663 }
            r3.mo120896c(r4, r5, r0)     // Catch:{ all -> 0x0663 }
        L_0x05a8:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x0663 }
            r1.endTransaction()
            r18.copyOnWrite()     // Catch:{ RuntimeException -> 0x05cc }
            r8 = r18
            com.google.protobuf.bv r0 = r8.instance     // Catch:{ RuntimeException -> 0x05ca }
            com.google.android.gms.measurement.a.v r0 = (com.google.android.gms.measurement.p10848a.C145173v) r0     // Catch:{ RuntimeException -> 0x05ca }
            com.google.protobuf.cq r1 = com.google.android.gms.measurement.p10848a.C145173v.emptyProtobufList()     // Catch:{ RuntimeException -> 0x05ca }
            r0.f392394f = r1     // Catch:{ RuntimeException -> 0x05ca }
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ RuntimeException -> 0x05ca }
            com.google.android.gms.measurement.a.v r0 = (com.google.android.gms.measurement.p10848a.C145173v) r0     // Catch:{ RuntimeException -> 0x05ca }
            byte[] r0 = r0.toByteArray()     // Catch:{ RuntimeException -> 0x05ca }
            r3 = r26
            goto L_0x05e4
        L_0x05ca:
            r0 = move-exception
            goto L_0x05cf
        L_0x05cc:
            r0 = move-exception
            r8 = r18
        L_0x05cf:
            r3 = r26
            com.google.android.gms.measurement.internal.ff r1 = r3.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392798f
            java.lang.String r4 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)
            r1.mo120896c(r4, r5, r0)
            r0 = r28
        L_0x05e4:
            com.google.android.gms.measurement.internal.jy r1 = r3.f393327l
            com.google.android.gms.measurement.internal.ah r1 = r1.f393355c
            com.google.android.gms.measurement.internal.C145488jy.m236409I(r1)
            com.google.android.gms.common.internal.C143919bh.m233969l(r27)
            r1.mo120904g()
            r1.mo121194J()
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = "remote_config"
            r4.put(r5, r0)
            java.lang.String r0 = "config_last_modified_time"
            r5 = r29
            r4.put(r0, r5)
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w
            com.google.android.gms.measurement.internal.ab r0 = r0.f392937g
            com.google.android.gms.measurement.internal.dk r5 = com.google.android.gms.measurement.internal.C145313dl.f392730aj
            r6 = 0
            boolean r0 = r0.mo120776m(r6, r5)
            if (r0 == 0) goto L_0x0619
            java.lang.String r0 = "e_tag"
            r5 = r30
            r4.put(r0, r5)
        L_0x0619:
            android.database.sqlite.SQLiteDatabase r0 = r1.mo120806d()     // Catch:{ SQLiteException -> 0x0644 }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0644 }
            r5 = 0
            r6[r5] = r2     // Catch:{ SQLiteException -> 0x0644 }
            java.lang.String r5 = "apps"
            java.lang.String r7 = "app_id = ?"
            int r0 = r0.update(r5, r4, r7, r6)     // Catch:{ SQLiteException -> 0x0644 }
            long r4 = (long) r0     // Catch:{ SQLiteException -> 0x0644 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0656
            com.google.android.gms.measurement.internal.ff r0 = r1.f393011w     // Catch:{ SQLiteException -> 0x0644 }
            com.google.android.gms.measurement.internal.dx r0 = r0.mo120965ar()     // Catch:{ SQLiteException -> 0x0644 }
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c     // Catch:{ SQLiteException -> 0x0644 }
            java.lang.String r4 = "Failed to update remote config (got 0). appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)     // Catch:{ SQLiteException -> 0x0644 }
            r0.mo120895b(r4, r5)     // Catch:{ SQLiteException -> 0x0644 }
            goto L_0x0656
        L_0x0644:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ff r1 = r1.f393011w
            com.google.android.gms.measurement.internal.dx r1 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r1 = r1.f392795c
            java.lang.String r4 = "Error storing remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r27)
            r1.mo120896c(r4, r5, r0)
        L_0x0656:
            java.util.Map r0 = r3.f392892e
            com.google.protobuf.bv r1 = r8.build()
            com.google.android.gms.measurement.a.v r1 = (com.google.android.gms.measurement.p10848a.C145173v) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x0663:
            r0 = move-exception
            r3 = r26
            r1.endTransaction()
            goto L_0x066b
        L_0x066a:
            throw r0
        L_0x066b:
            goto L_0x066a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145351ew.mo120947m(java.lang.String, byte[], java.lang.String, java.lang.String):boolean");
    }
}
