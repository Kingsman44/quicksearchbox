package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.p178a.C3801a;
import androidx.p060c.C0985o;
import androidx.p060c.C0986p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69530n;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;
import p5462h.p5483m.C69764m;

/* renamed from: androidx.navigation.ax */
/* compiled from: PG */
public class C3825ax {

    /* renamed from: k */
    public static final /* synthetic */ int f12352k = 0;

    /* renamed from: a */
    private final List f12353a;

    /* renamed from: c */
    public final String f12354c;

    /* renamed from: d */
    public C3834bb f12355d;

    /* renamed from: e */
    public String f12356e;

    /* renamed from: f */
    public CharSequence f12357f;

    /* renamed from: g */
    public final C0985o f12358g;

    /* renamed from: h */
    public Map f12359h;

    /* renamed from: i */
    public int f12360i;

    /* renamed from: j */
    public String f12361j;

    static {
        new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3825ax(C3868ci ciVar) {
        this(C3869cj.m11162b(ciVar.getClass()));
        Map map = C3870ck.f12430a;
    }

    /* renamed from: a */
    public void mo8035a(Context context, AttributeSet attributeSet) {
        Object obj;
        C69664n.m101061g(context, "context");
        C69664n.m101061g(attributeSet, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3801a.f12274e);
        C69664n.m101060f(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f12360i = 0;
            this.f12356e = null;
        } else if (!C69764m.m101229h(string)) {
            String a = C3823av.m11043a(string);
            this.f12360i = a.hashCode();
            this.f12356e = null;
            C3811aj ajVar = new C3811aj();
            ajVar.mo8068b(a);
            mo8088f(ajVar.mo8067a());
        } else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        List list = this.f12353a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C69664n.m101066l(((C3816ao) obj).f12325a, C3823av.m11043a(this.f12361j))) {
                break;
            }
        }
        list.remove(obj);
        this.f12361j = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f12360i = resourceId;
            this.f12356e = null;
            this.f12356e = C3823av.m11044b(context, resourceId);
        }
        this.f12357f = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* renamed from: b */
    public boolean mo8036b() {
        return true;
    }

    /* renamed from: c */
    public final Bundle mo8085c(Bundle bundle) {
        Map map;
        if (bundle == null && ((map = this.f12359h) == null || map.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f12359h.entrySet()) {
            ((C3886g) entry.getValue()).mo8130a((String) entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : this.f12359h.entrySet()) {
                String str = (String) entry2.getKey();
                C3886g gVar = (C3886g) entry2.getValue();
                C69664n.m101061g(str, "name");
                if (gVar.f12470b || !bundle2.containsKey(str) || bundle2.get(str) != null) {
                    try {
                        gVar.f12469a.mo8106d(bundle2, str);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    throw new IllegalArgumentException("Wrong argument type for '" + str + "' in argument bundle. " + gVar.f12469a.mo8104b() + " expected.");
                }
            }
        }
        return bundle2;
    }

    /* renamed from: d */
    public final C3876f mo8086d(int i) {
        C3876f fVar;
        if (this.f12358g.mo3725d() == 0) {
            fVar = null;
        } else {
            fVar = (C3876f) this.f12358g.mo3726e(i);
        }
        if (fVar != null) {
            return fVar;
        }
        C3834bb bbVar = this.f12355d;
        if (bbVar == null) {
            return null;
        }
        return bbVar.mo8086d(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.util.regex.Matcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a9 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C3824aw mo8087e(androidx.navigation.C3821at r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            java.util.List r0 = r6.f12353a
            boolean r0 = r0.isEmpty()
            r8 = 0
            if (r0 == 0) goto L_0x000e
            return r8
        L_0x000e:
            java.util.List r0 = r6.f12353a
            java.util.Iterator r9 = r0.iterator()
            r10 = r8
        L_0x0015:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01ac
            java.lang.Object r0 = r9.next()
            androidx.navigation.ao r0 = (androidx.navigation.C3816ao) r0
            android.net.Uri r1 = r7.f12343a
            if (r1 == 0) goto L_0x014d
            java.util.Map r3 = r6.f12359h
            java.util.Map r3 = p5462h.p5463a.C69505av.m100875q(r3)
            java.lang.String r4 = "arguments"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            h.f r4 = r0.f12331g
            java.lang.Object r4 = r4.mo5768a()
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4
            if (r4 != 0) goto L_0x003c
            r4 = r8
            goto L_0x0044
        L_0x003c:
            java.lang.String r5 = r1.toString()
            java.util.regex.Matcher r4 = r4.matcher(r5)
        L_0x0044:
            if (r4 != 0) goto L_0x0049
        L_0x0046:
            r2 = r8
            goto L_0x014e
        L_0x0049:
            boolean r5 = r4.matches()
            if (r5 != 0) goto L_0x0050
            goto L_0x0046
        L_0x0050:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.List r11 = r0.f12328d
            int r11 = r11.size()
            r12 = 0
        L_0x005c:
            if (r12 >= r11) goto L_0x0084
            int r13 = r12 + 1
            java.util.List r14 = r0.f12328d
            java.lang.Object r12 = r14.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = r4.group(r13)
            java.lang.String r14 = android.net.Uri.decode(r14)
            java.lang.Object r15 = r3.get(r12)
            androidx.navigation.g r15 = (androidx.navigation.C3886g) r15
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)
            boolean r2 = r0.mo8071a(r5, r12, r14, r15)
            if (r2 == 0) goto L_0x0082
            goto L_0x0046
        L_0x0082:
            r12 = r13
            goto L_0x005c
        L_0x0084:
            boolean r2 = r0.f12332h
            if (r2 == 0) goto L_0x011a
            java.util.Map r2 = r0.f12329e
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0092:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x011a
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Map r11 = r0.f12329e
            java.lang.Object r11 = r11.get(r4)
            androidx.navigation.al r11 = (androidx.navigation.C3813al) r11
            java.lang.String r4 = r1.getQueryParameter(r4)
            if (r4 == 0) goto L_0x00c0
            p5462h.p5473f.p5475b.C69664n.m101058d(r11)
            java.lang.String r12 = r11.f12320a
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r12)
            java.util.regex.Matcher r4 = r12.matcher(r4)
            boolean r12 = r4.matches()
            if (r12 != 0) goto L_0x00c1
            goto L_0x0046
        L_0x00c0:
            r4 = r8
        L_0x00c1:
            p5462h.p5473f.p5475b.C69664n.m101058d(r11)
            java.util.List r12 = r11.f12321b
            int r12 = r12.size()
            r13 = 0
        L_0x00cb:
            if (r13 >= r12) goto L_0x0092
            int r14 = r13 + 1
            if (r4 == 0) goto L_0x00da
            java.lang.String r15 = r4.group(r14)
            java.lang.String r15 = android.net.Uri.decode(r15)
            goto L_0x00db
        L_0x00da:
            r15 = r8
        L_0x00db:
            java.util.List r8 = r11.f12321b
            java.lang.Object r8 = r8.get(r13)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r13 = r3.get(r8)
            androidx.navigation.g r13 = (androidx.navigation.C3886g) r13
            if (r15 == 0) goto L_0x010f
            r16 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r17 = r2
            java.lang.String r2 = "{"
            r1.<init>(r2)
            r1.append(r8)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r15, r1)
            if (r1 != 0) goto L_0x0113
            boolean r1 = r0.mo8071a(r5, r8, r15, r13)
            if (r1 == 0) goto L_0x0113
            goto L_0x014d
        L_0x010f:
            r16 = r1
            r17 = r2
        L_0x0113:
            r13 = r14
            r1 = r16
            r2 = r17
            r8 = 0
            goto L_0x00cb
        L_0x011a:
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0122:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x014b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.navigation.g r2 = (androidx.navigation.C3886g) r2
            if (r2 == 0) goto L_0x0122
            boolean r4 = r2.f12470b
            if (r4 != 0) goto L_0x0122
            boolean r2 = r2.f12471c
            if (r2 != 0) goto L_0x0122
            boolean r2 = r5.containsKey(r3)
            if (r2 != 0) goto L_0x0122
            goto L_0x014d
        L_0x014b:
            r2 = r5
            goto L_0x014e
        L_0x014d:
            r2 = 0
        L_0x014e:
            java.lang.String r1 = r7.f12344b
            if (r1 == 0) goto L_0x015d
            java.lang.String r3 = r0.f12326b
            boolean r1 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r3)
            if (r1 == 0) goto L_0x015d
            r1 = 1
            r4 = 1
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            java.lang.String r1 = r7.f12345c
            r3 = -1
            if (r1 == 0) goto L_0x018f
            java.lang.String r5 = r0.f12327c
            if (r5 == 0) goto L_0x018f
            h.f r5 = r0.f12334j
            java.lang.Object r5 = r5.mo5768a()
            java.util.regex.Pattern r5 = (java.util.regex.Pattern) r5
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x017d
            goto L_0x018f
        L_0x017d:
            androidx.navigation.ak r3 = new androidx.navigation.ak
            java.lang.String r5 = r0.f12327c
            r3.<init>(r5)
            androidx.navigation.ak r5 = new androidx.navigation.ak
            r5.<init>(r1)
            int r1 = r3.compareTo(r5)
            r5 = r1
            goto L_0x0190
        L_0x018f:
            r5 = -1
        L_0x0190:
            if (r2 != 0) goto L_0x0196
            if (r4 != 0) goto L_0x0196
            if (r5 < 0) goto L_0x01a9
        L_0x0196:
            androidx.navigation.aw r8 = new androidx.navigation.aw
            boolean r3 = r0.f12335k
            r0 = r8
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L_0x01a8
            int r0 = r8.compareTo(r10)
            if (r0 <= 0) goto L_0x01a9
        L_0x01a8:
            r10 = r8
        L_0x01a9:
            r8 = 0
            goto L_0x0015
        L_0x01ac:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3825ax.mo8087e(androidx.navigation.at):androidx.navigation.aw");
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj != null && (obj instanceof C3825ax)) {
            C3825ax axVar = (C3825ax) obj;
            int size = C69540x.m100844Z(this.f12353a, axVar.f12353a).size();
            int size2 = this.f12353a.size();
            if (this.f12358g.mo3725d() == axVar.f12358g.mo3725d()) {
                Iterator a = C69734n.m101176b(new C0986p(this.f12358g)).mo5191a();
                while (true) {
                    if (!a.hasNext()) {
                        Iterator a2 = C69734n.m101176b(new C0986p(axVar.f12358g)).mo5191a();
                        while (true) {
                            if (!a2.hasNext()) {
                                z = true;
                                break;
                            }
                            if (!this.f12358g.mo3732k((C3876f) a2.next())) {
                                break;
                            }
                        }
                    } else {
                        if (!axVar.f12358g.mo3732k((C3876f) a.next())) {
                            break;
                        }
                    }
                }
            } else {
                z = false;
            }
            if (C69505av.m100875q(this.f12359h).size() == C69505av.m100875q(axVar.f12359h).size()) {
                Iterator a3 = C69505av.m100883x(C69505av.m100875q(this.f12359h)).mo5191a();
                while (true) {
                    if (!a3.hasNext()) {
                        Iterator a4 = C69505av.m100883x(C69505av.m100875q(axVar.f12359h)).mo5191a();
                        while (true) {
                            if (!a4.hasNext()) {
                                z2 = true;
                                break;
                            }
                            Map.Entry entry = (Map.Entry) a4.next();
                            if (C69505av.m100875q(this.f12359h).containsKey(entry.getKey())) {
                                if (!C69664n.m101066l(C69505av.m100875q(this.f12359h).get(entry.getKey()), entry.getValue())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        Map.Entry entry2 = (Map.Entry) a3.next();
                        if (C69505av.m100875q(axVar.f12359h).containsKey(entry2.getKey())) {
                            if (!C69664n.m101066l(C69505av.m100875q(axVar.f12359h).get(entry2.getKey()), entry2.getValue())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (this.f12360i == axVar.f12360i || C69664n.m101066l(this.f12361j, axVar.f12361j) || size != size2 || !z || !z2) {
                    return false;
                }
                return true;
            }
            z2 = false;
            if (this.f12360i == axVar.f12360i && C69664n.m101066l(this.f12361j, axVar.f12361j)) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo8088f(C3816ao aoVar) {
        Map q = C69505av.m100875q(this.f12359h);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : q.entrySet()) {
            C3886g gVar = (C3886g) entry.getValue();
            if (!gVar.f12470b && !gVar.f12471c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object next : keySet) {
            String str = (String) next;
            List list = aoVar.f12328d;
            Collection<C3813al> values = aoVar.f12329e.values();
            ArrayList arrayList2 = new ArrayList();
            for (C3813al alVar : values) {
                C69540x.m100811r(arrayList2, alVar.f12321b);
            }
            if (!C69540x.m100831M(list, arrayList2).contains(str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            this.f12353a.add(aoVar);
            return;
        }
        throw new IllegalArgumentException("Deep link " + aoVar.f12325a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayList);
    }

    /* renamed from: g */
    public final int[] mo8089g(C3825ax axVar) {
        C3834bb bbVar;
        C69530n nVar = new C69530n();
        C3834bb bbVar2 = this;
        while (true) {
            C69664n.m101058d(bbVar2);
            C3834bb bbVar3 = bbVar2.f12355d;
            if (axVar == null) {
                bbVar = null;
            } else {
                bbVar = axVar.f12355d;
            }
            if (bbVar != null) {
                C3834bb bbVar4 = axVar.f12355d;
                C69664n.m101058d(bbVar4);
                if (bbVar4.mo8094h(bbVar2.f12360i, true) == bbVar2) {
                    nVar.mo61318i(bbVar2);
                    break;
                }
            }
            if (bbVar3 == null || bbVar3.f12375b != bbVar2.f12360i) {
                nVar.mo61318i(bbVar2);
            }
            if (C69664n.m101066l(bbVar3, axVar) || bbVar3 == null) {
                break;
            }
            bbVar2 = bbVar3;
        }
        List<C3825ax> V = C69540x.m100840V(nVar);
        ArrayList arrayList = new ArrayList(C69540x.m100804k(V, 10));
        for (C3825ax axVar2 : V) {
            arrayList.add(Integer.valueOf(axVar2.f12360i));
        }
        return C69540x.m100849ae(arrayList);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f12356e;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.f12360i));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.f12361j;
        if (str2 != null && !C69764m.m101229h(str2)) {
            sb.append(" route=");
            sb.append(this.f12361j);
        }
        if (this.f12357f != null) {
            sb.append(" label=");
            sb.append(this.f12357f);
        }
        return sb.toString();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Set<String> keySet;
        int i4;
        int i5;
        int i6;
        int i7 = this.f12360i * 31;
        String str = this.f12361j;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i8 = i7 + i;
        for (C3816ao aoVar : this.f12353a) {
            int i9 = i2 * 31;
            String str2 = aoVar.f12325a;
            if (str2 == null) {
                i4 = 0;
            } else {
                i4 = str2.hashCode();
            }
            int i10 = (i9 + i4) * 31;
            String str3 = aoVar.f12326b;
            if (str3 == null) {
                i5 = 0;
            } else {
                i5 = str3.hashCode();
            }
            int i11 = (i10 + i5) * 31;
            String str4 = aoVar.f12327c;
            if (str4 == null) {
                i6 = 0;
            } else {
                i6 = str4.hashCode();
            }
            i8 = i11 + i6;
        }
        C0986p pVar = new C0986p(this.f12358g);
        while (pVar.hasNext()) {
            C3876f fVar = (C3876f) pVar.next();
            int i12 = ((i2 * 31) + fVar.f12446a) * 31;
            C3840bh bhVar = fVar.f12447b;
            if (bhVar == null) {
                i3 = 0;
            } else {
                i3 = bhVar.hashCode();
            }
            i2 = i12 + i3;
            Bundle bundle = fVar.f12448c;
            if (!(bundle == null || (keySet = bundle.keySet()) == null)) {
                for (String str5 : keySet) {
                    int i13 = i2 * 31;
                    Bundle bundle2 = fVar.f12448c;
                    C69664n.m101058d(bundle2);
                    Object obj = bundle2.get(str5);
                    i2 = i13 + (obj == null ? 0 : obj.hashCode());
                }
            }
        }
        for (String str6 : C69505av.m100875q(this.f12359h).keySet()) {
            int hashCode = ((i2 * 31) + str6.hashCode()) * 31;
            Object obj2 = C69505av.m100875q(this.f12359h).get(str6);
            i2 = hashCode + (obj2 == null ? 0 : obj2.hashCode());
        }
        return i2;
    }

    public C3825ax(String str) {
        C69664n.m101061g(str, "navigatorName");
        this.f12354c = str;
        this.f12353a = new ArrayList();
        this.f12358g = new C0985o(10);
        this.f12359h = new LinkedHashMap();
    }
}
