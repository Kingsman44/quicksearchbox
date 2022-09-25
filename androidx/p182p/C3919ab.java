package androidx.p182p;

import android.app.ActivityManager;
import android.content.Context;
import androidx.p054b.p055a.p056a.C0883b;
import androidx.p182p.p184b.C3937a;
import androidx.p186q.p187a.C4053h;
import androidx.p186q.p187a.p188a.C4044m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p5462h.p5463a.C69497an;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.ab */
/* compiled from: PG */
public final class C3919ab {

    /* renamed from: a */
    public final List f12532a = new ArrayList();

    /* renamed from: b */
    public C4053h f12533b;

    /* renamed from: c */
    public boolean f12534c;

    /* renamed from: d */
    public C3921ad f12535d = C3921ad.AUTOMATIC;

    /* renamed from: e */
    public boolean f12536e = true;

    /* renamed from: f */
    public boolean f12537f;

    /* renamed from: g */
    public long f12538g = -1;

    /* renamed from: h */
    public TimeUnit f12539h;

    /* renamed from: i */
    private final Context f12540i;

    /* renamed from: j */
    private final Class f12541j;

    /* renamed from: k */
    private final String f12542k;

    /* renamed from: l */
    private final List f12543l = new ArrayList();

    /* renamed from: m */
    private final List f12544m = new ArrayList();

    /* renamed from: n */
    private Executor f12545n;

    /* renamed from: o */
    private Executor f12546o;

    /* renamed from: p */
    private final C3922ae f12547p = new C3922ae();

    /* renamed from: q */
    private final Set f12548q = new LinkedHashSet();

    /* renamed from: r */
    private Set f12549r;

    public C3919ab(Context context, Class cls, String str) {
        C69664n.m101061g(context, "context");
        this.f12540i = context;
        this.f12541j = cls;
        this.f12542k = str;
    }

