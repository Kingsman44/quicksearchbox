package com.google.android.apps.gsa.search.shared.actions.util;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.p4152bb.p4153a.C54942a;
import com.google.p4152bb.p4153a.C54969b;
import com.google.p4152bb.p4153a.C54996c;
import com.google.p4152bb.p4153a.C55050e;
import com.google.p4152bb.p4153a.C55077f;
import com.google.p4152bb.p4153a.C55135hd;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55266m;
import com.google.p4152bb.p4153a.C55293n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.o */
/* compiled from: PG */
public final class C87493o {
    /* renamed from: a */
    public static Intent m142019a(C55293n nVar) {
        Intent intent = new Intent();
        intent.setAction(nVar.f145653b);
        if (!nVar.f145654c.isEmpty()) {
            intent.setType(nVar.f145654c);
        }
        if ((nVar.f145652a & 16) != 0) {
            C55136he heVar = nVar.f145657f;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            Uri parse = Uri.parse(heVar.f145133b);
            if (parse != null) {
                intent.setData(parse);
            }
        }
        intent.setFlags(nVar.f145655d);
        for (String addCategory : nVar.f145659h) {
            intent.addCategory(addCategory);
        }
        if (nVar.f145660i.size() > 0) {
            C54942a aVar = (C54942a) C54969b.f144589b.createBuilder();
            aVar.mo54163a(nVar.f145660i);
            intent.putExtras(m142020b((C54969b) aVar.build()));
        }
        C55136he heVar2 = nVar.f145656e;
        if (heVar2 == null) {
            heVar2 = C55136he.f145130j;
        }
        if ((heVar2.f145132a & 1) != 0) {
            C55136he heVar3 = nVar.f145656e;
            if (heVar3 == null) {
                heVar3 = C55136he.f145130j;
            }
            intent.setPackage(heVar3.f145133b);
        }
        if ((nVar.f145652a & 32) != 0) {
            C55136he heVar4 = nVar.f145658g;
            if (heVar4 == null) {
                heVar4 = C55136he.f145130j;
            }
            if (!heVar4.f145133b.isEmpty()) {
                C55136he heVar5 = nVar.f145658g;
                if (heVar5 == null) {
                    heVar5 = C55136he.f145130j;
                }
                intent.setComponent(ComponentName.unflattenFromString(heVar5.f145133b));
            }
        }
        return intent;
    }

    /* renamed from: b */
    public static Bundle m142020b(C54969b bVar) {
        C54969b bVar2;
        if (bVar == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (C55077f fVar : bVar.f144591a) {
            int a = C55050e.m87569a(fVar.f144895c);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 1:
                    String str = fVar.f144894b;
                    C55136he heVar = fVar.f144896d;
                    if (heVar == null) {
                        heVar = C55136he.f145130j;
                    }
                    bundle.putString(str, heVar.f145133b);
                    break;
                case 3:
                    String str2 = fVar.f144894b;
                    C55136he heVar2 = fVar.f144896d;
                    if (heVar2 == null) {
                        heVar2 = C55136he.f145130j;
                    }
                    bundle.putInt(str2, heVar2.f145135d);
                    break;
                case 5:
                    String str3 = fVar.f144894b;
                    C55136he heVar3 = fVar.f144896d;
                    if (heVar3 == null) {
                        heVar3 = C55136he.f145130j;
                    }
                    bundle.putBoolean(str3, heVar3.f145136e);
                    break;
                case 6:
                    String str4 = fVar.f144894b;
                    C55136he heVar4 = fVar.f144896d;
                    if (heVar4 == null) {
                        heVar4 = C55136he.f145130j;
                    }
                    bundle.putStringArray(str4, (String[]) heVar4.f145134c.toArray(new String[0]));
                    break;
                case 7:
                    String str5 = fVar.f144894b;
                    C55136he heVar5 = fVar.f144896d;
                    if (heVar5 == null) {
                        heVar5 = C55136he.f145130j;
                    }
                    bundle.putDouble(str5, heVar5.f145137f);
                    break;
                case 9:
                    String str6 = fVar.f144894b;
                    if ((fVar.f144893a & 8) != 0) {
                        bVar2 = fVar.f144897e;
                        if (bVar2 == null) {
                            bVar2 = C54969b.f144589b;
                        }
                    } else {
                        bVar2 = null;
                    }
                    bundle.putBundle(str6, m142020b(bVar2));
                    break;
                case 10:
                    int size = fVar.f144898f.size();
                    Bundle[] bundleArr = new Bundle[size];
                    for (int i = 0; i < size; i++) {
                        bundleArr[i] = m142020b((C54969b) fVar.f144898f.get(i));
                    }
                    bundle.putParcelableArray(fVar.f144894b, bundleArr);
                    break;
                case 11:
                    String str7 = fVar.f144894b;
                    C55136he heVar6 = fVar.f144896d;
                    if (heVar6 == null) {
                        heVar6 = C55136he.f145130j;
                    }
                    bundle.putByteArray(str7, heVar6.f145140i.mo59174N());
                    break;
                case 12:
                    String str8 = fVar.f144894b;
                    C55293n nVar = fVar.f144899g;
                    if (nVar == null) {
                        nVar = C55293n.f145650k;
                    }
                    bundle.putParcelable(str8, m142019a(nVar));
                    break;
            }
        }
        return bundle;
    }

