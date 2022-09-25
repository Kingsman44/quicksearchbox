package com.google.android.libraries.p579ar.sceneviewer.permissions;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.PermissionsDialog */
/* compiled from: PG */
final class PermissionsDialog extends Dialog {

    /* renamed from: a */
    public final TextView f35707a = ((TextView) findViewById(C10746R.C10748id.permissions_screen_title_text_view));

    /* renamed from: b */
    public final TextView f35708b = ((TextView) findViewById(C10746R.C10748id.permissions_screen_subtitle_text_view));

    /* renamed from: c */
    public final TextView f35709c;

    /* renamed from: d */
    public final TextView f35710d;

    /* renamed from: e */
    public final View f35711e;

    /* renamed from: f */
    public final ImageView f35712f;

    /* renamed from: g */
    public final ImageView f35713g;

    /* renamed from: h */
    public final ImageView f35714h;

    public PermissionsDialog(Context context) {
        super(context, C10746R.style.ViewerBottomSheetDialog);
        setContentView(C10746R.layout.permissions_view);
        TextView textView = (TextView) findViewById(C10746R.C10748id.give_permissions_button);
        this.f35709c = textView;
        textView.setOnClickListener(PermissionsDialog$$ExternalSyntheticLambda0.INSTANCE);
        TextView textView2 = (TextView) findViewById(C10746R.C10748id.decline_permissions_button);
        this.f35710d = textView2;
        textView2.setOnClickListener(new PermissionsDialog$$ExternalSyntheticLambda1(this));
        View findViewById = findViewById(C10746R.C10748id.image_container);
        this.f35711e = findViewById;
        findViewById.setClipToOutline(true);
        this.f35712f = (ImageView) findViewById(C10746R.C10748id.image_background);
        this.f35713g = (ImageView) findViewById(C10746R.C10748id.image_foreground);
        this.f35714h = (ImageView) findViewById(C10746R.C10748id.image_content);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
    }

    /* renamed from: com.google.android.libraries.ar.sceneviewer.permissions.PermissionsDialog$Builder */
    /* compiled from: PG */
    public final class Builder {
        private final PermissionsDialog dialog;

        private Builder(Context context, int i, int i2, View.OnClickListener onClickListener) {
            PermissionsDialog permissionsDialog = new PermissionsDialog(context);
            this.dialog = permissionsDialog;
            permissionsDialog.f35707a.setText(i);
            permissionsDialog.f35708b.setText(i2);
            permissionsDialog.f35709c.setOnClickListener(onClickListener);
        }

        public PermissionsDialog build() {
            if (this.dialog.f35714h.getDrawable() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.dialog.f35714h.getDrawable();
                animationDrawable.setEnterFadeDuration(300);
                animationDrawable.setExitFadeDuration(300);
                animationDrawable.start();
            }
            return this.dialog;
        }

        public Builder enableRoundedCorners(boolean z) {
            this.dialog.f35711e.setClipToOutline(z);
            return this;
        }

        public Builder setDeclinePermissionOnClickListener(View.OnClickListener onClickListener) {
            this.dialog.f35710d.setOnClickListener(onClickListener);
            return this;
        }

        public Builder setGivePermissionOnClickListener(View.OnClickListener onClickListener) {
            this.dialog.f35709c.setOnClickListener(onClickListener);
            return this;
        }

        public Builder setImageBackground(int i) {
            this.dialog.f35712f.setImageResource(i);
            return this;
        }

        public Builder setImageContent(int i) {
            this.dialog.f35714h.setImageResource(i);
            return this;
        }

        public Builder setImageForeground(int i) {
            this.dialog.f35713g.setImageResource(i);
            return this;
        }

        public Builder setSubtitle(int i) {
            this.dialog.f35708b.setText(i);
            return this;
        }

        public Builder setTitle(int i) {
            this.dialog.f35707a.setText(i);
            return this;
        }

        public Builder setImageBackground(Bitmap bitmap) {
            this.dialog.f35712f.setImageBitmap(bitmap);
            return this;
        }

        public Builder setImageContent(Bitmap bitmap) {
            this.dialog.f35714h.setImageBitmap(bitmap);
            return this;
        }

        public Builder setImageForeground(Bitmap bitmap) {
            this.dialog.f35713g.setImageBitmap(bitmap);
            return this;
        }
    }
}
