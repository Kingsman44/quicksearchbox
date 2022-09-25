package com.google.android.libraries.elements.p1714d.p1718d;

import android.graphics.Rect;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.widget.C6497db;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.C21276bs;
import com.google.android.libraries.elements.interfaces.C21278bu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.elements.d.d.ab */
/* compiled from: PG */
final class C20879ab implements C21278bu {

    /* renamed from: a */
    private static final Rect f58552a = new Rect(0, 0, 0, 0);

    /* renamed from: b */
    private final C20878aa f58553b;

    /* renamed from: c */
    private final Rect f58554c = new Rect();

    /* renamed from: d */
    private final Rect f58555d = new Rect();

    /* renamed from: e */
    private final Rect f58556e = new Rect();

    public C20879ab(Map map) {
        this.f58553b = new C20878aa(map);
    }

    /* renamed from: d */
    private final void m39253d(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        Iterator it;
        ArrayList arrayList;
        int i4;
        RecyclerView recyclerView2 = recyclerView;
        C0653fo foVar = recyclerView2.mLayout;
        if (foVar instanceof LinearLayoutManager) {
            Set a = this.f58553b.mo26010a();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) foVar;
            recyclerView2.getGlobalVisibleRect(this.f58554c);
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            char c = 0;
            int i5 = i2;
            if (i5 == -1) {
                C0653fo foVar2 = recyclerView2.mLayout;
                i5 = (foVar2 == null || foVar2.canScrollVertically()) ? 1 : 0;
            }
            Iterator it2 = a.iterator();
            while (it2.hasNext()) {
                C21276bs bsVar = (C21276bs) it2.next();
                if (bsVar.mo26770e()) {
                    int i6 = findFirstVisibleItemPosition;
                    while (i6 <= findLastVisibleItemPosition) {
                        View findViewByPosition = foVar.findViewByPosition(i6);
                        if (findViewByPosition != null) {
                            RecyclerView recyclerView3 = null;
                            if (findViewByPosition instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) findViewByPosition;
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= viewGroup.getChildCount()) {
                                        break;
                                    } else if (viewGroup.getChildAt(i7) instanceof C6497db) {
                                        recyclerView3 = ((C6497db) viewGroup.getChildAt(i7)).f19266p;
                                        break;
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            if (recyclerView3 != null) {
                                m39253d(recyclerView3, 4, i5);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            C58485gu guVar = C21258ba.f59582b;
                            int i8 = ((C58724pq) guVar).f156474d;
                            for (int i9 = 0; i9 < i8; i9++) {
                                Object tag = findViewByPosition.getTag(((Integer) guVar.get(i9)).intValue());
                                if (tag instanceof String) {
                                    arrayList2.add((String) tag);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                findViewByPosition.getGlobalVisibleRect(this.f58555d);
                                Rect rect = this.f58554c;
                                Rect rect2 = this.f58555d;
                                Rect rect3 = this.f58556e;
                                int[] iArr = new int[2];
                                findViewByPosition.getLocationOnScreen(iArr);
                                int i10 = 1;
                                rect3.set(iArr[0], iArr[1], (rect2.right <= rect.left || rect2.right >= rect.right) ? iArr[c] + findViewByPosition.getWidth() : rect2.right, (rect2.bottom <= rect.top || rect2.bottom >= rect.bottom) ? iArr[1] + findViewByPosition.getHeight() : rect2.bottom);
                                int size = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size) {
                                    String str = (String) arrayList2.get(i11);
                                    int i12 = i - 1;
                                    if (i10 != i5) {
                                        i3 = 2;
                                        z = false;
                                    } else {
                                        i3 = 2;
                                        z = true;
                                    }
                                    if (i12 != i3) {
                                        it = it2;
                                        arrayList = arrayList2;
                                        i4 = i6;
                                        bsVar.mo26039d(str, this.f58556e, this.f58555d, this.f58554c, z);
                                    } else {
                                        it = it2;
                                        arrayList = arrayList2;
                                        i4 = i6;
                                        bsVar.mo26038c(str, this.f58556e, this.f58555d, this.f58554c, z);
                                    }
                                    i11++;
                                    i6 = i4;
                                    arrayList2 = arrayList;
                                    i10 = 1;
                                    it2 = it;
                                }
                            }
                        }
                        i6++;
                        it2 = it2;
                        c = 0;
                    }
                    Iterator it3 = it2;
                    bsVar.mo26037b();
                    c = 0;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.libraries.elements.interfaces.bs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Class<?>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.elements.interfaces.C21277bt mo26011a(java.lang.String r8, java.lang.Object r9) {
        /*
            r7 = this;
            com.google.android.libraries.elements.d.d.aa r0 = r7.f58553b
            java.util.Map r1 = r0.f58550b
            if (r1 != 0) goto L_0x000d
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f58550b = r1
        L_0x000d:
            java.util.Set r2 = r0.f58551c
            if (r2 != 0) goto L_0x0019
            androidx.c.i r2 = new androidx.c.i
            r3 = 0
            r2.<init>((int) r3)
            r0.f58551c = r2
        L_0x0019:
            java.lang.Class r3 = r9.getClass()
            java.lang.Object r4 = r1.get(r3)
            com.google.android.libraries.elements.interfaces.bs r4 = (com.google.android.libraries.elements.interfaces.C21276bs) r4
            if (r4 == 0) goto L_0x0026
            goto L_0x004c
        L_0x0026:
            r4 = 0
            r5 = r3
        L_0x0028:
            if (r5 == 0) goto L_0x003d
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r5 == r6) goto L_0x003d
            java.util.Map r4 = r0.f58549a
            java.lang.Object r4 = r4.get(r5)
            g.a.a r4 = (p5460g.p5461a.C69464a) r4
            if (r4 != 0) goto L_0x003d
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x0028
        L_0x003d:
            if (r4 == 0) goto L_0x006c
            java.lang.Object r0 = r4.mo17428b()
            r4 = r0
            com.google.android.libraries.elements.interfaces.bs r4 = (com.google.android.libraries.elements.interfaces.C21276bs) r4
            r1.put(r3, r4)
            r2.add(r4)
        L_0x004c:
            java.util.Set r0 = r4.f59590a
            if (r0 != 0) goto L_0x005b
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r4.f59590a = r0
        L_0x005b:
            com.google.android.libraries.elements.interfaces.bt r8 = r4.mo26036a(r8, r9)
            java.util.Set r9 = r4.f59590a
            if (r9 == 0) goto L_0x0066
            r9.add(r8)
        L_0x0066:
            com.google.android.libraries.elements.interfaces.br r9 = new com.google.android.libraries.elements.interfaces.br
            r9.<init>(r4, r8)
            return r9
        L_0x006c:
            com.google.android.libraries.elements.interfaces.bc r8 = new com.google.android.libraries.elements.interfaces.bc
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "Cannot find Provider<CollectionScrollStrategy> for "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            goto L_0x0081
        L_0x0080:
            throw r8
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1718d.C20879ab.mo26011a(java.lang.String, java.lang.Object):com.google.android.libraries.elements.interfaces.bt");
    }

    /* renamed from: b */
    public final void mo26012b(String str) {
        for (C21276bs bsVar : this.f58553b.mo26010a()) {
            if (bsVar.mo26770e()) {
                bsVar.mo26039d(str, this.f58556e, f58552a, this.f58554c, false);
            }
        }
    }

    /* renamed from: c */
    public final void mo26013c(RecyclerView recyclerView) {
        m39253d(recyclerView, 1, -1);
    }
}
