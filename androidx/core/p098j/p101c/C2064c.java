package androidx.core.p098j.p101c;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2090e;
import androidx.core.p098j.C2091f;
import androidx.core.p098j.C2092g;

/* renamed from: androidx.core.j.c.c */
/* compiled from: PG */
public final class C2064c extends InputConnectionWrapper {

    /* renamed from: a */
    final /* synthetic */ C2063b f5966a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2064c(InputConnection inputConnection, C2063b bVar) {
        super(inputConnection, false);
        this.f5966a = bVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C2066e eVar;
        Bundle bundle2;
        C2063b bVar = this.f5966a;
        if (inputContentInfo == null) {
            eVar = null;
        } else {
            eVar = new C2066e(new C2065d(inputContentInfo));
        }
        View view = bVar.f5965a;
        if ((i & 1) != 0) {
            try {
                eVar.f5968a.f5967a.requestPermission();
                InputContentInfo inputContentInfo2 = eVar.f5968a.f5967a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        ClipData clipData = new ClipData(eVar.f5968a.f5967a.getDescription(), new ClipData.Item(eVar.f5968a.f5967a.getContentUri()));
        C2091f eVar2 = Build.VERSION.SDK_INT >= 31 ? new C2090e(clipData, 2) : new C2092g(clipData, 2);
        eVar2.mo5261d(eVar.f5968a.f5967a.getLinkUri());
        eVar2.mo5259b(bundle2);
        if (C2043bi.m5592u(view, eVar2.mo5258a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
