package com.google.android.apps.gsa.searchplate;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchplate.p6963a.C88896f;
import com.google.android.apps.gsa.searchplate.widget.HintTextView;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.IllegalFormatException;

/* renamed from: com.google.android.apps.gsa.searchplate.f */
/* compiled from: PG */
public final class C88943f extends C88896f {

    /* renamed from: g */
    private static final C59071e f240947g = C59071e.m91332i("com.google.android.apps.gsa.searchplate.f");

    /* renamed from: a */
    public boolean f240948a;

    /* renamed from: b */
    public final HintTextView f240949b;

    /* renamed from: c */
    public int f240950c = -1;

    /* renamed from: d */
    public int f240951d = -1;

    /* renamed from: e */
    public final Runnable f240952e = new C88928d(this);

    /* renamed from: f */
    public final Runnable f240953f = new C88942e(this);

    /* renamed from: h */
    private String f240954h = BuildConfig.FLAVOR;

    public C88943f(HintTextView hintTextView) {
        this.f240949b = hintTextView;
    }

    /* renamed from: i */
    private final void m144565i(String str, String str2) {
        String str3;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    str3 = String.format(str, new Object[]{str2});
                } else {
                    str3 = String.format(str, new Object[0]);
                }
            } catch (IllegalFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f240947g.mo56226d()).mo56382g(e)).mo56372aa(10071)).mo56354G("setClearModeHint: hint formatting failed. hintText=\"%s\",mHotwordPrompt=\"%s\"", str, str2);
                str3 = null;
            }
            if (str3 != null && !str3.equals(this.f240954h)) {
                float measureText = this.f240949b.getPaint().measureText(str3);
                int i = this.f240951d;
                if (measureText <= ((float) i) || (i == -1 && measureText <= ((float) this.f240950c))) {
                    this.f240954h = str3;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo82745d(int i, String str, String str2) {
        boolean z = !TextUtils.isEmpty(str2);
        if (z) {
            m144565i(str2, str);
        }
        if (z) {
            String str3 = this.f240954h;
            this.f240948a = true;
            boolean z2 = !this.f240949b.getText().equals(str3);
            float measureText = this.f240949b.getPaint().measureText(str3);
            int i2 = this.f240950c;
            this.f240949b.setText(str3);
            if (measureText <= ((float) i2)) {
                if (z2) {
                    this.f240949b.setAlpha(0.0f);
                }
                this.f240949b.mo82920b();
                return;
            }
            this.f240949b.setAlpha(0.0f);
            return;
        }
        this.f240948a = false;
        this.f240949b.mo82919a();
    }
}
