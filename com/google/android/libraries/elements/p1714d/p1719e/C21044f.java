package com.google.android.libraries.elements.p1714d.p1719e;

import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0502l;
import android.view.View;
import android.view.ViewParent;
import com.facebook.litho.C6411u;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21271bn;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.p370af.C7492e;
import com.youtube.p5283a.p5284a.C68092n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.libraries.elements.d.e.f */
/* compiled from: PG */
public final class C21044f implements C21271bn {
    /* renamed from: e */
    public static void m39545e(View view) {
        RecyclerView recyclerView;
        C0673gh findContainingViewHolder;
        if (view != null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    recyclerView = null;
                    break;
                } else if (parent instanceof RecyclerView) {
                    recyclerView = (RecyclerView) parent;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            if (recyclerView != null) {
                Object tag = recyclerView.getTag(R.id.elements_item_touch_helper);
                if ((tag instanceof C0502l) && (findContainingViewHolder = recyclerView.findContainingViewHolder(view)) != null) {
                    ((C0502l) tag).mo2468k(findContainingViewHolder);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo26066a() {
        return 444964488;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C68092n nVar = (C68092n) obj;
        if (nVar.mo60239g() == 1) {
            arVar.mo25945s(C21042d.f58959a);
        } else if (nVar.mo60239g() == 2) {
            arVar.mo25941o(C21043e.f58960a);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ C7492e mo26067d(ByteBuffer byteBuffer) {
        C68092n nVar = new C68092n();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        nVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return nVar;
    }
}
