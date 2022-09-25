package com.google.android.libraries.notifications.p2268e.p2281g.p2282a;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.libraries.notifications.p2268e.p2281g.C29894e;
import com.google.android.libraries.notifications.p2268e.p2281g.C29895f;
import com.google.android.libraries.notifications.p2268e.p2287j.C29953d;
import com.google.android.libraries.notifications.p2268e.p2287j.C29955f;
import com.google.android.libraries.notifications.p2268e.p2287j.C29956g;
import com.google.android.libraries.notifications.p2293h.C30010c;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.p10905k.C146606e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58528ij;
import com.google.p4160bf.p4161a.p4162a.C55434c;
import com.google.p4160bf.p4161a.p4163b.C55461ay;
import com.google.p4160bf.p4161a.p4163b.C55464ba;
import com.google.p4160bf.p4161a.p4163b.C55465bb;
import com.google.p4160bf.p4161a.p4163b.C55467bd;
import com.google.p4160bf.p4161a.p4163b.C55469bf;
import com.google.p4160bf.p4161a.p4163b.C55470bg;
import com.google.p4160bf.p4161a.p4163b.C55489bz;
import com.google.p4160bf.p4161a.p4163b.C55490c;
import com.google.p4160bf.p4161a.p4163b.C55497e;
import com.google.p4160bf.p4161a.p4163b.C55500h;
import com.google.p4160bf.p4164b.p4165a.C55641bx;
import com.google.p4160bf.p4164b.p4165a.C55643bz;
import com.google.p4160bf.p4164b.p4165a.C55645ca;
import com.google.p4160bf.p4164b.p4165a.C55647cc;
import com.google.p4160bf.p4164b.p4165a.C55648cd;
import com.google.p4160bf.p4164b.p4165a.C55650cf;
import com.google.p4160bf.p4164b.p4165a.C55652ch;
import com.google.p4160bf.p4164b.p4165a.C55653ci;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55533am;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55534an;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55546az;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55548ba;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55549bb;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55550bc;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63070h;
import dagger.p5294a.C68221g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68808q;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68946j;

/* renamed from: com.google.android.libraries.notifications.e.g.a.w */
/* compiled from: PG */
public final class C29887w implements C29895f {

    /* renamed from: a */
    private static final C58528ij f80998a = C58528ij.m90011K(C55489bz.SHOWN, C55489bz.SHOWN_FORCED);

    /* renamed from: b */
    private final Context f80999b;

    /* renamed from: c */
    private final C30075e f81000c;

    /* renamed from: d */
    private final C58833ax f81001d;

    /* renamed from: e */
    private final C29956g f81002e;

    /* renamed from: f */
    private final C29866b f81003f;

    /* renamed from: g */
    private final C29884t f81004g;

    static {
        C58528ij.m90014N(C55489bz.ACTION_CLICK, C55489bz.CLICKED, C55489bz.DISMISSED, C55489bz.SHOWN, C55489bz.SHOWN_FORCED);
    }

    public C29887w(Context context, C30075e eVar, C58833ax axVar, C29956g gVar, C29866b bVar, C29884t tVar) {
        this.f80999b = context;
        this.f81000c = eVar;
        this.f81001d = axVar;
        this.f81002e = gVar;
        this.f81003f = bVar;
        this.f81004g = tVar;
    }

    /* renamed from: c */
    private final String m55321c() {
        try {
            String str = this.f80999b.getPackageManager().getPackageInfo(this.f80999b.getPackageName(), 0).versionName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "unknown";
        } catch (PackageManager.NameNotFoundException e) {
            C30058b.m55792d("RenderContextHelperImpl", e, "Failed to get app version.", new Object[0]);
            return "unknown";
        }
    }

