package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels;
import com.google.knowledge.cerebra.sense.textclassifier.lib3.LangIdModel;
import com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4677c.C61841b;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
public final class TextClassifierLibImpl extends TextClassifierLib {

    /* renamed from: a */
    public static final C58485gu f167265a = C58485gu.m89834D("view_calendar", "view_map", "track_flight", "open_url", "send_sms", "call_phone", "send_email", "text_reply", "create_reminder", "share_location", "add_contact", "copy", new String[0]);

    /* renamed from: r */
    private static final boolean f167266r = Log.isLoggable("TextClassifierLibImpl", 3);

    /* renamed from: s */
    private static final long f167267s = TimeUnit.HOURS.toMillis(1);

    /* renamed from: A */
    private final Object f167268A = new Object();

    /* renamed from: B */
    private boolean f167269B;

    /* renamed from: C */
    private boolean f167270C;

    /* renamed from: D */
    private final C61909bs f167271D;

    /* renamed from: b */
    public final C60870cx f167272b;

    /* renamed from: c */
    public final C61914bx f167273c;

    /* renamed from: d */
    public final C61951dg f167274d;

    /* renamed from: e */
    public final C61878ao f167275e;

    /* renamed from: f */
    public final C61897bg f167276f;

    /* renamed from: g */
    public final ReadWriteLock f167277g = new ReentrantReadWriteLock();

    /* renamed from: h */
    public final ReadWriteLock f167278h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ReadWriteLock f167279i = new ReentrantReadWriteLock();

    /* renamed from: j */
    public AnnotatorModel f167280j;

    /* renamed from: k */
    public GuardedNativeModels f167281k;

    /* renamed from: l */
    public C61841b f167282l;

    /* renamed from: m */
    public DocumentsAnnotatorModel f167283m;

    /* renamed from: n */
    public LangIdModel f167284n;

    /* renamed from: o */
    public C61841b f167285o;

    /* renamed from: p */
    public ActionsSuggestionsModel f167286p;

    /* renamed from: q */
    public C61841b f167287q;

    /* renamed from: t */
    private final Context f167288t;

    /* renamed from: u */
    private final C61901bk f167289u;

    /* renamed from: v */
    private final C61901bk f167290v;

    /* renamed from: w */
    private final ReadWriteLock f167291w = new ReentrantReadWriteLock();

    /* renamed from: x */
    private final Object f167292x = new Object();

    /* renamed from: y */
    private Date f167293y;

    /* renamed from: z */
    private C61948dd f167294z;

    static {
        C58485gu.m89852t("address", "email", "phone", "url", "date", "datetime", "flight");
    }

