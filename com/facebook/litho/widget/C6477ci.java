package com.facebook.litho.widget;

import com.facebook.litho.C6411u;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.litho.widget.ci */
/* compiled from: PG */
public final class C6477ci implements C6481cm {

    /* renamed from: a */
    private final C6474cf f19234a;

    public C6477ci(C6474cf cfVar) {
        this.f19234a = cfVar;
    }

    /* renamed from: a */
    public final void mo13295a(C6411u uVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C6480cl clVar = (C6480cl) list.get(i);
            List list2 = clVar.f19240d;
            ArrayList arrayList = null;
            if (list2 != null && list2.size() > 1) {
                arrayList = new ArrayList();
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(((C6478cj) list2.get(i2)).f19235a);
                }
            }
            int i3 = clVar.f19237a;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        this.f19234a.mo13552C(clVar.f19238b, clVar.f19239c);
                    } else {
                        this.f19234a.mo13555G(clVar.f19238b, clVar.f19239c);
                    }
                } else if (arrayList != null) {
                    this.f19234a.mo13559K(clVar.f19238b, arrayList);
                } else {
                    this.f19234a.mo13558J(clVar.f19238b, ((C6478cj) clVar.f19240d.get(0)).f19235a);
                }
            } else if (arrayList != null) {
                this.f19234a.mo13568w(clVar.f19238b, arrayList);
            } else {
                this.f19234a.mo13567v(clVar.f19238b, ((C6478cj) clVar.f19240d.get(0)).f19235a);
            }
        }
        this.f19234a.mo13553D(true, new C6476ch());
    }
}
