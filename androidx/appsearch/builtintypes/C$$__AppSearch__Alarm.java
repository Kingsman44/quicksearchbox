package androidx.appsearch.builtintypes;

import androidx.appsearch.p047a.C0840e;
import androidx.appsearch.p047a.C0842g;
import androidx.appsearch.p047a.C0845j;
import androidx.appsearch.p047a.C0848m;
import androidx.appsearch.p047a.C0851p;
import androidx.appsearch.p047a.C0853r;
import androidx.appsearch.p047a.C0855t;
import androidx.appsearch.p047a.C0857v;
import androidx.appsearch.p047a.C0858w;

/* renamed from: androidx.appsearch.builtintypes.$$__AppSearch__Alarm  reason: invalid class name */
/* compiled from: PG */
public class C$$__AppSearch__Alarm implements C0855t {
    public static final String SCHEMA_NAME = "builtin:Alarm";

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appsearch.builtintypes.Alarm fromGenericDocument(androidx.appsearch.p047a.C0858w r24) {
        /*
            r23 = this;
            r0 = r24
            java.lang.String r2 = r0.f2847b
            java.lang.String r1 = r24.mo3447h()
            long r4 = r0.f2849d
            long r6 = r24.mo3442c()
            int r3 = r24.mo3440a()
            java.lang.String r8 = "name"
            java.lang.String[] r8 = r0.mo3454n(r8)
            r9 = 0
            if (r8 == 0) goto L_0x0021
            int r11 = r8.length
            if (r11 == 0) goto L_0x0021
            r8 = r8[r9]
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            java.lang.String r11 = "enabled"
            boolean r11 = r0.mo3451k(r11)
            java.lang.String r12 = "daysOfWeek"
            long[] r12 = r0.mo3452l(r12)
            if (r12 == 0) goto L_0x0047
            int r13 = r12.length
            int[] r13 = new int[r13]
            r14 = 0
        L_0x0034:
            int r15 = r12.length
            if (r14 >= r15) goto L_0x0043
            r16 = r11
            r10 = r12[r14]
            int r11 = (int) r10
            r13[r14] = r11
            int r14 = r14 + 1
            r11 = r16
            goto L_0x0034
        L_0x0043:
            r16 = r11
            r10 = r13
            goto L_0x004a
        L_0x0047:
            r16 = r11
            r10 = 0
        L_0x004a:
            java.lang.String r11 = "hour"
            long r11 = r0.mo3441b(r11)
            int r11 = (int) r11
            java.lang.String r12 = "minute"
            long r12 = r0.mo3441b(r12)
            int r12 = (int) r12
            java.lang.String r13 = "blackoutPeriodStartDate"
            java.lang.String[] r13 = r0.mo3454n(r13)
            if (r13 == 0) goto L_0x0066
            int r14 = r13.length
            if (r14 == 0) goto L_0x0066
            r13 = r13[r9]
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            java.lang.String r14 = "blackoutPeriodEndDate"
            java.lang.String[] r14 = r0.mo3454n(r14)
            if (r14 == 0) goto L_0x0075
            int r15 = r14.length
            if (r15 == 0) goto L_0x0075
            r14 = r14[r9]
            goto L_0x0076
        L_0x0075:
            r14 = 0
        L_0x0076:
            java.lang.String r15 = "ringtone"
            java.lang.String[] r15 = r0.mo3454n(r15)
            if (r15 == 0) goto L_0x0087
            r18 = r14
            int r14 = r15.length
            if (r14 == 0) goto L_0x0089
            r9 = r15[r9]
            r15 = r9
            goto L_0x008a
        L_0x0087:
            r18 = r14
        L_0x0089:
            r15 = 0
        L_0x008a:
            java.lang.String r9 = "shouldVibrate"
            boolean r19 = r0.mo3451k(r9)
            java.lang.String r9 = "previousInstance"
            androidx.appsearch.a.w r9 = r0.mo3443e(r9)
            if (r9 == 0) goto L_0x00a3
            java.lang.Class<androidx.appsearch.builtintypes.AlarmInstance> r14 = androidx.appsearch.builtintypes.AlarmInstance.class
            java.lang.Object r9 = r9.mo3446g(r14)
            androidx.appsearch.builtintypes.AlarmInstance r9 = (androidx.appsearch.builtintypes.AlarmInstance) r9
            r20 = r9
            goto L_0x00a5
        L_0x00a3:
            r20 = 0
        L_0x00a5:
            java.lang.String r9 = "nextInstance"
            androidx.appsearch.a.w r0 = r0.mo3443e(r9)
            if (r0 == 0) goto L_0x00b8
            java.lang.Class<androidx.appsearch.builtintypes.AlarmInstance> r9 = androidx.appsearch.builtintypes.AlarmInstance.class
            java.lang.Object r0 = r0.mo3446g(r9)
            androidx.appsearch.builtintypes.AlarmInstance r0 = (androidx.appsearch.builtintypes.AlarmInstance) r0
            r21 = r0
            goto L_0x00ba
        L_0x00b8:
            r21 = 0
        L_0x00ba:
            androidx.appsearch.builtintypes.Alarm r22 = new androidx.appsearch.builtintypes.Alarm
            r0 = r22
            r9 = r16
            r14 = r18
            r16 = r19
            r17 = r20
            r18 = r21
            r0.<init>(r1, r2, r3, r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.builtintypes.C$$__AppSearch__Alarm.fromGenericDocument(androidx.appsearch.a.w):androidx.appsearch.builtintypes.Alarm");
    }

    public C0853r getSchema() {
        C0842g gVar = new C0842g(SCHEMA_NAME);
        C0851p pVar = new C0851p("name");
        pVar.mo3412b(2);
        pVar.mo3414d(1);
        pVar.mo3413c(2);
        gVar.mo3395b(pVar.mo3411a());
        C0840e eVar = new C0840e("enabled");
        eVar.mo3393b();
        gVar.mo3395b(eVar.mo3392a());
        C0848m mVar = new C0848m("daysOfWeek");
        mVar.mo3403b(1);
        gVar.mo3395b(mVar.mo3402a());
        C0848m mVar2 = new C0848m("hour");
        mVar2.mo3403b(2);
        gVar.mo3395b(mVar2.mo3402a());
        C0848m mVar3 = new C0848m("minute");
        mVar3.mo3403b(2);
        gVar.mo3395b(mVar3.mo3402a());
        C0851p pVar2 = new C0851p("blackoutPeriodStartDate");
        pVar2.mo3412b(2);
        pVar2.mo3414d(0);
        pVar2.mo3413c(0);
        gVar.mo3395b(pVar2.mo3411a());
        C0851p pVar3 = new C0851p("blackoutPeriodEndDate");
        pVar3.mo3412b(2);
        pVar3.mo3414d(0);
        pVar3.mo3413c(0);
        gVar.mo3395b(pVar3.mo3411a());
        C0851p pVar4 = new C0851p("ringtone");
        pVar4.mo3412b(2);
        pVar4.mo3414d(0);
        pVar4.mo3413c(0);
        gVar.mo3395b(pVar4.mo3411a());
        C0840e eVar2 = new C0840e("shouldVibrate");
        eVar2.mo3393b();
        gVar.mo3395b(eVar2.mo3392a());
        C0845j jVar = new C0845j("previousInstance", C$$__AppSearch__AlarmInstance.SCHEMA_NAME);
        jVar.mo3399b(2);
        gVar.mo3395b(jVar.mo3398a());
        C0845j jVar2 = new C0845j("nextInstance", C$$__AppSearch__AlarmInstance.SCHEMA_NAME);
        jVar2.mo3399b(2);
        gVar.mo3395b(jVar2.mo3398a());
        return gVar.mo3394a();
    }

    public String getSchemaName() {
        return SCHEMA_NAME;
    }

    public C0858w toGenericDocument(Alarm alarm) {
        C0857v vVar = new C0857v(alarm.f2854a, alarm.f2855b, SCHEMA_NAME);
        vVar.mo3434e(alarm.f2857d);
        vVar.mo3431b(alarm.f2858e);
        vVar.mo3430a(alarm.f2856c);
        String str = alarm.f2859f;
        if (str != null) {
            vVar.mo3439j("name", str);
        }
        vVar.mo3435f("enabled", alarm.f2860g);
        int[] iArr = alarm.f2861h;
        if (iArr != null) {
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            vVar.mo3438i("daysOfWeek", jArr);
        }
        vVar.mo3438i("hour", (long) alarm.f2862i);
        vVar.mo3438i("minute", (long) alarm.f2863j);
        String str2 = alarm.f2864k;
        if (str2 != null) {
            vVar.mo3439j("blackoutPeriodStartDate", str2);
        }
        String str3 = alarm.f2865l;
        if (str3 != null) {
            vVar.mo3439j("blackoutPeriodEndDate", str3);
        }
        String str4 = alarm.f2866m;
        if (str4 != null) {
            vVar.mo3439j("ringtone", str4);
        }
        vVar.mo3435f("shouldVibrate", alarm.f2867n);
        AlarmInstance alarmInstance = alarm.f2868o;
        if (alarmInstance != null) {
            vVar.mo3437h("previousInstance", C0858w.m2731d(alarmInstance));
        }
        AlarmInstance alarmInstance2 = alarm.f2869p;
        if (alarmInstance2 != null) {
            vVar.mo3437h("nextInstance", C0858w.m2731d(alarmInstance2));
        }
        return vVar.mo3432c();
    }
}
