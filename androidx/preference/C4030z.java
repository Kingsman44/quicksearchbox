package androidx.preference;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

/* renamed from: androidx.preference.z */
/* compiled from: PG */
public abstract class C4030z extends C0260w implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private DialogPreference f12888a;

    /* renamed from: b */
    private CharSequence f12889b;

    /* renamed from: c */
    private CharSequence f12890c;

    /* renamed from: d */
    private CharSequence f12891d;

    /* renamed from: e */
    public int f12892e;

    /* renamed from: f */
    private CharSequence f12893f;

    /* renamed from: g */
    private int f12894g;

    /* renamed from: h */
    private BitmapDrawable f12895h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8452a(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f12893f;
            if (!TextUtils.isEmpty(charSequence)) {
                i = 0;
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo8453b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8454c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo8456e() {
        return false;
    }

    /* renamed from: f */
    public final DialogPreference mo8475f() {
        if (this.f12888a == null) {
            this.f12888a = (DialogPreference) ((C4001b) getTargetFragment()).mo8411gg(requireArguments().getString("key"));
        }
        return this.f12888a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: fp */
    public void mo8465fp(C0391l lVar) {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12892e = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C4001b) {
            C4001b bVar = (C4001b) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) bVar.mo8411gg(string);
                this.f12888a = dialogPreference;
                this.f12889b = dialogPreference.f12693a;
                this.f12890c = dialogPreference.f12696d;
                this.f12891d = dialogPreference.f12697e;
                this.f12893f = dialogPreference.f12694b;
                this.f12894g = dialogPreference.f12698f;
                Drawable drawable = dialogPreference.f12695c;
                if (drawable == null || (drawable instanceof BitmapDrawable)) {
                    this.f12895h = (BitmapDrawable) drawable;
                    return;
                }
                Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                this.f12895h = new BitmapDrawable(getResources(), createBitmap);
                return;
            }
            this.f12889b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f12890c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f12891d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f12893f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f12894g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f12895h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        this.f12892e = -2;
        C0391l lVar = new C0391l(requireContext());
        lVar.setTitle(this.f12889b);
        lVar.f1347a.f1323d = this.f12895h;
        lVar.mo1306k(this.f12890c, this);
        lVar.mo1303h(this.f12891d, this);
        requireContext();
        int i = this.f12894g;
        View view = null;
        if (i != 0) {
            view = getLayoutInflater().inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            mo8452a(view);
            lVar.setView(view);
        } else {
            lVar.f1347a.f1326g = this.f12893f;
        }
        mo8465fp(lVar);
        C0392m create = lVar.create();
        if (mo8456e()) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C4029y.m11543a(window);
            } else {
                mo8454c();
            }
        }
        return create;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo8453b(this.f12892e == -1);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f12889b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f12890c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f12891d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f12893f);
        bundle.putInt("PreferenceDialogFragment.layout", this.f12894g);
        BitmapDrawable bitmapDrawable = this.f12895h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