    /* renamed from: d */
    private final String m55322d() {
        try {
            return C146606e.m238841c(this.f80999b.getContentResolver(), "device_country", (String) null);
        } catch (SecurityException e) {
            C30058b.m55792d("RenderContextHelperImpl", e, "Exception reading GServices 'device_country' key.", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    private final String m55323e() {
        return this.f80999b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }

    /* renamed from: a */
    public final C55653ci mo35195a(String str) {
        C55534an anVar;
        C55643bz bzVar = (C55643bz) C55652ch.f146826r.createBuilder();
        float f = this.f80999b.getResources().getDisplayMetrics().density;
        bzVar.copyOnWrite();
        C55652ch chVar = (C55652ch) bzVar.instance;
        chVar.f146828a |= 1;
        chVar.f146829b = f;
        String c = m55321c();
        bzVar.copyOnWrite();
        C55652ch chVar2 = (C55652ch) bzVar.instance;
        c.getClass();
        chVar2.f146828a |= 8;
        chVar2.f146832e = c;
        int i = Build.VERSION.SDK_INT;
        bzVar.copyOnWrite();
        C55652ch chVar3 = (C55652ch) bzVar.instance;
        chVar3.f146828a |= 128;
        chVar3.f146836i = i;
        String str2 = ((C30071a) this.f81000c).f81359e;
        bzVar.copyOnWrite();
        C55652ch chVar4 = (C55652ch) bzVar.instance;
        chVar4.f146828a |= 512;
        chVar4.f146838k = str2;
        bzVar.copyOnWrite();
        C55652ch chVar5 = (C55652ch) bzVar.instance;
        int i2 = 3;
        chVar5.f146830c = 3;
        chVar5.f146828a |= 2;
        String num = Integer.toString(475194430);
        bzVar.copyOnWrite();
        C55652ch chVar6 = (C55652ch) bzVar.instance;
        num.getClass();
        chVar6.f146828a |= 4;
        chVar6.f146831d = num;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str3 = Build.VERSION.RELEASE;
            bzVar.copyOnWrite();
            C55652ch chVar7 = (C55652ch) bzVar.instance;
            str3.getClass();
            chVar7.f146828a |= 16;
            chVar7.f146833f = str3;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str4 = Build.ID;
            bzVar.copyOnWrite();
            C55652ch chVar8 = (C55652ch) bzVar.instance;
            str4.getClass();
            chVar8.f146828a |= 32;
            chVar8.f146834g = str4;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str5 = Build.MODEL;
            bzVar.copyOnWrite();
            C55652ch chVar9 = (C55652ch) bzVar.instance;
            str5.getClass();
            chVar9.f146828a |= 64;
            chVar9.f146835h = str5;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str6 = Build.MANUFACTURER;
            bzVar.copyOnWrite();
            C55652ch chVar10 = (C55652ch) bzVar.instance;
            str6.getClass();
            chVar10.f146828a |= 256;
            chVar10.f146837j = str6;
        }
        for (C29953d dVar : this.f81002e.mo35236c()) {
            C55645ca caVar = (C55645ca) C55647cc.f146813e.createBuilder();
            String b = dVar.mo35224b();
            caVar.copyOnWrite();
            C55647cc ccVar = (C55647cc) caVar.instance;
            b.getClass();
            ccVar.f146815a |= 1;
            ccVar.f146816b = b;
            int c2 = dVar.mo35225c();
            int i3 = c2 - 1;
            C29894e eVar = C29894e.FILTER_ALL;
            if (c2 != 0) {
                int i4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 1 : 2 : 5 : 4 : 3;
                caVar.copyOnWrite();
                C55647cc ccVar2 = (C55647cc) caVar.instance;
                ccVar2.f146818d = i4 - 1;
                ccVar2.f146815a |= 4;
                if (!TextUtils.isEmpty(dVar.mo35223a())) {
                    String a = dVar.mo35223a();
                    caVar.copyOnWrite();
                    C55647cc ccVar3 = (C55647cc) caVar.instance;
                    a.getClass();
                    ccVar3.f146815a |= 2;
                    ccVar3.f146817c = a;
                }
                C55647cc ccVar4 = (C55647cc) caVar.build();
                bzVar.copyOnWrite();
                C55652ch chVar11 = (C55652ch) bzVar.instance;
                ccVar4.getClass();
                C62971cq cqVar = chVar11.f146839l;
                if (!cqVar.mo58948c()) {
                    chVar11.f146839l = C62942bv.mutableCopy(cqVar);
                }
                chVar11.f146839l.add(ccVar4);
            } else {
                throw null;
            }
        }
        for (C29955f fVar : this.f81002e.mo35235b()) {
            C55648cd cdVar = (C55648cd) C55650cf.f146820d.createBuilder();
            String a2 = fVar.mo35251a();
            cdVar.copyOnWrite();
            C55650cf cfVar = (C55650cf) cdVar.instance;
            a2.getClass();
            cfVar.f146822a |= 1;
            cfVar.f146823b = a2;
            int i5 = true != fVar.mo35252b() ? 2 : 3;
            cdVar.copyOnWrite();
            C55650cf cfVar2 = (C55650cf) cdVar.instance;
            cfVar2.f146824c = i5 - 1;
            cfVar2.f146822a |= 2;
            C55650cf cfVar3 = (C55650cf) cdVar.build();
            bzVar.copyOnWrite();
            C55652ch chVar12 = (C55652ch) bzVar.instance;
            cfVar3.getClass();
            C62971cq cqVar2 = chVar12.f146840m;
            if (!cqVar2.mo58948c()) {
                chVar12.f146840m = C62942bv.mutableCopy(cqVar2);
            }
            chVar12.f146840m.add(cfVar3);
        }
        if (true == C1793aj.m4937b(new C1800aq(this.f80999b).f5622a)) {
            i2 = 2;
        }
        bzVar.copyOnWrite();
        C55652ch chVar13 = (C55652ch) bzVar.instance;
        chVar13.f146841n = i2 - 1;
        chVar13.f146828a |= 1024;
        String d = m55322d();
        if (!TextUtils.isEmpty(d)) {
            bzVar.copyOnWrite();
            C55652ch chVar14 = (C55652ch) bzVar.instance;
            d.getClass();
            chVar14.f146828a |= 2048;
            chVar14.f146842o = d;
        }
        Set<C55434c> set = (Set) ((C68221g) this.f81003f.f80971a).f184583a;
        if (set.isEmpty()) {
            anVar = C55534an.f146543b;
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>(set.size());
            for (C55434c cVar : set) {
                arrayList.add(Integer.valueOf(cVar.f146262f));
            }
            C55533am amVar = (C55533am) C55534an.f146543b.createBuilder();
            int i6 = 1;
            for (Integer intValue : arrayList) {
                i6 = Math.max((intValue.intValue() / 64) + 1, i6);
            }
            ArrayList arrayList2 = new ArrayList(i6);
            arrayList2.addAll(Collections.nCopies(i6, 0L));
            for (Integer intValue2 : arrayList) {
                int intValue3 = intValue2.intValue();
                int i7 = intValue3 / 64;
                arrayList2.set(i7, Long.valueOf((1 << (intValue3 % 64)) | ((Long) arrayList2.get(i7)).longValue()));
            }
            amVar.copyOnWrite();
            C55534an anVar2 = (C55534an) amVar.instance;
            C62964ck ckVar = anVar2.f146545a;
            if (!ckVar.mo58948c()) {
                anVar2.f146545a = C62942bv.mutableCopy(ckVar);
            }
            C62947c.addAll((Iterable) arrayList2, (List) anVar2.f146545a);
            anVar = (C55534an) amVar.build();
        }
        bzVar.copyOnWrite();
        C55652ch chVar15 = (C55652ch) bzVar.instance;
        anVar.getClass();
        chVar15.f146843p = anVar;
        chVar15.f146828a |= 4096;
        C29866b bVar = this.f81003f;
        C55546az azVar = (C55546az) C55550bc.f146575c.createBuilder();
        if (C68808q.f184883a.mo6453a().mo60493a()) {
            C55548ba baVar = (C55548ba) C55549bb.f146571c.createBuilder();
            baVar.copyOnWrite();
            C55549bb bbVar = (C55549bb) baVar.instance;
            bbVar.f146573a = 2 | bbVar.f146573a;
            bbVar.f146574b = true;
            azVar.copyOnWrite();
            C55550bc bcVar = (C55550bc) azVar.instance;
            C55549bb bbVar2 = (C55549bb) baVar.build();
            bbVar2.getClass();
            bcVar.f146578b = bbVar2;
            bcVar.f146577a |= 1;
        }
        for (C55550bc mergeFrom : (Set) ((C68221g) bVar.f80972b).f184583a) {
            azVar.mergeFrom(mergeFrom);
        }
        C55550bc bcVar2 = (C55550bc) azVar.build();
        bzVar.copyOnWrite();
        C55652ch chVar16 = (C55652ch) bzVar.instance;
        bcVar2.getClass();
        chVar16.f146844q = bcVar2;
        chVar16.f146828a |= 8192;
        C55641bx bxVar = (C55641bx) C55653ci.f146845g.createBuilder();
        String e = m55323e();
        bxVar.copyOnWrite();
        C55653ci ciVar = (C55653ci) bxVar.instance;
        e.getClass();
        ciVar.f146847a = 1 | ciVar.f146847a;
        ciVar.f146848b = e;
        String id = TimeZone.getDefault().getID();
        bxVar.copyOnWrite();
        C55653ci ciVar2 = (C55653ci) bxVar.instance;
        id.getClass();
        ciVar2.f146847a |= 8;
        ciVar2.f146850d = id;
        C55652ch chVar17 = (C55652ch) bzVar.build();
        bxVar.copyOnWrite();
        C55653ci ciVar3 = (C55653ci) bxVar.instance;
        chVar17.getClass();
        ciVar3.f146851e = chVar17;
        ciVar3.f146847a |= 32;
        C63070h a3 = ((C30010c) ((C58847bk) this.f81001d).f156646a).mo35324a(str);
        if (a3 != null) {
            bxVar.copyOnWrite();
            C55653ci ciVar4 = (C55653ci) bxVar.instance;
            ciVar4.f146852f = a3;
            ciVar4.f146847a |= 64;
        }
        String b2 = ((C30010c) ((C58847bk) this.f81001d).f156646a).mo35325b();
        if (!TextUtils.isEmpty(b2)) {
            bxVar.copyOnWrite();
            C55653ci ciVar5 = (C55653ci) bxVar.instance;
            b2.getClass();
            ciVar5.f146847a |= 4;
            ciVar5.f146849c = b2;
        }
        return (C55653ci) bxVar.build();
    }

    /* renamed from: b */
    public final C55470bg mo35196b(C55489bz bzVar) {
        C58833ax axVar;
        C58833ax axVar2;
        C55464ba baVar = (C55464ba) C55469bf.f146328q.createBuilder();
        float f = this.f80999b.getResources().getDisplayMetrics().density;
        baVar.copyOnWrite();
        C55469bf bfVar = (C55469bf) baVar.instance;
        bfVar.f146330a |= 1;
        bfVar.f146331b = f;
        String c = m55321c();
        baVar.copyOnWrite();
        C55469bf bfVar2 = (C55469bf) baVar.instance;
        c.getClass();
        bfVar2.f146330a |= 8;
        bfVar2.f146334e = c;
        int i = Build.VERSION.SDK_INT;
        baVar.copyOnWrite();
        C55469bf bfVar3 = (C55469bf) baVar.instance;
        bfVar3.f146330a |= 128;
        bfVar3.f146338i = i;
        baVar.copyOnWrite();
        C55469bf bfVar4 = (C55469bf) baVar.instance;
        int i2 = 3;
        bfVar4.f146332c = 3;
        bfVar4.f146330a |= 2;
        String num = Integer.toString(475194430);
        baVar.copyOnWrite();
        C55469bf bfVar5 = (C55469bf) baVar.instance;
        num.getClass();
        bfVar5.f146330a |= 4;
        bfVar5.f146333d = num;
        int i3 = (this.f80999b.getResources().getConfiguration().uiMode & 48) == 32 ? 3 : 2;
        baVar.copyOnWrite();
        C55469bf bfVar6 = (C55469bf) baVar.instance;
        bfVar6.f146345p = i3 - 1;
        bfVar6.f146330a |= 8192;
        if (!TextUtils.isEmpty(Build.VERSION.RELEASE)) {
            String str = Build.VERSION.RELEASE;
            baVar.copyOnWrite();
            C55469bf bfVar7 = (C55469bf) baVar.instance;
            str.getClass();
            bfVar7.f146330a |= 16;
            bfVar7.f146335f = str;
        }
        if (!TextUtils.isEmpty(Build.ID)) {
            String str2 = Build.ID;
            baVar.copyOnWrite();
            C55469bf bfVar8 = (C55469bf) baVar.instance;
            str2.getClass();
            bfVar8.f146330a = 32 | bfVar8.f146330a;
            bfVar8.f146336g = str2;
        }
        if (!TextUtils.isEmpty(Build.MODEL)) {
            String str3 = Build.MODEL;
            baVar.copyOnWrite();
            C55469bf bfVar9 = (C55469bf) baVar.instance;
            str3.getClass();
            bfVar9.f146330a |= 64;
            bfVar9.f146337h = str3;
        }
        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str4 = Build.MANUFACTURER;
            baVar.copyOnWrite();
            C55469bf bfVar10 = (C55469bf) baVar.instance;
            str4.getClass();
            bfVar10.f146330a |= 256;
            bfVar10.f146339j = str4;
        }
        for (C29953d d : this.f81002e.mo35236c()) {
            C55500h d2 = d.mo35256d();
            baVar.copyOnWrite();
            C55469bf bfVar11 = (C55469bf) baVar.instance;
            d2.getClass();
            C62971cq cqVar = bfVar11.f146340k;
            if (!cqVar.mo58948c()) {
                bfVar11.f146340k = C62942bv.mutableCopy(cqVar);
            }
            bfVar11.f146340k.add(d2);
        }
        for (C29955f fVar : this.f81002e.mo35235b()) {
            C55490c cVar = (C55490c) C55497e.f146447d.createBuilder();
            String a = fVar.mo35251a();
            cVar.copyOnWrite();
            C55497e eVar = (C55497e) cVar.instance;
            a.getClass();
            eVar.f146449a |= 1;
            eVar.f146450b = a;
            int i4 = true != fVar.mo35252b() ? 2 : 3;
            cVar.copyOnWrite();
            C55497e eVar2 = (C55497e) cVar.instance;
            eVar2.f146451c = i4 - 1;
            eVar2.f146449a |= 2;
            C55497e eVar3 = (C55497e) cVar.build();
            baVar.copyOnWrite();
            C55469bf bfVar12 = (C55469bf) baVar.instance;
            eVar3.getClass();
            C62971cq cqVar2 = bfVar12.f146341l;
            if (!cqVar2.mo58948c()) {
                bfVar12.f146341l = C62942bv.mutableCopy(cqVar2);
            }
            bfVar12.f146341l.add(eVar3);
        }
        int i5 = true != C1793aj.m4937b(new C1800aq(this.f80999b).f5622a) ? 3 : 2;
        baVar.copyOnWrite();
        C55469bf bfVar13 = (C55469bf) baVar.instance;
        bfVar13.f146342m = i5 - 1;
        bfVar13.f146330a |= 1024;
        String d3 = m55322d();
        if (!TextUtils.isEmpty(d3)) {
            baVar.copyOnWrite();
            C55469bf bfVar14 = (C55469bf) baVar.instance;
            d3.getClass();
            bfVar14.f146330a |= 2048;
            bfVar14.f146343n = d3;
        }
        C68946j.f185234a.mo6453a().mo60804a();
        C55465bb bbVar = (C55465bb) C55467bd.f146323c.createBuilder();
        if (f80998a.contains(bzVar)) {
            NotificationManager notificationManager = (NotificationManager) this.f81004g.f80994a.getSystemService("notification");
            if (notificationManager == null) {
                C30058b.m55794f("InterruptionFilterStateImpl", "Current unknown (SDK >= M, NotificationManager missing).", new Object[0]);
                axVar = C58836b.f156633a;
            } else {
                int currentInterruptionFilter = notificationManager.getCurrentInterruptionFilter();
                if (currentInterruptionFilter == 1) {
                    axVar2 = C58833ax.m90834k(C29894e.FILTER_ALL);
                } else if (currentInterruptionFilter == 2) {
                    axVar2 = C58833ax.m90834k(C29894e.FILTER_PRIORITY);
                } else if (currentInterruptionFilter == 3) {
                    axVar2 = C58833ax.m90834k(C29894e.FILTER_NONE);
                } else if (currentInterruptionFilter != 4) {
                    axVar2 = C58836b.f156633a;
                } else {
                    axVar2 = C58833ax.m90834k(C29894e.FILTER_ALARMS);
                }
                C30058b.m55794f("InterruptionFilterStateImpl", "Current is %s (SDK >= M, NotificationManager's interruption filter == %s).", axVar2, Integer.valueOf(currentInterruptionFilter));
                axVar = axVar2;
            }
            if (axVar.mo56113h()) {
                C29894e eVar4 = C29894e.FILTER_ALL;
                int ordinal = ((C29894e) axVar.mo56107c()).ordinal();
                if (ordinal == 0) {
                    i2 = 2;
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 4;
                    } else if (ordinal == 3) {
                        i2 = 5;
                    } else {
                        throw new AssertionError("Invalid enum value.");
                    }
                }
                bbVar.copyOnWrite();
                C55467bd bdVar = (C55467bd) bbVar.instance;
                bdVar.f146326b = i2 - 1;
                bdVar.f146325a |= 8;
            }
        }
        C55467bd bdVar2 = (C55467bd) bbVar.build();
        baVar.copyOnWrite();
        C55469bf bfVar15 = (C55469bf) baVar.instance;
        bdVar2.getClass();
        bfVar15.f146344o = bdVar2;
        bfVar15.f146330a |= 4096;
        C55461ay ayVar = (C55461ay) C55470bg.f146346f.createBuilder();
        String e = m55323e();
        ayVar.copyOnWrite();
        C55470bg bgVar = (C55470bg) ayVar.instance;
        e.getClass();
        bgVar.f146348a |= 1;
        bgVar.f146351d = e;
        String id = TimeZone.getDefault().getID();
        ayVar.copyOnWrite();
        C55470bg bgVar2 = (C55470bg) ayVar.instance;
        id.getClass();
        bgVar2.f146349b = 4;
        bgVar2.f146350c = id;
        ayVar.copyOnWrite();
        C55470bg bgVar3 = (C55470bg) ayVar.instance;
        C55469bf bfVar16 = (C55469bf) baVar.build();
        bfVar16.getClass();
        bgVar3.f146352e = bfVar16;
        bgVar3.f146348a |= 8;
        return (C55470bg) ayVar.build();
    }
}