    public TextClassifierLibImpl(Context context, C61951dg dgVar, C61909bs bsVar, C58833ax axVar) {
        if (f167266r) {
            int myPid = Process.myPid();
            String packageName = context.getPackageName();
            Log.d("TextClassifierLibImpl", "Init in " + packageName + " (PID " + myPid + ")");
        }
        context.getClass();
        this.f167288t = context;
        dgVar.getClass();
        this.f167274d = dgVar;
        this.f167271D = bsVar;
        C61914bx bxVar = new C61914bx(new C61928ck(this), axVar);
        this.f167273c = bxVar;
        C61901bk bjVar = new C61900bj(new C61929cl(this), new C61930cm(this), new C61931cn(this));
        this.f167289u = bjVar;
        this.f167290v = !dgVar.mo58398a().isEmpty() ? new C61918ca(dgVar.mo58398a()) : bjVar;
        this.f167275e = new C61878ao(context, bxVar, dgVar.mo58408k(), bsVar);
        this.f167276f = new C61897bg(context, dgVar.mo58411n());
        this.f167272b = C60922j.m93044g(bxVar.mo58351a(), new C61932co(this), C60826bg.f164896a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.knowledge.cerebra.sense.textclassifier.tclib.C61894bd m94507h(byte[] r22) {
        /*
            java.lang.String r1 = "Invalid model data."
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.e.f r3 = com.google.knowledge.cerebra.sense.textclassifier.p4681e.C61858f.f167165k     // Catch:{ ct -> 0x024c }
            r5 = r22
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r5, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.e.f r2 = (com.google.knowledge.cerebra.sense.textclassifier.p4681e.C61858f) r2     // Catch:{ ct -> 0x024c }
            java.lang.String r3 = r2.f167170d     // Catch:{ ct -> 0x024c }
            boolean r3 = r3.isEmpty()     // Catch:{ ct -> 0x024c }
            r5 = 0
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = r2.f167170d     // Catch:{ ct -> 0x024c }
            goto L_0x0027
        L_0x0026:
            r3 = r5
        L_0x0027:
            java.lang.String r7 = r2.f167171e     // Catch:{ ct -> 0x024c }
            boolean r7 = r7.isEmpty()     // Catch:{ ct -> 0x024c }
            if (r7 != 0) goto L_0x0034
            java.lang.String r7 = r2.f167171e     // Catch:{ ct -> 0x024c }
            r19 = r7
            goto L_0x0036
        L_0x0034:
            r19 = r5
        L_0x0036:
            com.google.protobuf.cq r7 = r2.f167172f     // Catch:{ ct -> 0x024c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ ct -> 0x024c }
        L_0x003c:
            boolean r8 = r7.hasNext()     // Catch:{ ct -> 0x024c }
            if (r8 == 0) goto L_0x004c
            java.lang.Object r8 = r7.next()     // Catch:{ ct -> 0x024c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61889az.m94553b(r8, r4)     // Catch:{ ct -> 0x024c }
            goto L_0x003c
        L_0x004c:
            int r7 = r2.f167167a     // Catch:{ ct -> 0x024c }
            r8 = r7 & 4
            if (r8 == 0) goto L_0x0061
            r8 = r7 & 8
            if (r8 == 0) goto L_0x0061
            int r8 = r2.f167173g     // Catch:{ ct -> 0x024c }
            int r9 = r2.f167174h     // Catch:{ ct -> 0x024c }
            com.google.common.g.at r8 = com.google.common.p4535g.C59127at.m91611c(r8, r9)     // Catch:{ ct -> 0x024c }
            r20 = r8
            goto L_0x0063
        L_0x0061:
            r20 = r5
        L_0x0063:
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0070
            float r7 = r2.f167175i     // Catch:{ ct -> 0x024c }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ ct -> 0x024c }
            r21 = r7
            goto L_0x0072
        L_0x0070:
            r21 = r5
        L_0x0072:
            com.google.protobuf.cq r7 = r2.f167169c     // Catch:{ ct -> 0x024c }
            boolean r7 = r7.isEmpty()     // Catch:{ ct -> 0x024c }
            if (r7 == 0) goto L_0x00f3
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x00ec }
            com.google.protobuf.cq r8 = r2.f167168b     // Catch:{ ct -> 0x00ec }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ ct -> 0x00ec }
        L_0x0084:
            boolean r9 = r8.hasNext()     // Catch:{ ct -> 0x00ec }
            r10 = 0
            if (r9 == 0) goto L_0x00a3
            java.lang.Object r9 = r8.next()     // Catch:{ ct -> 0x00ec }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ ct -> 0x00ec }
            byte[] r9 = android.util.Base64.decode(r9, r10)     // Catch:{ ct -> 0x00ec }
            com.google.protobuf.ba r10 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x00ec }
            com.google.android.apps.d.a.c.a.a.b r11 = com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9035b.f31234b     // Catch:{ ct -> 0x00ec }
            com.google.protobuf.bv r9 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r11, (byte[]) r9, (com.google.protobuf.C62921ba) r10)     // Catch:{ ct -> 0x00ec }
            com.google.android.apps.d.a.c.a.a.b r9 = (com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9035b) r9     // Catch:{ ct -> 0x00ec }
            r7.mo55395g(r9)     // Catch:{ ct -> 0x00ec }
            goto L_0x0084
        L_0x00a3:
            com.google.common.b.gu r7 = r7.mo55394f()     // Catch:{ ct -> 0x00ec }
            com.google.common.b.sm r7 = r7.listIterator(r10)     // Catch:{ ct -> 0x024c }
        L_0x00ab:
            boolean r8 = r7.hasNext()     // Catch:{ ct -> 0x024c }
            if (r8 == 0) goto L_0x0154
            java.lang.Object r8 = r7.next()     // Catch:{ ct -> 0x024c }
            com.google.android.apps.d.a.c.a.a.b r8 = (com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9035b) r8     // Catch:{ ct -> 0x024c }
            com.google.android.apps.d.a.c.a.a.d r9 = r8.f31236a     // Catch:{ ct -> 0x024c }
            if (r9 != 0) goto L_0x00bd
            com.google.android.apps.d.a.c.a.a.d r9 = com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9037d.f31238c     // Catch:{ ct -> 0x024c }
        L_0x00bd:
            com.google.android.apps.d.a.c.a.a.f r9 = r9.f31241b     // Catch:{ ct -> 0x024c }
            if (r9 != 0) goto L_0x00c3
            com.google.android.apps.d.a.c.a.a.f r9 = com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9039f.f31243c     // Catch:{ ct -> 0x024c }
        L_0x00c3:
            int r10 = r9.f31245a     // Catch:{ ct -> 0x024c }
            r11 = 1
            if (r10 == r11) goto L_0x00c9
            goto L_0x00ab
        L_0x00c9:
            com.google.common.b.gp r10 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x024c }
            com.google.android.apps.d.a.c.a.a.d r8 = r8.f31236a     // Catch:{ ct -> 0x024c }
            if (r8 != 0) goto L_0x00d3
            com.google.android.apps.d.a.c.a.a.d r8 = com.google.android.apps.p471d.p472a.p479c.p480a.p481a.C9037d.f31238c     // Catch:{ ct -> 0x024c }
        L_0x00d3:
            java.lang.String r8 = r8.f31240a     // Catch:{ ct -> 0x024c }
            java.lang.String r12 = ""
            int r13 = r9.f31245a     // Catch:{ ct -> 0x024c }
            if (r13 != r11) goto L_0x00e0
            java.lang.Object r9 = r9.f31246b     // Catch:{ ct -> 0x024c }
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ ct -> 0x024c }
        L_0x00e0:
            android.net.Uri r9 = android.net.Uri.parse(r12)     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData$KgDeeplink r8 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61893bc.m94554a(r8, r9, r10, r5)     // Catch:{ ct -> 0x024c }
            r6.mo55395g(r8)     // Catch:{ ct -> 0x024c }
            goto L_0x00ab
        L_0x00ec:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ ct -> 0x024c }
            r2.<init>(r1, r0)     // Catch:{ ct -> 0x024c }
            throw r2     // Catch:{ ct -> 0x024c }
        L_0x00f3:
            com.google.protobuf.cq r5 = r2.f167169c     // Catch:{ ct -> 0x024c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ ct -> 0x024c }
        L_0x00f9:
            boolean r7 = r5.hasNext()     // Catch:{ ct -> 0x024c }
            if (r7 == 0) goto L_0x0154
            java.lang.Object r7 = r5.next()     // Catch:{ ct -> 0x024c }
            com.google.bs.b.a.g r7 = (com.google.p4273bs.p4277b.p4278a.C56467g) r7     // Catch:{ ct -> 0x024c }
            com.google.common.b.gp r8 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x024c }
            java.lang.String r9 = r7.f150834a     // Catch:{ ct -> 0x024c }
            java.lang.String r10 = r7.f150835b     // Catch:{ ct -> 0x024c }
            android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ ct -> 0x024c }
            java.lang.String r11 = r7.f150837e     // Catch:{ ct -> 0x024c }
            com.google.protobuf.cj r12 = new com.google.protobuf.cj     // Catch:{ ct -> 0x024c }
            com.google.protobuf.ch r7 = r7.f150836c     // Catch:{ ct -> 0x024c }
            com.google.protobuf.ci r13 = com.google.p4273bs.p4277b.p4278a.C56467g.f150831d     // Catch:{ ct -> 0x024c }
            r12.<init>(r7, r13)     // Catch:{ ct -> 0x024c }
            java.util.Iterator r7 = r12.iterator()     // Catch:{ ct -> 0x024c }
        L_0x0120:
            boolean r12 = r7.hasNext()     // Catch:{ ct -> 0x024c }
            if (r12 == 0) goto L_0x014c
            java.lang.Object r12 = r7.next()     // Catch:{ ct -> 0x024c }
            com.google.bs.b.a.d r12 = (com.google.p4273bs.p4277b.p4278a.C56464d) r12     // Catch:{ ct -> 0x024c }
            int r12 = r12.f150830o     // Catch:{ ct -> 0x024c }
            com.google.common.b.hd r13 = com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData.KgDeeplink.f167260a     // Catch:{ ct -> 0x024c }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ ct -> 0x024c }
            boolean r13 = r13.containsKey(r12)     // Catch:{ ct -> 0x024c }
            if (r13 != 0) goto L_0x0140
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bb r12 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61892bb.ACTION_UNSPECIFIED     // Catch:{ ct -> 0x024c }
            r8.mo55395g(r12)     // Catch:{ ct -> 0x024c }
            goto L_0x0120
        L_0x0140:
            com.google.common.b.hd r13 = com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData.KgDeeplink.f167260a     // Catch:{ ct -> 0x024c }
            java.lang.Object r12 = r13.get(r12)     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bb r12 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61892bb) r12     // Catch:{ ct -> 0x024c }
            r8.mo55395g(r12)     // Catch:{ ct -> 0x024c }
            goto L_0x0120
        L_0x014c:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData$KgDeeplink r7 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61893bc.m94554a(r9, r10, r8, r11)     // Catch:{ ct -> 0x024c }
            r6.mo55395g(r7)     // Catch:{ ct -> 0x024c }
            goto L_0x00f9
        L_0x0154:
            com.google.protobuf.cq r2 = r2.f167176j     // Catch:{ ct -> 0x024c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ ct -> 0x024c }
        L_0x015a:
            boolean r5 = r2.hasNext()     // Catch:{ ct -> 0x024c }
            if (r5 == 0) goto L_0x0177
            java.lang.Object r5 = r2.next()     // Catch:{ ct -> 0x024c }
            com.google.bs.b.a.b r5 = (com.google.p4273bs.p4277b.p4278a.C56462b) r5     // Catch:{ ct -> 0x024c }
            java.lang.String r7 = r5.f150809a     // Catch:{ ct -> 0x024c }
            java.lang.String r8 = r5.f150810b     // Catch:{ ct -> 0x024c }
            float r9 = r5.f150811c     // Catch:{ ct -> 0x024c }
            float r5 = r5.f150812d     // Catch:{ ct -> 0x024c }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData$BroaderUserInterest r10 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData$BroaderUserInterest     // Catch:{ ct -> 0x024c }
            r10.<init>(r7, r8, r9, r5)     // Catch:{ ct -> 0x024c }
            r0.mo55395g(r10)     // Catch:{ ct -> 0x024c }
            goto L_0x015a
        L_0x0177:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r2 = r3
            r3 = r19
            r5 = r20
            r19 = r21
            r20 = r0
            com.google.knowledge.cerebra.sense.textclassifier.tclib.Entity1PData r0 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61889az.m94552a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r2 = "textclassifier.extras.KG_MID"
            java.lang.String r3 = r0.f167237a
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.KG_TITLE"
            java.lang.String r3 = r0.f167238b
            r1.putString(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.common.b.gg r3 = r0.f167239c
            r2.<init>(r3)
            java.lang.String r3 = "textclassifier.extras.KG_COLLECTION_HRIDS"
            r1.putStringArrayList(r3, r2)
            java.lang.String r2 = "textclassifier.extras.KG_LAT_LNG"
            com.google.common.g.at r3 = r0.f167240d
            r1.putSerializable(r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.common.b.gg r3 = r0.f167241e
            r2.<init>(r3)
            java.lang.String r3 = "textclassifier.extras.KG_DEEPLINKS"
            r1.putParcelableArrayList(r3, r2)
            java.lang.String r2 = "textclassifier.extras.CONTACT_NAME"
            java.lang.String r3 = r0.f167242f
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_GIVEN_NAME"
            java.lang.String r3 = r0.f167243g
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_FAMILY_NAME"
            java.lang.String r3 = r0.f167244h
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_NICKNAME"
            java.lang.String r3 = r0.f167245i
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_EMAIL_ADDRESS"
            java.lang.String r3 = r0.f167246j
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_PHONE_NUMBER"
            java.lang.String r3 = r0.f167247k
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_ACCOUNT_TYPE"
            java.lang.String r3 = r0.f167248l
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_ACCOUNT_NAME"
            java.lang.String r3 = r0.f167249m
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_ID"
            java.lang.String r3 = r0.f167251o
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.CONTACT_ALTERNATE_NAME"
            java.lang.String r3 = r0.f167250n
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.APP_NAME"
            java.lang.String r3 = r0.f167252p
            r1.putString(r2, r3)
            java.lang.String r2 = "textclassifier.extras.APP_PACKAGE_NAME"
            java.lang.String r3 = r0.f167253q
            r1.putString(r2, r3)
            java.lang.Float r2 = r0.f167254r
            if (r2 == 0) goto L_0x0226
            java.lang.String r3 = "textclassifier.extras.KG_TOPICALITY_SCORE"
            float r2 = r2.floatValue()
            r1.putFloat(r3, r2)
        L_0x0226:
            com.google.common.b.gg r2 = r0.f167255s
            if (r2 == 0) goto L_0x023c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x023c
            java.util.ArrayList r2 = new java.util.ArrayList
            com.google.common.b.gg r0 = r0.f167255s
            r2.<init>(r0)
            java.lang.String r0 = "textclassifier.extras.BROADER_USER_INTERESTS"
            r1.putParcelableArrayList(r0, r2)
        L_0x023c:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.os.Bundle r1 = r1.deepCopy()
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bd r2 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.bd
            r2.<init>(r0, r1)
            return r2
        L_0x024c:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1, r0)
            goto L_0x0254
        L_0x0253:
            throw r2
        L_0x0254:
            goto L_0x0253
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.m94507h(byte[]):com.google.knowledge.cerebra.sense.textclassifier.tclib.bd");
    }

    /* renamed from: l */
    public static TextClassifierLibImpl m94508l(Context context, C61951dg dgVar) {
        return new TextClassifierLibImpl(context, dgVar, new C61909bs(context), C58836b.f156633a);
    }

    /* renamed from: m */
    private final void m94509m() {
        Date date = new Date();
        synchronized (this.f167292x) {
            boolean z = false;
            if (this.f167293y != null && date.getTime() < this.f167293y.getTime() + f167267s) {
                z = true;
            }
            C61969l lVar = new C61969l(this.f167271D.mo58345a());
            if (z) {
                if (lVar.equals(this.f167294z)) {
                    Log.d("TextClassifierLibImpl", "Skipping async model load. Loaded recently, no change to permissions.");
                    return;
                }
            }
            this.f167293y = date;
            this.f167294z = lVar;
            this.f167273c.mo58352b();
        }
    }

    /* renamed from: a */
    public final C60870cx mo58300a() {
        if (f167266r) {
            int myPid = Process.myPid();
            Log.d("TextClassifierLibImpl", "close() in PID " + myPid);
        }
        synchronized (this.f167268A) {
            C58838bb.m90883r(!this.f167269B);
            this.f167269B = true;
        }
        return C60922j.m93044g(this.f167273c.mo58351a(), C61936cs.f167413a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo58301b() {
        return C60922j.m93044g(C60922j.m93045h(this.f167272b, new C61937ct(this), C60826bg.f164896a), C61938cu.f167415a, C60826bg.f164896a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0384, code lost:
        if (androidx.core.content.C1882h.m5137c(r6, r0.permission) == 0) goto L_0x0386;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0352 A[Catch:{ NameNotFoundException -> 0x03c2, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03cd A[Catch:{ NameNotFoundException -> 0x03c2, all -> 0x0580 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0443 A[Catch:{ NameNotFoundException -> 0x03c2, all -> 0x0580 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw mo58302c(com.google.knowledge.cerebra.sense.textclassifier.tclib.C61885av r37) {
        /*
            r36 = this;
            r1 = r36
            r2 = r37
            boolean r0 = f167266r
            if (r0 == 0) goto L_0x001f
            int r0 = android.os.Process.myPid()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "suggestConversationActions in PID "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "TextClassifierLibImpl"
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r0, r3)
        L_0x001f:
            r5 = 0
            com.google.common.util.concurrent.cx r0 = r1.f167272b     // Catch:{ CancellationException -> 0x0598, ExecutionException -> 0x0596, InterruptedException -> 0x0594 }
            r0.get()     // Catch:{ CancellationException -> 0x0598, ExecutionException -> 0x0596, InterruptedException -> 0x0594 }
            r36.m94509m()
            java.util.concurrent.locks.ReadWriteLock r0 = r1.f167277g
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            java.util.concurrent.locks.ReadWriteLock r0 = r1.f167279i
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel r0 = r1.f167286p     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x005d
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.as r0 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw.m94546d(r0)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r0 = r0.mo58323a()     // Catch:{ all -> 0x0580 }
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167277g
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167279i
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            return r0
        L_0x005d:
            java.util.List r0 = r2.f167340a     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bk r6 = r1.f167290v     // Catch:{ all -> 0x0580 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            r7.<init>()     // Catch:{ all -> 0x0580 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0580 }
        L_0x006a:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x0580 }
            if (r8 == 0) goto L_0x0082
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.at r8 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61883at) r8     // Catch:{ all -> 0x0580 }
            java.lang.CharSequence r9 = r8.f167337d     // Catch:{ all -> 0x0580 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0580 }
            if (r9 != 0) goto L_0x006a
            r7.add(r8)     // Catch:{ all -> 0x0580 }
            goto L_0x006a
        L_0x0082:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x008c
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ConversationMessage[] r0 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel.ConversationMessage[r5]     // Catch:{ all -> 0x0580 }
            goto L_0x0106
        L_0x008c:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ all -> 0x0580 }
            r0.<init>()     // Catch:{ all -> 0x0580 }
            com.google.common.base.af r8 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61890b.f167345a     // Catch:{ all -> 0x0580 }
            androidx.c.g r8 = new androidx.c.g     // Catch:{ all -> 0x0580 }
            r8.<init>()     // Catch:{ all -> 0x0580 }
            int r9 = r7.size()     // Catch:{ all -> 0x0580 }
            int r9 = r9 + -1
            r10 = 1
        L_0x009f:
            if (r9 < 0) goto L_0x00fa
            java.lang.Object r11 = r7.get(r9)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.at r11 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61883at) r11     // Catch:{ all -> 0x0580 }
            java.lang.Long r12 = r11.f167336c     // Catch:{ all -> 0x0580 }
            long r16 = r12.longValue()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ConversationMessage r12 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ConversationMessage     // Catch:{ all -> 0x0580 }
            androidx.core.app.at r13 = r11.f167335b     // Catch:{ all -> 0x0580 }
            com.google.common.base.af r14 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61890b.f167345a     // Catch:{ all -> 0x0580 }
            com.google.common.base.ae r15 = new com.google.common.base.ae     // Catch:{ all -> 0x0580 }
            r15.<init>(r14, r13)     // Catch:{ all -> 0x0580 }
            com.google.common.base.ae r13 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61890b.f167346b     // Catch:{ all -> 0x0580 }
            boolean r13 = r13.equals(r15)     // Catch:{ all -> 0x0580 }
            if (r13 == 0) goto L_0x00c2
            r14 = 0
            goto L_0x00dc
        L_0x00c2:
            java.lang.Object r13 = r8.get(r15)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x0580 }
            if (r13 != 0) goto L_0x00d7
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0580 }
            r8.put(r15, r13)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0580 }
            int r10 = r10 + 1
        L_0x00d7:
            int r13 = r13.intValue()     // Catch:{ all -> 0x0580 }
            r14 = r13
        L_0x00dc:
            java.lang.CharSequence r13 = r11.f167337d     // Catch:{ all -> 0x0580 }
            java.lang.String r15 = r13.toString()     // Catch:{ all -> 0x0580 }
            java.util.TimeZone r13 = java.util.TimeZone.getDefault()     // Catch:{ all -> 0x0580 }
            java.lang.String r18 = r13.getID()     // Catch:{ all -> 0x0580 }
            java.lang.CharSequence r11 = r11.f167337d     // Catch:{ all -> 0x0580 }
            java.lang.String r19 = r6.mo58337b(r11)     // Catch:{ all -> 0x0580 }
            r13 = r12
            r13.<init>(r14, r15, r16, r18, r19)     // Catch:{ all -> 0x0580 }
            r0.push(r12)     // Catch:{ all -> 0x0580 }
            int r9 = r9 + -1
            goto L_0x009f
        L_0x00fa:
            int r6 = r0.size()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ConversationMessage[] r6 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel.ConversationMessage[r6]     // Catch:{ all -> 0x0580 }
            java.lang.Object[] r0 = r0.toArray(r6)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ConversationMessage[] r0 = (com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel.ConversationMessage[]) r0     // Catch:{ all -> 0x0580 }
        L_0x0106:
            int r6 = r0.length     // Catch:{ all -> 0x0580 }
            if (r6 != 0) goto L_0x0128
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.as r0 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw.m94546d(r0)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r0 = r0.mo58323a()     // Catch:{ all -> 0x0580 }
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167277g
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167279i
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            return r0
        L_0x0128:
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$Conversation r9 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$Conversation     // Catch:{ all -> 0x0580 }
            r9.<init>(r0)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel r6 = r1.f167286p     // Catch:{ all -> 0x0580 }
            android.content.Context r13 = r1.f167288t     // Catch:{ all -> 0x0580 }
            android.content.res.Resources r0 = r13.getResources()     // Catch:{ all -> 0x0580 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ all -> 0x0580 }
            android.os.LocaleList r0 = r0.getLocales()     // Catch:{ all -> 0x0580 }
            java.lang.String r14 = r0.toLanguageTags()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.AnnotatorModel r0 = r1.f167280j     // Catch:{ all -> 0x0580 }
            long r7 = r6.f167177a     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x014e
            long r10 = r0.f167199a     // Catch:{ all -> 0x0580 }
            long r10 = r0.nativeGetNativeModelPtr(r10)     // Catch:{ all -> 0x0580 }
            goto L_0x0150
        L_0x014e:
            r10 = 0
        L_0x0150:
            r11 = r10
            r10 = 0
            r15 = 1
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ActionSuggestions r6 = r6.nativeSuggestActions(r7, r9, r10, r11, r13, r14, r15)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ce r0 = r2.f167341b     // Catch:{ all -> 0x0580 }
            com.google.common.b.gu r7 = f167265a     // Catch:{ all -> 0x0580 }
            androidx.c.i r8 = new androidx.c.i     // Catch:{ all -> 0x0580 }
            r8.<init>((int) r5)     // Catch:{ all -> 0x0580 }
            if (r7 == 0) goto L_0x0165
            r8.addAll(r7)     // Catch:{ all -> 0x0580 }
        L_0x0165:
            java.util.List r7 = r0.f167403c     // Catch:{ all -> 0x0580 }
            r8.addAll(r7)     // Catch:{ all -> 0x0580 }
            java.util.List r0 = r0.f167402b     // Catch:{ all -> 0x0580 }
            r8.removeAll(r0)     // Catch:{ all -> 0x0580 }
            java.util.Collection r7 = java.util.Collections.unmodifiableCollection(r8)     // Catch:{ all -> 0x0580 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            r8.<init>()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$ActionSuggestion[] r9 = r6.f167186a     // Catch:{ all -> 0x0580 }
            int r10 = r9.length     // Catch:{ all -> 0x0580 }
            r11 = 0
        L_0x017c:
            if (r11 >= r10) goto L_0x0480
            r12 = r9[r11]     // Catch:{ all -> 0x0580 }
            java.lang.String r13 = r12.f167180b     // Catch:{ all -> 0x0580 }
            boolean r0 = r7.contains(r13)     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0195
            r20 = r6
            r26 = r7
            r2 = r8
            r27 = r9
            r28 = r10
            r21 = r11
            goto L_0x0470
        L_0x0195:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            r0.<init>()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel$Slot[] r14 = r12.f167185g     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x01d6
            int r15 = r14.length     // Catch:{ all -> 0x0580 }
            r4 = 0
        L_0x01a0:
            if (r4 >= r15) goto L_0x01d6
            r3 = r14[r4]     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r3.f167194a     // Catch:{ all -> 0x0580 }
            r26 = r7
            int r7 = r3.f167195b     // Catch:{ all -> 0x0580 }
            r27 = r9
            int r9 = r3.f167196c     // Catch:{ all -> 0x0580 }
            r28 = r10
            int r10 = r3.f167197d     // Catch:{ all -> 0x0580 }
            float r3 = r3.f167198e     // Catch:{ all -> 0x0580 }
            r16 = r14
            com.google.knowledge.cerebra.sense.textclassifier.tclib.i r14 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.i     // Catch:{ all -> 0x0580 }
            r20 = r14
            r21 = r5
            r22 = r7
            r23 = r9
            r24 = r10
            r25 = r3
            r20.<init>(r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0580 }
            r0.add(r14)     // Catch:{ all -> 0x0580 }
            int r4 = r4 + 1
            r14 = r16
            r7 = r26
            r9 = r27
            r10 = r28
            r5 = 0
            goto L_0x01a0
        L_0x01d6:
            r26 = r7
            r27 = r9
            r28 = r10
            r13.getClass()
            float r3 = r12.f167181c     // Catch:{ all -> 0x0580 }
            java.lang.String r15 = r12.f167179a     // Catch:{ all -> 0x0580 }
            com.google.common.b.gu r18 = com.google.common.p4522b.C58485gu.m89842j(r0)     // Catch:{ all -> 0x0580 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x0580 }
            r4.<init>()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.RemoteActionTemplate[] r0 = r12.f167184f     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0200
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0580 }
        L_0x01f4:
            r23 = r3
            r20 = r6
            r22 = r8
            r21 = r11
            r24 = r15
            goto L_0x034c
        L_0x0200:
            int r5 = r0.length     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x0208
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x0580 }
            goto L_0x01f4
        L_0x0208:
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0580 }
            r9 = 0
        L_0x020d:
            if (r9 >= r5) goto L_0x033e
            r10 = r0[r9]     // Catch:{ all -> 0x0580 }
            if (r10 != 0) goto L_0x021b
            java.lang.String r10 = "Invalid RemoteActionTemplate: is null"
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
            goto L_0x0262
        L_0x021b:
            java.lang.String r14 = r10.f167222b     // Catch:{ all -> 0x0580 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x0233
            java.lang.String r14 = r10.f167221a     // Catch:{ all -> 0x0580 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x0233
            java.lang.String r10 = "Invalid RemoteActionTemplate: title is null"
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
            goto L_0x0262
        L_0x0233:
            java.lang.String r14 = r10.f167223c     // Catch:{ all -> 0x0580 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x0243
            java.lang.String r10 = "Invalid RemoteActionTemplate: description is null"
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
            goto L_0x0262
        L_0x0243:
            java.lang.String r14 = r10.f167230j     // Catch:{ all -> 0x0580 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0580 }
            if (r14 != 0) goto L_0x0253
            java.lang.String r10 = "Invalid RemoteActionTemplate: package name is set"
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
            goto L_0x0262
        L_0x0253:
            java.lang.String r14 = r10.f167225e     // Catch:{ all -> 0x0580 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x0580 }
            if (r14 == 0) goto L_0x0279
            java.lang.String r10 = "Invalid RemoteActionTemplate: intent action not set"
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
        L_0x0262:
            java.lang.String r10 = "Invalid RemoteActionTemplate skipped."
            java.lang.String r14 = "androidtc"
            android.util.Log.w(r14, r10)     // Catch:{ all -> 0x0580 }
            r16 = r0
            r23 = r3
            r17 = r5
            r20 = r6
            r22 = r8
            r21 = r11
            r24 = r15
            goto L_0x032a
        L_0x0279:
            com.google.knowledge.cerebra.sense.textclassifier.a.b.b r14 = new com.google.knowledge.cerebra.sense.textclassifier.a.b.b     // Catch:{ all -> 0x0580 }
            r16 = r0
            java.lang.String r0 = r10.f167221a     // Catch:{ all -> 0x0580 }
            r17 = r5
            java.lang.String r5 = r10.f167222b     // Catch:{ all -> 0x0580 }
            r20 = r6
            java.lang.String r6 = r10.f167223c     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = r10.f167224d     // Catch:{ all -> 0x0580 }
            r21 = r11
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x0580 }
            r22 = r8
            java.lang.String r8 = r10.f167225e     // Catch:{ all -> 0x0580 }
            r11.<init>(r8)     // Catch:{ all -> 0x0580 }
            java.lang.String r8 = r10.f167226f     // Catch:{ all -> 0x0580 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0580 }
            if (r8 == 0) goto L_0x02a0
            r23 = r3
            r8 = 0
            goto L_0x02ac
        L_0x02a0:
            java.lang.String r8 = r10.f167226f     // Catch:{ all -> 0x0580 }
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x0580 }
            android.net.Uri r8 = r8.normalizeScheme()     // Catch:{ all -> 0x0580 }
            r23 = r3
        L_0x02ac:
            java.lang.String r3 = r10.f167227g     // Catch:{ all -> 0x0580 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0580 }
            if (r3 == 0) goto L_0x02b6
            r3 = 0
            goto L_0x02bc
        L_0x02b6:
            java.lang.String r3 = r10.f167227g     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = android.content.Intent.normalizeMimeType(r3)     // Catch:{ all -> 0x0580 }
        L_0x02bc:
            r11.setDataAndType(r8, r3)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r3 = r10.f167228h     // Catch:{ all -> 0x0580 }
            if (r3 != 0) goto L_0x02c5
            r3 = 0
            goto L_0x02c9
        L_0x02c5:
            int r3 = r3.intValue()     // Catch:{ all -> 0x0580 }
        L_0x02c9:
            r11.setFlags(r3)     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = r10.f167230j     // Catch:{ all -> 0x0580 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0580 }
            if (r3 != 0) goto L_0x02d9
            java.lang.String r3 = r10.f167230j     // Catch:{ all -> 0x0580 }
            r11.setPackage(r3)     // Catch:{ all -> 0x0580 }
        L_0x02d9:
            java.lang.String[] r3 = r10.f167229i     // Catch:{ all -> 0x0580 }
            if (r3 == 0) goto L_0x02f1
            int r8 = r3.length     // Catch:{ all -> 0x0580 }
            r24 = r15
            r15 = 0
        L_0x02e1:
            if (r15 >= r8) goto L_0x02f3
            r25 = r8
            r8 = r3[r15]     // Catch:{ all -> 0x0580 }
            if (r8 == 0) goto L_0x02ec
            r11.addCategory(r8)     // Catch:{ all -> 0x0580 }
        L_0x02ec:
            int r15 = r15 + 1
            r8 = r25
            goto L_0x02e1
        L_0x02f1:
            r24 = r15
        L_0x02f3:
            com.google.knowledge.cerebra.sense.textclassifier.lib3.NamedVariant[] r3 = r10.f167231k     // Catch:{ all -> 0x0580 }
            android.os.Bundle r3 = com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4676b.C61839c.m94490a(r3)     // Catch:{ all -> 0x0580 }
            r11.putExtras(r3)     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER"
            boolean r3 = r11.hasExtra(r3)     // Catch:{ all -> 0x0580 }
            if (r3 != 0) goto L_0x030b
            java.lang.String r3 = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER"
            android.os.Bundle r8 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x0580 }
            r11.putExtra(r3, r8)     // Catch:{ all -> 0x0580 }
        L_0x030b:
            java.lang.Integer r3 = r10.f167232l     // Catch:{ all -> 0x0580 }
            if (r3 != 0) goto L_0x0312
            r35 = 0
            goto L_0x0318
        L_0x0312:
            int r3 = r3.intValue()     // Catch:{ all -> 0x0580 }
            r35 = r3
        L_0x0318:
            r29 = r14
            r30 = r0
            r31 = r5
            r32 = r6
            r33 = r2
            r34 = r11
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0580 }
            r7.mo55395g(r14)     // Catch:{ all -> 0x0580 }
        L_0x032a:
            int r9 = r9 + 1
            r2 = r37
            r0 = r16
            r5 = r17
            r6 = r20
            r11 = r21
            r8 = r22
            r3 = r23
            r15 = r24
            goto L_0x020d
        L_0x033e:
            r23 = r3
            r20 = r6
            r22 = r8
            r21 = r11
            r24 = r15
            com.google.common.b.gu r0 = r7.mo55394f()     // Catch:{ all -> 0x0580 }
        L_0x034c:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0580 }
            if (r2 != 0) goto L_0x044e
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0580 }
            r3 = r0
            com.google.knowledge.cerebra.sense.textclassifier.a.b.b r3 = (com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4676b.C61838b) r3     // Catch:{ all -> 0x0580 }
            android.content.Context r6 = r1.f167288t     // Catch:{ all -> 0x0580 }
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch:{ all -> 0x0580 }
            android.content.Intent r5 = r3.f167100e     // Catch:{ all -> 0x0580 }
            android.content.pm.ResolveInfo r10 = r0.resolveActivity(r5, r2)     // Catch:{ all -> 0x0580 }
            r2 = 17301573(0x1080045, float:2.4979448E-38)
            if (r10 == 0) goto L_0x03fa
            android.content.pm.ActivityInfo r0 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0371
            goto L_0x03fa
        L_0x0371:
            android.content.pm.ActivityInfo r0 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            boolean r5 = r0.exported     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x0379
            goto L_0x03e6
        L_0x0379:
            java.lang.String r5 = r0.permission     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x037e
            goto L_0x0386
        L_0x037e:
            java.lang.String r0 = r0.permission     // Catch:{ all -> 0x0580 }
            int r0 = androidx.core.content.C1882h.m5137c(r6, r0)     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x03e6
        L_0x0386:
            android.content.pm.ActivityInfo r0 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0580 }
            android.content.pm.ActivityInfo r5 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x03de
            if (r5 != 0) goto L_0x0393
            goto L_0x03de
        L_0x0393:
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x0580 }
            android.content.Intent r7 = r3.f167100e     // Catch:{ all -> 0x0580 }
            r11.<init>(r7)     // Catch:{ all -> 0x0580 }
            java.lang.String r7 = "android"
            boolean r7 = r7.equals(r0)     // Catch:{ all -> 0x0580 }
            if (r7 != 0) goto L_0x03c9
            android.content.ComponentName r7 = new android.content.ComponentName     // Catch:{ all -> 0x0580 }
            r7.<init>(r0, r5)     // Catch:{ all -> 0x0580 }
            r11.setComponent(r7)     // Catch:{ all -> 0x0580 }
            android.content.pm.ActivityInfo r5 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            int r5 = r5.getIconResource()     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x03c9
            android.content.pm.ActivityInfo r5 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            int r5 = r5.getIconResource()     // Catch:{ all -> 0x0580 }
            r7 = 0
            android.content.Context r0 = r6.createPackageContext(r0, r7)     // Catch:{ NameNotFoundException -> 0x03c2 }
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m5206i(r0, r5)     // Catch:{ NameNotFoundException -> 0x03c2 }
            goto L_0x03c7
        L_0x03c2:
            r0 = move-exception
            com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4675a.C61836a.m94487b(r0)     // Catch:{ all -> 0x0580 }
            r0 = 0
        L_0x03c7:
            r9 = 1
            goto L_0x03cb
        L_0x03c9:
            r0 = 0
            r9 = 0
        L_0x03cb:
            if (r0 != 0) goto L_0x03d1
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m5206i(r6, r2)     // Catch:{ all -> 0x0580 }
        L_0x03d1:
            r8 = r0
            r5 = r3
            r7 = r11
            androidx.core.app.RemoteActionCompat r0 = r5.mo58208a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.a.b.a r2 = new com.google.knowledge.cerebra.sense.textclassifier.a.b.a     // Catch:{ all -> 0x0580 }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x0580 }
            goto L_0x0441
        L_0x03de:
            java.lang.String r0 = "packageName or className is null"
            java.lang.String r2 = "androidtc"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0580 }
            goto L_0x0427
        L_0x03e6:
            java.lang.String r0 = "No permission to access: "
            android.content.pm.ActivityInfo r2 = r10.activityInfo     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4675a.C61836a.m94486a(r0)     // Catch:{ all -> 0x0580 }
            goto L_0x0427
        L_0x03fa:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r5 = r3.f167100e     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = r5.getAction()     // Catch:{ all -> 0x0580 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0580 }
            if (r0 != 0) goto L_0x0409
            goto L_0x0420
        L_0x0409:
            android.content.Intent r0 = r3.f167100e     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.getScheme()     // Catch:{ all -> 0x0580 }
            java.lang.String r5 = "http"
            boolean r5 = com.google.common.base.C58832aw.m90831a(r0, r5)     // Catch:{ all -> 0x0580 }
            if (r5 != 0) goto L_0x0429
            java.lang.String r5 = "https"
            boolean r0 = com.google.common.base.C58832aw.m90831a(r0, r5)     // Catch:{ all -> 0x0580 }
            if (r0 == 0) goto L_0x0420
            goto L_0x0429
        L_0x0420:
            java.lang.String r0 = "resolveInfo or activityInfo is null"
            java.lang.String r2 = "androidtc"
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0580 }
        L_0x0427:
            r2 = 0
            goto L_0x0441
        L_0x0429:
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.m5206i(r6, r2)     // Catch:{ all -> 0x0580 }
            android.content.Intent r7 = r3.f167100e     // Catch:{ all -> 0x0580 }
            r9 = 0
            r5 = r3
            androidx.core.app.RemoteActionCompat r0 = r5.mo58208a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.a.b.a r2 = new com.google.knowledge.cerebra.sense.textclassifier.a.b.a     // Catch:{ all -> 0x0580 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x0580 }
            android.content.Intent r3 = r3.f167100e     // Catch:{ all -> 0x0580 }
            r5.<init>(r3)     // Catch:{ all -> 0x0580 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0580 }
        L_0x0441:
            if (r2 == 0) goto L_0x044e
            androidx.core.app.RemoteActionCompat r0 = r2.f167095b     // Catch:{ all -> 0x0580 }
            java.lang.String r3 = "action-intent"
            android.content.Intent r2 = r2.f167094a     // Catch:{ all -> 0x0580 }
            r4.putParcelable(r3, r2)     // Catch:{ all -> 0x0580 }
            r14 = r0
            goto L_0x044f
        L_0x044e:
            r14 = 0
        L_0x044f:
            byte[] r0 = r12.f167183e     // Catch:{ all -> 0x0580 }
            java.lang.String r2 = "serialized-entities-data"
            r4.putByteArray(r2, r0)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = "entities-extras"
            com.google.knowledge.cerebra.sense.textclassifier.lib3.NamedVariant[] r2 = r12.f167182d     // Catch:{ all -> 0x0580 }
            android.os.Bundle r2 = com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4676b.C61839c.m94490a(r2)     // Catch:{ all -> 0x0580 }
            r4.putParcelable(r0, r2)     // Catch:{ all -> 0x0580 }
            r15 = r24
            r16 = r23
            r17 = r4
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aq r0 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61879ap.m94543a(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0580 }
            r2 = r22
            r2.add(r0)     // Catch:{ all -> 0x0580 }
        L_0x0470:
            int r11 = r21 + 1
            r8 = r2
            r6 = r20
            r7 = r26
            r9 = r27
            r10 = r28
            r5 = 0
            r2 = r37
            goto L_0x017c
        L_0x0480:
            r20 = r6
            r2 = r8
            androidx.c.g r0 = new androidx.c.g     // Catch:{ all -> 0x0580 }
            r0.<init>()     // Catch:{ all -> 0x0580 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0580 }
        L_0x048c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0580 }
            if (r4 == 0) goto L_0x04ba
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aq r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61880aq) r4     // Catch:{ all -> 0x0580 }
            android.util.Pair r4 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61917c.m94581a(r4)     // Catch:{ all -> 0x0580 }
            if (r4 == 0) goto L_0x048c
            boolean r5 = r0.containsKey(r4)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x04af
            java.lang.Object r5 = r0.get(r4)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0580 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0580 }
            goto L_0x04b0
        L_0x04af:
            r5 = 0
        L_0x04b0:
            r6 = 1
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0580 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0580 }
            goto L_0x048c
        L_0x04ba:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0580 }
            r3.<init>()     // Catch:{ all -> 0x0580 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0580 }
        L_0x04c3:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0580 }
            if (r4 == 0) goto L_0x04e6
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aq r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61880aq) r4     // Catch:{ all -> 0x0580 }
            android.util.Pair r5 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61917c.m94581a(r4)     // Catch:{ all -> 0x0580 }
            if (r5 == 0) goto L_0x04e2
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0580 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0580 }
            r6 = 1
            if (r5 != r6) goto L_0x04c3
        L_0x04e2:
            r3.add(r4)     // Catch:{ all -> 0x0580 }
            goto L_0x04c3
        L_0x04e6:
            r2 = r37
            int r0 = r2.f167342c     // Catch:{ all -> 0x0580 }
            if (r0 < 0) goto L_0x04f9
            int r0 = r3.size()     // Catch:{ all -> 0x0580 }
            int r4 = r2.f167342c     // Catch:{ all -> 0x0580 }
            if (r0 <= r4) goto L_0x04f9
            r5 = 0
            java.util.List r3 = r3.subList(r5, r4)     // Catch:{ all -> 0x0580 }
        L_0x04f9:
            android.content.Context r0 = r1.f167288t     // Catch:{ all -> 0x0580 }
            java.util.List r2 = r2.f167340a     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.a.c.b r4 = r1.f167287q     // Catch:{ all -> 0x0580 }
            com.google.common.base.ax r4 = com.google.common.base.C58833ax.m90833j(r4)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.a.c.b r5 = r1.f167282l     // Catch:{ all -> 0x0580 }
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90833j(r5)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bk r6 = r1.f167290v     // Catch:{ all -> 0x0580 }
            com.google.common.base.ax r6 = r6.mo58336a()     // Catch:{ all -> 0x0580 }
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0580 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0580 }
        L_0x0517:
            boolean r8 = r2.hasNext()     // Catch:{ all -> 0x0580 }
            r9 = 2
            if (r8 == 0) goto L_0x0541
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.at r8 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61883at) r8     // Catch:{ all -> 0x0580 }
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ all -> 0x0580 }
            androidx.core.app.at r11 = r8.f167335b     // Catch:{ all -> 0x0580 }
            r12 = 0
            r10[r12] = r11     // Catch:{ all -> 0x0580 }
            java.lang.CharSequence r11 = r8.f167337d     // Catch:{ all -> 0x0580 }
            r12 = 1
            r10[r12] = r11     // Catch:{ all -> 0x0580 }
            java.lang.Long r8 = r8.f167336c     // Catch:{ all -> 0x0580 }
            r10[r9] = r8     // Catch:{ all -> 0x0580 }
            int r8 = java.util.Arrays.hashCode(r10)     // Catch:{ all -> 0x0580 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0580 }
            r7.mo55395g(r8)     // Catch:{ all -> 0x0580 }
            goto L_0x0517
        L_0x0541:
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ all -> 0x0580 }
            r8 = 0
            r2[r8] = r7     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0580 }
            r7 = 1
            r2[r7] = r0     // Catch:{ all -> 0x0580 }
            int r0 = java.util.Arrays.hashCode(r2)     // Catch:{ all -> 0x0580 }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89848p(r4, r5, r6)     // Catch:{ all -> 0x0580 }
            java.lang.String r0 = com.google.knowledge.cerebra.sense.textclassifier.p4674a.p4677c.C61842c.m94491a(r0, r2)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.as r2 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw.m94546d(r3)     // Catch:{ all -> 0x0580 }
            r3 = r2
            com.google.knowledge.cerebra.sense.textclassifier.tclib.e r3 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61962e) r3     // Catch:{ all -> 0x0580 }
            r3.f167429b = r0     // Catch:{ all -> 0x0580 }
            r3 = r20
            boolean r0 = r3.f167187b     // Catch:{ all -> 0x0580 }
            r2.mo58324b(r0)     // Catch:{ all -> 0x0580 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r0 = r2.mo58323a()     // Catch:{ all -> 0x0580 }
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167277g
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167279i
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            return r0
        L_0x0580:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167277g
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            java.util.concurrent.locks.ReadWriteLock r2 = r1.f167279i
            java.util.concurrent.locks.Lock r2 = r2.readLock()
            r2.unlock()
            throw r0
        L_0x0594:
            r0 = move-exception
            goto L_0x0599
        L_0x0596:
            r0 = move-exception
            goto L_0x0599
        L_0x0598:
            r0 = move-exception
        L_0x0599:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r3 = r1.f167274d
            boolean r3 = r3.mo58410m()
            if (r3 == 0) goto L_0x0677
            java.lang.String r0 = "TextClassifierLibImpl"
            java.lang.String r3 = "Failed to initialize, using the fallback."
            android.util.Log.w(r0, r3)
            android.content.Context r0 = r1.f167288t
            java.lang.Object r3 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61921cd.f167398a
            monitor-enter(r3)
            java.util.WeakHashMap r4 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61921cd.f167399b     // Catch:{ all -> 0x0674 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0674 }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ all -> 0x0674 }
            if (r4 == 0) goto L_0x05be
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0674 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cd r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61921cd) r4     // Catch:{ all -> 0x0674 }
            goto L_0x05bf
        L_0x05be:
            r4 = 0
        L_0x05bf:
            if (r4 != 0) goto L_0x05d0
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cd r4 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cd     // Catch:{ all -> 0x0674 }
            r4.<init>(r0)     // Catch:{ all -> 0x0674 }
            java.util.WeakHashMap r5 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61921cd.f167399b     // Catch:{ all -> 0x0674 }
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0674 }
            r6.<init>(r4)     // Catch:{ all -> 0x0674 }
            r5.put(r0, r6)     // Catch:{ all -> 0x0674 }
        L_0x05d0:
            monitor-exit(r3)     // Catch:{ all -> 0x0674 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cf r0 = r4.f167400c
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            if (r3 == r4) goto L_0x066c
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bu r0 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61911bu) r0
            android.view.textclassifier.TextClassifier r0 = r0.f167383a
            android.view.textclassifier.ConversationActions$Request$Builder r3 = new android.view.textclassifier.ConversationActions$Request$Builder
            java.util.List r4 = r2.f167340a
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.au r5 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61884au.f167339a
            j$.util.stream.Stream r4 = r4.map(r5)
            j$.util.stream.Collector r5 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r4 = r4.collect(r5)
            java.util.List r4 = (java.util.List) r4
            r3.<init>(r4)
            java.util.List r4 = r2.f167343d
            android.view.textclassifier.ConversationActions$Request$Builder r3 = r3.setHints(r4)
            android.os.Bundle r4 = r2.f167344e
            android.view.textclassifier.ConversationActions$Request$Builder r3 = r3.setExtras(r4)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ce r4 = r2.f167341b
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r5 = new android.view.textclassifier.TextClassifier$EntityConfig$Builder
            r5.<init>()
            java.util.List r6 = r4.f167403c
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r5 = r5.setIncludedTypes(r6)
            java.util.List r6 = r4.f167402b
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r5 = r5.setExcludedTypes(r6)
            java.util.List r4 = r4.f167401a
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r4 = r5.setHints(r4)
            r5 = 1
            android.view.textclassifier.TextClassifier$EntityConfig$Builder r4 = r4.includeTypesFromTextClassifier(r5)
            android.view.textclassifier.TextClassifier$EntityConfig r4 = r4.build()
            android.view.textclassifier.ConversationActions$Request$Builder r3 = r3.setTypeConfig(r4)
            int r2 = r2.f167342c
            if (r2 < 0) goto L_0x0636
            r2 = 0
            r3.setMaxSuggestions(r2)
        L_0x0636:
            android.view.textclassifier.ConversationActions$Request r2 = r3.build()
            android.view.textclassifier.ConversationActions r0 = r0.suggestConversationActions(r2)
            if (r0 != 0) goto L_0x0642
            r2 = 0
            return r2
        L_0x0642:
            java.util.List r2 = r0.getConversationActions()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ar r3 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61881ar.f167333a
            j$.util.stream.Stream r2 = r2.map(r3)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r3)
            java.util.List r2 = (java.util.List) r2
            com.google.knowledge.cerebra.sense.textclassifier.tclib.as r2 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61886aw.m94546d(r2)
            java.lang.String r0 = r0.getId()
            r3 = r2
            com.google.knowledge.cerebra.sense.textclassifier.tclib.e r3 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61962e) r3
            r3.f167429b = r0
            com.google.knowledge.cerebra.sense.textclassifier.tclib.aw r0 = r2.mo58323a()
            return r0
        L_0x066c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Must not be on main thread"
            r0.<init>(r2)
            throw r0
        L_0x0674:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0674 }
            throw r0
        L_0x0677:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Failed to initialize."
            r2.<init>(r3, r0)
            goto L_0x0680
        L_0x067f:
            throw r2
        L_0x0680:
            goto L_0x067f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.mo58302c(com.google.knowledge.cerebra.sense.textclassifier.tclib.av):com.google.knowledge.cerebra.sense.textclassifier.tclib.aw");
    }

    /* renamed from: d */
    public final C61955dk mo58303d(C61954dj djVar) {
        if (f167266r) {
            Log.d("TextClassifierLibImpl", "detectLanguage in PID " + Process.myPid());
        }
        djVar.getClass();
        try {
            this.f167272b.get();
            m94509m();
            String obj = djVar.mo58416a().toString();
            C61973p pVar = new C61973p();
            this.f167278h.readLock().lock();
            try {
                LangIdModel langIdModel = this.f167284n;
                if (langIdModel != null) {
                    for (LangIdModel.LanguageResult languageResult : langIdModel.nativeDetectLanguages(langIdModel.f167205a, obj)) {
                        Locale locale = new Locale(languageResult.f167207a);
                        float f = languageResult.f167208b;
                        if (pVar.f167492a == null) {
                            pVar.f167492a = C58485gu.m89837e();
                        }
                        pVar.f167492a.mo55395g(new C61975r(locale, f));
                    }
                }
                return pVar.mo58413a();
            } finally {
                this.f167278h.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (this.f167274d.mo58410m()) {
                Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
                return new C61973p().mo58413a();
            }
            throw new IllegalStateException("Failed to initialize.", e);
        }
    }

    /* renamed from: e */
    public final C58833ax mo58305e() {
        C58833ax axVar;
        this.f167278h.readLock().lock();
        try {
            LangIdModel langIdModel = this.f167284n;
            if (langIdModel == null) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(Float.valueOf(langIdModel.nativeGetLangIdThreshold(langIdModel.f167205a)));
            }
            return axVar;
        } finally {
            this.f167278h.readLock().unlock();
        }
    }

    /* renamed from: f */
    public final C58833ax mo58306f() {
        this.f167278h.readLock().lock();
        try {
            return C58833ax.m90833j(this.f167285o);
        } finally {
            this.f167278h.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r1 = r10.f167292x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r10.f167293y = new java.util.Date();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r10.f167281k != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10.f167281k = new com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return com.google.common.util.concurrent.C60856cj.m92899h(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        r10.f167291w.writeLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r10.f167283m != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        r10.f167283m = new com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        r10.f167291w.writeLock().unlock();
        r1 = r10.f167275e;
        p3186j$.util.Objects.requireNonNull(r1);
        r1 = r10.f167276f;
        p3186j$.util.Objects.requireNonNull(r1);
        r0 = com.google.common.util.concurrent.C60922j.m93044g(com.google.common.util.concurrent.C60856cj.m92897f(r10.f167274d.mo58402e().mo58312b(), r10.f167274d.mo58407j().mo58312b(), r10.f167274d.mo58406i().mo58312b(), r10.f167274d.mo58401d().mo58312b(), r11.mo19399b(new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61940cw(r1)), r11.mo19399b(new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61941cx(r1))), new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61942cy(r10), r11);
        r1 = com.google.common.util.concurrent.C60922j.m93044g(r10.f167274d.mo58404g().mo58312b(), new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61943cz(r10), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0122, code lost:
        return com.google.common.util.concurrent.C60922j.m93044g(com.google.common.util.concurrent.C60856cj.m92897f(r0, r1, com.google.common.util.concurrent.C60922j.m93044g(com.google.common.util.concurrent.C60856cj.m92897f(r10.f167274d.mo58400c().mo58312b(), r10.f167274d.mo58403f().mo58312b()), new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61945da(r10), r11), com.google.common.util.concurrent.C60922j.m93044g(com.google.common.util.concurrent.C60856cj.m92897f(r0, r1), new com.google.knowledge.cerebra.sense.textclassifier.tclib.C61946db(r10), r11)), com.google.knowledge.cerebra.sense.textclassifier.tclib.C61927cj.f167404a, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0123, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0125, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r11 = com.google.common.util.concurrent.C60856cj.m92899h(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x012a, code lost:
        r10.f167291w.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0133, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0134, code lost:
        r10.f167291w.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013d, code lost:
        throw r11;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo58307g(com.google.common.util.concurrent.C60887da r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f167268A
            monitor-enter(r0)
            boolean r1 = r10.f167270C     // Catch:{ all -> 0x0141 }
            if (r1 == 0) goto L_0x000f
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dc r11 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61947dc.f167425a     // Catch:{ all -> 0x0141 }
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            return r11
        L_0x000f:
            boolean r1 = r10.f167269B     // Catch:{ all -> 0x0141 }
            r2 = 1
            if (r1 == 0) goto L_0x0021
            r10.f167270C = r2     // Catch:{ all -> 0x0141 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cv r1 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cv     // Catch:{ all -> 0x0141 }
            r1.<init>(r10)     // Catch:{ all -> 0x0141 }
            com.google.common.util.concurrent.cx r11 = r11.mo19399b(r1)     // Catch:{ all -> 0x0141 }
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            return r11
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            java.lang.Object r1 = r10.f167292x
            monitor-enter(r1)
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x013e }
            r0.<init>()     // Catch:{ all -> 0x013e }
            r10.f167293y = r0     // Catch:{ all -> 0x013e }
            monitor-exit(r1)     // Catch:{ all -> 0x013e }
            com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels r0 = r10.f167281k
            if (r0 != 0) goto L_0x003f
            com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels r0 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels     // Catch:{ UnsatisfiedLinkError -> 0x0039 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0039 }
            r10.f167281k = r0     // Catch:{ UnsatisfiedLinkError -> 0x0039 }
            goto L_0x003f
        L_0x0039:
            r11 = move-exception
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92899h(r11)
            return r11
        L_0x003f:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f167291w
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel r0 = r10.f167283m     // Catch:{ UnsatisfiedLinkError -> 0x0125 }
            if (r0 != 0) goto L_0x0053
            com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel r0 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.DocumentsAnnotatorModel     // Catch:{ UnsatisfiedLinkError -> 0x0125 }
            r0.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x0125 }
            r10.f167283m = r0     // Catch:{ UnsatisfiedLinkError -> 0x0125 }
        L_0x0053:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f167291w
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            r0 = 6
            com.google.common.util.concurrent.cx[] r0 = new com.google.common.util.concurrent.C60870cx[r0]
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r1 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r1.mo58402e()
            com.google.common.util.concurrent.cx r1 = r1.mo58312b()
            r3 = 0
            r0[r3] = r1
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r1 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r1.mo58407j()
            com.google.common.util.concurrent.cx r1 = r1.mo58312b()
            r0[r2] = r1
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r1 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r1.mo58406i()
            com.google.common.util.concurrent.cx r1 = r1.mo58312b()
            r4 = 2
            r0[r4] = r1
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r1 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r1.mo58401d()
            com.google.common.util.concurrent.cx r1 = r1.mo58312b()
            r5 = 3
            r0[r5] = r1
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ao r1 = r10.f167275e
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cw r6 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cw
            r6.<init>(r1)
            com.google.common.util.concurrent.cx r1 = r11.mo19399b(r6)
            r6 = 4
            r0[r6] = r1
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bg r1 = r10.f167276f
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cx r7 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cx
            r7.<init>(r1)
            r1 = 5
            com.google.common.util.concurrent.cx r7 = r11.mo19399b(r7)
            r0[r1] = r7
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92897f(r0)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cy r1 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cy
            r1.<init>(r10)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r11)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r1 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r1 = r1.mo58404g()
            com.google.common.util.concurrent.cx r1 = r1.mo58312b()
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cz r7 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.cz
            r7.<init>(r10)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r7, r11)
            com.google.common.util.concurrent.cx[] r7 = new com.google.common.util.concurrent.C60870cx[r4]
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r8 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r8 = r8.mo58400c()
            com.google.common.util.concurrent.cx r8 = r8.mo58312b()
            r7[r3] = r8
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r8 = r10.f167274d
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r8 = r8.mo58403f()
            com.google.common.util.concurrent.cx r8 = r8.mo58312b()
            r7[r2] = r8
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92897f(r7)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.da r8 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.da
            r8.<init>(r10)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r8, r11)
            com.google.common.util.concurrent.cx[] r8 = new com.google.common.util.concurrent.C60870cx[r4]
            r8[r3] = r0
            r8[r2] = r1
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92897f(r8)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.db r9 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.db
            r9.<init>(r10)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93044g(r8, r9, r11)
            com.google.common.util.concurrent.cx[] r6 = new com.google.common.util.concurrent.C60870cx[r6]
            r6[r3] = r0
            r6[r2] = r1
            r6[r4] = r7
            r6[r5] = r8
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92897f(r6)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.cj r1 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61927cj.f167404a
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r11)
            return r11
        L_0x0123:
            r11 = move-exception
            goto L_0x0134
        L_0x0125:
            r11 = move-exception
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92899h(r11)     // Catch:{ all -> 0x0123 }
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f167291w
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return r11
        L_0x0134:
            java.util.concurrent.locks.ReadWriteLock r0 = r10.f167291w
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r11
        L_0x013e:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x013e }
            throw r11
        L_0x0141:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0141 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl.mo58307g(com.google.common.util.concurrent.da):com.google.common.util.concurrent.cx");
    }

    public long getNativeGuardedNativeModelsPointer() {
        return this.f167281k.mo58283a();
    }

    /* renamed from: i */
    public final void mo58308i() {
        this.f167279i.writeLock().lock();
        try {
            ActionsSuggestionsModel actionsSuggestionsModel = this.f167286p;
            if (actionsSuggestionsModel != null) {
                actionsSuggestionsModel.close();
                this.f167286p = null;
                this.f167287q = null;
            }
        } finally {
            this.f167279i.writeLock().unlock();
        }
    }

    /* renamed from: j */
    public final void mo58309j() {
        this.f167277g.writeLock().lock();
        try {
            AnnotatorModel annotatorModel = this.f167280j;
            if (annotatorModel != null) {
                annotatorModel.close();
                this.f167280j = null;
                this.f167282l = null;
            }
        } finally {
            this.f167277g.writeLock().unlock();
        }
    }

    /* renamed from: k */
    public final byte[] mo58310k(String str) {
        if (f167266r) {
            int myPid = Process.myPid();
            Log.d("TextClassifierLibImpl", "lookUpKgEntityByMid in PID " + myPid);
        }
        str.getClass();
        try {
            this.f167272b.get();
            this.f167277g.readLock().lock();
            try {
                AnnotatorModel annotatorModel = this.f167280j;
                if (annotatorModel != null) {
                    return annotatorModel.nativeLookUpKnowledgeEntity(annotatorModel.f167199a, str);
                }
                this.f167277g.readLock().unlock();
                return null;
            } finally {
                this.f167277g.readLock().unlock();
            }
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            if (this.f167274d.mo58410m()) {
                Log.w("TextClassifierLibImpl", "Failed to initialize, using the fallback.");
                return null;
            }
            throw new IllegalStateException("Failed to initialize.", e);
        }
    }
}
