package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C2332ag;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.biometric.ba */
/* compiled from: PG */
public final class C0924ba extends C0260w {

    /* renamed from: a */
    final Handler f3023a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    final Runnable f3024b = new C0918av(this);

    /* renamed from: c */
    C0908al f3025c;

    /* renamed from: d */
    public int f3026d;

    /* renamed from: e */
    public int f3027e;

    /* renamed from: f */
    public ImageView f3028f;

    /* renamed from: g */
    TextView f3029g;

    /* renamed from: a */
    private final int m2844a(int i) {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f3025c.mo3544l(true);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0908al a = BiometricPrompt.m2791a(this, getArguments().getBoolean("host_activity", true));
        this.f3025c = a;
        if (a.f3013u == null) {
            a.f3013u = new C2332ag();
        }
        a.f3013u.mo5704e(this, new C0920ax(this));
        C0908al alVar = this.f3025c;
        if (alVar.f3014v == null) {
            alVar.f3014v = new C2332ag();
        }
        alVar.f3014v.mo5704e(this, new C0921ay(this));
        this.f3026d = m2844a(R.attr.colorError);
        this.f3027e = m2844a(16842808);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        CharSequence charSequence;
        C0391l lVar = new C0391l(requireContext());
        lVar.setTitle(this.f3025c.mo3539g());
        View inflate = LayoutInflater.from(lVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence f = this.f3025c.mo3538f();
            if (TextUtils.isEmpty(f)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(f);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.f3025c.mo3547p();
            if (TextUtils.isEmpty((CharSequence) null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f3028f = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.f3029g = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (C0932f.m2852a(this.f3025c.mo3534a())) {
            charSequence = getString(R.string.confirm_device_credential_password);
        } else {
            charSequence = this.f3025c.mo3537e();
        }
        lVar.mo1303h(charSequence, new C0919aw(this));
        lVar.setView(inflate);
        C0392m create = lVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    public final void onPause() {
        super.onPause();
        this.f3023a.removeCallbacksAndMessages((Object) null);
    }

    public final void onResume() {
        super.onResume();
        C0908al alVar = this.f3025c;
        alVar.f3012t = 0;
        alVar.mo3548q();
        this.f3025c.mo3545m(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