    /* renamed from: a */
    public final C3925ah mo8155a() {
        C3962o oVar;
        boolean z;
        Executor executor = this.f12545n;
        if (executor == null && this.f12546o == null) {
            Executor executor2 = C0883b.f2956a;
            this.f12546o = executor2;
            this.f12545n = executor2;
        } else if (executor != null && this.f12546o == null) {
            this.f12546o = executor;
        } else if (executor == null) {
            this.f12545n = this.f12546o;
        }
        Set<Number> set = this.f12549r;
        if (set != null) {
            for (Number intValue : set) {
                int intValue2 = intValue.intValue();
                if (!(!this.f12548q.contains(Integer.valueOf(intValue2)))) {
                    throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + intValue2);
                }
            }
        }
        C4053h hVar = this.f12533b;
        if (hVar == null) {
            hVar = new C4044m();
        }
        long j = this.f12538g;
        if (j <= 0) {
            oVar = hVar;
        } else if (this.f12542k != null) {
            TimeUnit timeUnit = this.f12539h;
            if (timeUnit != null) {
                Executor executor3 = this.f12545n;
                if (executor3 != null) {
                    oVar = new C3962o(hVar, new C3938c(j, timeUnit, executor3));
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        Context context = this.f12540i;
        String str = this.f12542k;
        C3922ae aeVar = this.f12547p;
        List list = this.f12543l;
        boolean z2 = this.f12534c;
        C3921ad adVar = this.f12535d;
        C69664n.m101061g(context, "context");
        if (adVar == C3921ad.AUTOMATIC) {
            Object systemService = context.getSystemService("activity");
            C69664n.m101059e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            C69664n.m101061g(activityManager, "activityManager");
            adVar = !activityManager.isLowRamDevice() ? C3921ad.WRITE_AHEAD_LOGGING : C3921ad.TRUNCATE;
        }
        C3921ad adVar2 = adVar;
        Executor executor4 = this.f12545n;
        if (executor4 != null) {
            Executor executor5 = this.f12546o;
            if (executor5 != null) {
                C3963p pVar = new C3963p(context, str, oVar, aeVar, list, z2, adVar2, executor4, executor5, this.f12536e, this.f12537f, this.f12548q, this.f12532a, this.f12544m);
                C3925ah ahVar = (C3925ah) C3918aa.m11220c(this.f12541j);
                ahVar.f12560d = ahVar.mo8177c(pVar);
                Set j2 = ahVar.mo8180j();
                BitSet bitSet = new BitSet();
                Iterator it = j2.iterator();
                while (true) {
                    int i = -1;
                    if (it.hasNext()) {
                        Class cls = (Class) it.next();
                        int size = pVar.f12670n.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                if (cls.isAssignableFrom(pVar.f12670n.get(size).getClass())) {
                                    bitSet.set(size);
                                    i = size;
                                    break;
                                } else if (i2 < 0) {
                                    break;
                                } else {
                                    size = i2;
                                }
                            }
                        }
                        if (i >= 0) {
                            ahVar.f12564h.put(cls, pVar.f12670n.get(i));
                        } else {
                            throw new IllegalArgumentException("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.");
                        }
                    } else {
                        int size2 = pVar.f12670n.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                } else if (i3 < 0) {
                                    break;
                                } else {
                                    size2 = i3;
                                }
                            }
                        }
                        Iterator it2 = ahVar.mo8178h(ahVar.f12564h).iterator();
                        while (true) {
                            z = false;
                            if (!it2.hasNext()) {
                                break;
                            }
                            C3937a aVar = (C3937a) it2.next();
                            C3922ae aeVar2 = pVar.f12660d;
                            int i4 = aVar.f12596a;
                            int i5 = aVar.f12597b;
                            Map map = aeVar2.f12554a;
                            Integer valueOf = Integer.valueOf(i4);
                            if (map.containsKey(valueOf)) {
                                Map map2 = (Map) map.get(valueOf);
                                if (map2 == null) {
                                    map2 = C69497an.f185919a;
                                }
                                if (map2.containsKey(Integer.valueOf(i5))) {
                                }
                            }
                            pVar.f12660d.mo8165a(aVar);
                        }
                        if (((C3931an) ahVar.mo8170N(C3931an.class, ahVar.mo8167K())) == null) {
                            C3961n nVar = (C3961n) ahVar.mo8170N(C3961n.class, ahVar.mo8167K());
                            if (nVar != null) {
                                ahVar.f12565i = nVar.f12652a;
                                C3972y yVar = ahVar.f12561e;
                                C3938c cVar = nVar.f12652a;
                                yVar.f12679b = cVar;
                                cVar.f12599b = new C3967t(yVar);
                            }
                            if (pVar.f12663g == C3921ad.WRITE_AHEAD_LOGGING) {
                                z = true;
                            }
                            ahVar.mo8167K().mo8210c(z);
                            ahVar.f12563g = pVar.f12661e;
                            ahVar.f12558b = pVar.f12664h;
                            ahVar.f12559c = new C3935ar(pVar.f12665i);
                            ahVar.f12562f = pVar.f12662f;
                            Map i6 = ahVar.mo8179i();
                            BitSet bitSet2 = new BitSet();
                            for (Map.Entry entry : i6.entrySet()) {
                                Class cls2 = (Class) entry.getKey();
                                Iterator it3 = ((List) entry.getValue()).iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Class cls3 = (Class) it3.next();
                                        int size3 = pVar.f12669m.size() - 1;
                                        if (size3 >= 0) {
                                            while (true) {
                                                int i7 = size3 - 1;
                                                if (cls3.isAssignableFrom(pVar.f12669m.get(size3).getClass())) {
                                                    bitSet2.set(size3);
                                                    break;
                                                } else if (i7 < 0) {
                                                    break;
                                                } else {
                                                    size3 = i7;
                                                }
                                            }
                                        }
                                        size3 = -1;
                                        if (size3 >= 0) {
                                            ahVar.f12566j.put(cls3, pVar.f12669m.get(size3));
                                        } else {
                                            throw new IllegalArgumentException("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.");
                                        }
                                    }
                                }
                            }
                            int size4 = pVar.f12669m.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i8 = size4 - 1;
                                    if (bitSet2.get(size4)) {
                                        if (i8 < 0) {
                                            break;
                                        }
                                        size4 = i8;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected type converter " + pVar.f12669m.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                }
                            }
                            return ahVar;
                        }
                        throw null;
                    }
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* renamed from: b */
    public final void mo8156b(C3920ac acVar) {
        this.f12543l.add(acVar);
    }

    /* renamed from: c */
    public final void mo8157c(C3937a... aVarArr) {
        C69664n.m101061g(aVarArr, "migrations");
        if (this.f12549r == null) {
            this.f12549r = new HashSet();
        }
        for (C3937a aVar : aVarArr) {
            Set set = this.f12549r;
            C69664n.m101058d(set);
            set.add(Integer.valueOf(aVar.f12596a));
            Set set2 = this.f12549r;
            C69664n.m101058d(set2);
            set2.add(Integer.valueOf(aVar.f12597b));
        }
        this.f12547p.mo8165a((C3937a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }

    /* renamed from: d */
    public final void mo8158d() {
        this.f12536e = false;
        this.f12537f = true;
    }

    /* renamed from: e */
    public final void mo8159e(int... iArr) {
        for (int valueOf : iArr) {
            this.f12548q.add(Integer.valueOf(valueOf));
        }
    }

    /* renamed from: f */
    public final void mo8160f(Executor executor) {
        C69664n.m101061g(executor, "executor");
        this.f12545n = executor;
    }

    /* renamed from: g */
    public final void mo8161g(Executor executor) {
        C69664n.m101061g(executor, "executor");
        this.f12546o = executor;
    }
}
