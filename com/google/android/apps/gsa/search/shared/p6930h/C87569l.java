package com.google.android.apps.gsa.search.shared.p6930h;

import android.net.Uri;
import androidx.slice.C4110i;
import androidx.slice.C4113l;
import androidx.slice.Slice;
import androidx.slice.widget.SliceView;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.shared.h.l */
/* compiled from: PG */
final class C87569l implements C4113l {

    /* renamed from: a */
    final /* synthetic */ SliceView f236581a;

    /* renamed from: b */
    final /* synthetic */ C87570m f236582b;

    public C87569l(C87570m mVar, SliceView sliceView) {
        this.f236582b = mVar;
        this.f236581a = sliceView;
    }

    /* renamed from: a */
    public final void mo8625a(Slice slice) {
        C87570m mVar = this.f236582b;
        if (slice != null) {
            if (mVar.f236585c != null) {
                boolean equals = Uri.parse(slice.f13090f).equals(Uri.parse(mVar.f236585c.f13090f));
                C4110i iVar = new C4110i(mVar.f236584b, mVar.f236585c);
                C4110i iVar2 = new C4110i(mVar.f236584b, slice);
                if (iVar2.mo8620i()) {
                    ((C59052c) ((C59052c) C87570m.f236583a.mo56226d()).mo56372aa(9816)).mo56386p("newSlice is error slice.");
                    return;
                } else if (equals) {
                    if (iVar2.mo8612a() != 2) {
                        return;
                    }
                    if (!iVar.mo8620i() && iVar.mo8612a() == 2) {
                        C58833ax f = C87570m.m142333f(iVar2);
                        if (!f.mo56113h()) {
                            ((C59052c) ((C59052c) C87570m.f236583a.mo56224b()).mo56372aa(9811)).mo56386p("newSlice does not have setting value, skip updating.");
                            return;
                        }
                        C58833ax f2 = C87570m.m142333f(iVar);
                        if (f2.mo56113h() && ((String) f.mo56107c()).equals(f2.mo56107c())) {
                            return;
                        }
                    }
                }
            }
            this.f236582b.f236585c = slice;
            if (this.f236581a != null) {
                ((C59052c) ((C59052c) C87570m.f236583a.mo56224b()).mo56372aa(9791)).mo56386p("Update sliceView with new slice data.");
                this.f236581a.mo8671f(slice);
            }
        }
    }
}
