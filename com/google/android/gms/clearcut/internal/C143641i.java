package com.google.android.gms.clearcut.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.clearcut.C143620aa;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143624ae;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143659l;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.api.internal.C143819h;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.tasks.C146021aq;
import com.google.common.base.C58881cr;
import com.google.common.p4552o.C60321oe;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.clearcut.internal.i */
/* compiled from: PG */
public final class C143641i extends C143847s implements C143659l {

    /* renamed from: a */
    public final C58881cr f389448a;

    static {
        new AtomicBoolean(false);
    }

    public C143641i(Context context, C58881cr crVar) {
        super(context, C143658k.f389476c, C143724i.f389627f, new C143819h());
        this.f389448a = crVar;
    }

    /* renamed from: c */
    public static C143659l m233330c(Context context) {
        return new C143641i(context, C143636d.f389443a);
    }

    /* renamed from: d */
    static LogEventParcelable m233331d(C143657j jVar) {
        int i;
        C143657j jVar2 = jVar;
        try {
            C60321oe oeVar = jVar2.f389463e;
            if (oeVar != null) {
                C58149a aVar = jVar2.f389461c;
                C63088z byteString = oeVar.toByteString();
                aVar.copyOnWrite();
                C58150b bVar = (C58150b) aVar.instance;
                C58150b bVar2 = C58150b.f155459k;
                byteString.getClass();
                bVar.f155461a |= C89885b.HTTP_VALUE;
                bVar.f155468h = byteString;
            }
            if (jVar2.f389460b != null && ((C58150b) jVar2.f389461c.instance).f155466f.mo59031d() == 0) {
                C58149a aVar2 = jVar2.f389461c;
                C63088z zVar = (C63088z) jVar2.f389460b.mo6453a();
                aVar2.copyOnWrite();
                C58150b bVar3 = (C58150b) aVar2.instance;
                zVar.getClass();
                bVar3.f155461a |= 1024;
                bVar3.f155466f = zVar;
            }
            C58150b bVar4 = (C58150b) jVar2.f389461c.build();
            C143658k kVar = jVar2.f389459a;
            String str = kVar.f389483j;
            Context context = kVar.f389482i;
            if (C143658k.f389480g == -1) {
                synchronized (C143658k.class) {
                    if (C143658k.f389480g == -1) {
                        try {
                            C143658k.f389480g = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("ClearcutLogger", "This can't happen.", e);
                        }
                    }
                }
            }
            int i2 = C143658k.f389480g;
            String str2 = jVar2.f389471m;
            String str3 = jVar2.f389470l;
            int i3 = jVar2.f389473o;
            EnumSet enumSet = jVar2.f389459a.f389484k;
            boolean contains = enumSet.contains(C143624ae.ANDROID_ID);
            boolean equals = enumSet.equals(C143624ae.f389412f);
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (enumSet.equals(C143624ae.f389411e)) {
                    i = 0;
                } else {
                    Iterator it = enumSet.iterator();
                    int i5 = -1;
                    while (it.hasNext()) {
                        i5 &= ((C143624ae) it.next()).f389415h ^ -1;
                    }
                    i = i5;
                }
                PlayLoggerContext playLoggerContext = new PlayLoggerContext(str, i2, -1, str3, contains, str2, equals, i4, (Integer) null, false, i);
                byte[] byteArray = bVar4.toByteArray();
                int[] l = C143658k.m233379l(jVar2.f389464f);
                ArrayList arrayList = jVar2.f389465g;
                String[] strArr = arrayList != null ? (String[]) arrayList.toArray(C143658k.f389478e) : null;
                int[] l2 = C143658k.m233379l(jVar2.f389466h);
                ArrayList arrayList2 = jVar2.f389467i;
                ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(C143658k.f389477d) : null;
                boolean z = jVar2.f389468j;
                Set set = jVar2.f389469k;
                LogEventParcelable logEventParcelable = new LogEventParcelable(playLoggerContext, bVar4, byteArray, l, strArr, l2, experimentTokensArr, z, set != null ? (String[]) set.toArray(C143658k.f389478e) : null);
                C143623ad adVar = jVar2.f389472n;
                if (adVar != null) {
                    C58150b bVar5 = logEventParcelable.f389403j;
                    bVar5.getClass();
                    logEventParcelable.f389402i = new LogVerifierResultParcelable(adVar.mo29411a(bVar5.f155466f));
                }
                return logEventParcelable;
            }
            throw null;
        } catch (RuntimeException e2) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final C143854z mo118975a(C143657j jVar) {
        C143640h hVar = new C143640h(this, jVar, this.f389929D);
        super.mo119293x(2, hVar);
        return hVar;
    }

    /* renamed from: b */
    public final boolean mo118976b(long j, TimeUnit timeUnit) {
        try {
            C146021aq.m237853g(super.mo119290u(0, new C143637e()), 1, timeUnit);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException | TimeoutException unused2) {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo118977e(BatchedLogErrorParcelable batchedLogErrorParcelable) {
        if (batchedLogErrorParcelable.f389426a.isEmpty()) {
            C146021aq.m237850d(Status.f389615a);
            return;
        }
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C143635c(batchedLogErrorParcelable);
        dcVar.f389862c = new Feature[]{C143620aa.f389405a};
        dcVar.f389861b = false;
        super.mo119290u(2, dcVar.mo119260a());
    }
}