    /* renamed from: c */
    public static C54969b m142021c(Bundle bundle) {
        C54969b c;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            C54996c cVar = (C54996c) C55077f.f144891h.createBuilder();
            Object obj = bundle.get(str);
            C55135hd hdVar = (C55135hd) C55136he.f145130j.createBuilder();
            if (obj.getClass() == String.class) {
                cVar.copyOnWrite();
                C55077f fVar = (C55077f) cVar.instance;
                fVar.f144895c = 1;
                fVar.f144893a |= 2;
                String str2 = (String) obj;
                hdVar.copyOnWrite();
                C55136he heVar = (C55136he) hdVar.instance;
                str2.getClass();
                heVar.f145132a |= 1;
                heVar.f145133b = str2;
            } else if (obj.getClass() == Boolean.class) {
                cVar.copyOnWrite();
                C55077f fVar2 = (C55077f) cVar.instance;
                fVar2.f144895c = 5;
                fVar2.f144893a |= 2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hdVar.copyOnWrite();
                C55136he heVar2 = (C55136he) hdVar.instance;
                heVar2.f145132a |= 8;
                heVar2.f145136e = booleanValue;
            } else if (obj.getClass() == Double.class) {
                cVar.copyOnWrite();
                C55077f fVar3 = (C55077f) cVar.instance;
                fVar3.f144895c = 7;
                fVar3.f144893a |= 2;
                double doubleValue = ((Double) obj).doubleValue();
                hdVar.copyOnWrite();
                C55136he heVar3 = (C55136he) hdVar.instance;
                heVar3.f145132a |= 16;
                heVar3.f145137f = doubleValue;
            } else if (obj.getClass() == Integer.class) {
                cVar.copyOnWrite();
                C55077f fVar4 = (C55077f) cVar.instance;
                fVar4.f144895c = 3;
                fVar4.f144893a |= 2;
                int intValue = ((Integer) obj).intValue();
                hdVar.copyOnWrite();
                C55136he heVar4 = (C55136he) hdVar.instance;
                heVar4.f145132a |= 4;
                heVar4.f145135d = intValue;
            } else if (obj.getClass() == String[].class) {
                cVar.copyOnWrite();
                C55077f fVar5 = (C55077f) cVar.instance;
                fVar5.f144895c = 6;
                fVar5.f144893a |= 2;
                List asList = Arrays.asList((String[]) obj);
                hdVar.copyOnWrite();
                C55136he heVar5 = (C55136he) hdVar.instance;
                C62971cq cqVar = heVar5.f145134c;
                if (!cqVar.mo58948c()) {
                    heVar5.f145134c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) asList, (List) heVar5.f145134c);
            } else if (obj.getClass() == Bundle.class) {
                C54969b c2 = m142021c((Bundle) obj);
                if (c2 != null) {
                    cVar.copyOnWrite();
                    C55077f fVar6 = (C55077f) cVar.instance;
                    fVar6.f144895c = 9;
                    fVar6.f144893a |= 2;
                    cVar.copyOnWrite();
                    C55077f fVar7 = (C55077f) cVar.instance;
                    fVar7.f144897e = c2;
                    fVar7.f144893a |= 8;
                }
            } else {
                if (obj.getClass() == Parcelable[].class || obj.getClass() == Bundle[].class) {
                    cVar.copyOnWrite();
                    C55077f fVar8 = (C55077f) cVar.instance;
                    fVar8.f144895c = 10;
                    fVar8.f144893a |= 2;
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable.getClass() == Bundle.class && (c = m142021c((Bundle) parcelable)) != null) {
                            cVar.copyOnWrite();
                            C55077f fVar9 = (C55077f) cVar.instance;
                            C62971cq cqVar2 = fVar9.f144898f;
                            if (!cqVar2.mo58948c()) {
                                fVar9.f144898f = C62942bv.mutableCopy(cqVar2);
                            }
                            fVar9.f144898f.add(c);
                        }
                    }
                } else if (obj.getClass() == Intent.class) {
                    cVar.copyOnWrite();
                    C55077f fVar10 = (C55077f) cVar.instance;
                    fVar10.f144895c = 12;
                    fVar10.f144893a |= 2;
                    C55293n d = m142022d((Intent) obj);
                    cVar.copyOnWrite();
                    C55077f fVar11 = (C55077f) cVar.instance;
                    d.getClass();
                    fVar11.f144899g = d;
                    fVar11.f144893a |= 16;
                } else if (obj.getClass() == byte[].class) {
                    cVar.copyOnWrite();
                    C55077f fVar12 = (C55077f) cVar.instance;
                    fVar12.f144895c = 11;
                    fVar12.f144893a |= 2;
                    C63088z A = C63088z.m96139A((byte[]) obj);
                    hdVar.copyOnWrite();
                    C55136he heVar6 = (C55136he) hdVar.instance;
                    heVar6.f145132a |= 64;
                    heVar6.f145140i = A;
                } else {
                    cVar.copyOnWrite();
                    C55077f fVar13 = (C55077f) cVar.instance;
                    fVar13.f144895c = 0;
                    fVar13.f144893a |= 2;
                }
            }
            cVar.copyOnWrite();
            C55077f fVar14 = (C55077f) cVar.instance;
            str.getClass();
            fVar14.f144893a |= 1;
            fVar14.f144894b = str;
            cVar.copyOnWrite();
            C55077f fVar15 = (C55077f) cVar.instance;
            C55136he heVar7 = (C55136he) hdVar.build();
            heVar7.getClass();
            fVar15.f144896d = heVar7;
            fVar15.f144893a |= 4;
            arrayList.add((C55077f) cVar.build());
        }
        C54942a aVar = (C54942a) C54969b.f144589b.createBuilder();
        aVar.mo54163a(arrayList);
        return (C54969b) aVar.build();
    }

    /* renamed from: d */
    public static C55293n m142022d(Intent intent) {
        C55266m mVar = (C55266m) C55293n.f145650k.createBuilder();
        if (intent.getAction() != null) {
            String action = intent.getAction();
            mVar.copyOnWrite();
            C55293n nVar = (C55293n) mVar.instance;
            action.getClass();
            nVar.f145652a |= 1;
            nVar.f145653b = action;
        }
        if (!TextUtils.isEmpty(intent.getType())) {
            String type = intent.getType();
            mVar.copyOnWrite();
            C55293n nVar2 = (C55293n) mVar.instance;
            type.getClass();
            nVar2.f145652a |= 2;
            nVar2.f145654c = type;
        }
        int flags = intent.getFlags();
        mVar.copyOnWrite();
        C55293n nVar3 = (C55293n) mVar.instance;
        nVar3.f145652a |= 4;
        nVar3.f145655d = flags;
        if (intent.getCategories() != null) {
            mVar.mo54228a(intent.getCategories());
        }
        C54969b c = m142021c(intent.getExtras());
        if (c != null) {
            mVar.mo54229b(c.f144591a);
        }
        if (intent.getPackage() != null) {
            C55136he e = m142023e(intent.getPackage());
            mVar.copyOnWrite();
            C55293n nVar4 = (C55293n) mVar.instance;
            e.getClass();
            nVar4.f145656e = e;
            nVar4.f145652a |= 8;
        }
        if (intent.getData() != null) {
            C55136he e2 = m142023e(intent.getData().toString());
            mVar.copyOnWrite();
            C55293n nVar5 = (C55293n) mVar.instance;
            e2.getClass();
            nVar5.f145657f = e2;
            nVar5.f145652a |= 16;
        }
        if (intent.getComponent() != null) {
            C55136he e3 = m142023e(intent.getComponent().flattenToString());
            mVar.copyOnWrite();
            C55293n nVar6 = (C55293n) mVar.instance;
            e3.getClass();
            nVar6.f145658g = e3;
            nVar6.f145652a |= 32;
        }
        return (C55293n) mVar.build();
    }

    /* renamed from: e */
    private static C55136he m142023e(String str) {
        C55135hd hdVar = (C55135hd) C55136he.f145130j.createBuilder();
        hdVar.copyOnWrite();
        C55136he heVar = (C55136he) hdVar.instance;
        str.getClass();
        heVar.f145132a |= 1;
        heVar.f145133b = str;
        return (C55136he) hdVar.build();
    }
}
