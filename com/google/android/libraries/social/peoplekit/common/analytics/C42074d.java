package com.google.android.libraries.social.peoplekit.common.analytics;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.social.p3260a.C41901a;
import com.google.android.libraries.social.p3260a.p3263b.C41903a;
import com.google.android.libraries.social.p3260a.p3264c.C41907d;
import com.google.android.libraries.social.p3260a.p3265d.C41908a;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.common.p4552o.C59750eg;
import com.google.common.p4552o.C59751eh;
import com.google.common.p4552o.p4566l.C60202dm;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.Locale;
import p5602o.p5607c.p5608a.p5609a.C71904c;
import p5602o.p5607c.p5608a.p5609a.C71906e;
import p5602o.p5607c.p5608a.p5609a.C71907f;
import p5602o.p5607c.p5608a.p5609a.C71908g;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71922u;
import p5602o.p5607c.p5608a.p5609a.C71923v;

/* renamed from: com.google.android.libraries.social.peoplekit.common.analytics.d */
/* compiled from: PG */
public final class C42074d implements C41907d {

    /* renamed from: a */
    public final Context f109977a;

    /* renamed from: b */
    public C143658k f109978b;

    /* renamed from: c */
    private final C143623ad f109979c;

    public C42074d(Context context, C143658k kVar) {
        this.f109977a = context;
        this.f109978b = kVar;
        this.f109979c = C24006d.m44596b(context, new C71908g());
    }

    /* renamed from: c */
    private final void m73643c(C71907f fVar) {
        try {
            if (((Boolean) C42131a.f110208f.mo37303b()).booleanValue()) {
                this.f109978b.mo119000e(fVar, this.f109979c).mo118992a();
            } else {
                this.f109978b.mo118999d(fVar).mo118992a();
            }
        } catch (SQLiteException e) {
            if (Log.isLoggable("PKEventHandler", 3)) {
                Log.d("PKEventHandler", "Error logging event to Clearcut: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo44364a(C41901a aVar) {
        Integer num;
        if (aVar instanceof C42078h) {
            C42078h hVar = (C42078h) aVar;
            C41903a aVar2 = hVar.f109992a;
            C59750eg egVar = (C59750eg) C59751eh.f161442f.createBuilder();
            for (C41908a aVar3 : aVar2.f109306b.f109314a) {
                if ((((C59751eh) egVar.instance).f161444a & 1) != 0) {
                    int i = aVar3.f109313a.f109315a;
                    egVar.copyOnWrite();
                    C59751eh ehVar = (C59751eh) egVar.instance;
                    C62961ch chVar = ehVar.f161447d;
                    if (!chVar.mo58948c()) {
                        ehVar.f161447d = C62942bv.mutableCopy(chVar);
                    }
                    ehVar.f161447d.mo58916g(i);
                } else {
                    int i2 = aVar3.f109313a.f109315a;
                    egVar.copyOnWrite();
                    C59751eh ehVar2 = (C59751eh) egVar.instance;
                    ehVar2.f161444a |= 1;
                    ehVar2.f161445b = i2;
                }
                if ((((C59751eh) egVar.instance).f161444a & 2) == 0 && (aVar3 instanceof C41952a) && (num = ((C41952a) aVar3).f109502b) != null) {
                    int intValue = num.intValue();
                    egVar.copyOnWrite();
                    C59751eh ehVar3 = (C59751eh) egVar.instance;
                    ehVar3.f161444a |= 2;
                    ehVar3.f161446c = intValue;
                }
            }
            int i3 = aVar2.f109305a;
            if (i3 != -1) {
                int a = C60202dm.m92544a(i3);
                egVar.copyOnWrite();
                C59751eh ehVar4 = (C59751eh) egVar.instance;
                int i4 = a - 1;
                if (a != 0) {
                    ehVar4.f161448e = i4;
                    ehVar4.f161444a |= 4;
                } else {
                    throw null;
                }
            }
            C71922u uVar = (C71922u) C71923v.f191546d.createBuilder();
            uVar.copyOnWrite();
            C71923v vVar = (C71923v) uVar.instance;
            C59751eh ehVar5 = (C59751eh) egVar.build();
            ehVar5.getClass();
            vVar.f191549b = ehVar5;
            vVar.f191548a |= 1;
            C41908a aVar4 = (C41908a) hVar.f109992a.f109306b.f109314a.get(0);
            if (aVar4 instanceof C41952a) {
                C41952a aVar5 = (C41952a) aVar4;
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    uVar.copyOnWrite();
                    C71923v vVar2 = (C71923v) uVar.instance;
                    throw null;
                }
            }
            boolean z = hVar.f109994c;
            uVar.copyOnWrite();
            C71923v vVar3 = (C71923v) uVar.instance;
            vVar3.f191548a |= 4;
            vVar3.f191550c = z;
            C71906e eVar = (C71906e) C71907f.f191511e.createBuilder();
            eVar.copyOnWrite();
            C71907f fVar = (C71907f) eVar.instance;
            C71923v vVar4 = (C71923v) uVar.build();
            vVar4.getClass();
            fVar.f191514b = vVar4;
            fVar.f191513a |= 1;
            C71904c cVar = hVar.f109993b;
            eVar.copyOnWrite();
            C71907f fVar2 = (C71907f) eVar.instance;
            cVar.getClass();
            fVar2.f191516d = cVar;
            fVar2.f191513a |= 4;
            C71907f fVar3 = (C71907f) eVar.build();
            if (Log.isLoggable("PKEventHandler", 3)) {
                Log.d("PKEventHandler", String.format(Locale.US, "Handled Visual Element Event: %s", new Object[]{fVar3}));
            }
            m73643c(fVar3);
            return true;
        } else if (!(aVar instanceof C42077g)) {
            return false;
        } else {
            C42077g gVar = (C42077g) aVar;
            C71906e eVar2 = (C71906e) C71907f.f191511e.createBuilder();
            C71913l lVar = gVar.f109989a;
            eVar2.copyOnWrite();
            C71907f fVar4 = (C71907f) eVar2.instance;
            lVar.getClass();
            fVar4.f191515c = lVar;
            fVar4.f191513a |= 2;
            C71904c cVar2 = gVar.f109990b;
            eVar2.copyOnWrite();
            C71907f fVar5 = (C71907f) eVar2.instance;
            cVar2.getClass();
            fVar5.f191516d = cVar2;
            fVar5.f191513a |= 4;
            C71907f fVar6 = (C71907f) eVar2.build();
            if (Log.isLoggable("PKEventHandler", 3)) {
                Log.d("PKEventHandler", String.format(Locale.US, "Handled Metric Event: %s", new Object[]{fVar6}));
            }
            m73643c(fVar6);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo44365b() {
    }
}
