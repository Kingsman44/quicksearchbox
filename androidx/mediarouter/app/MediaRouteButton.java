package androidx.mediarouter.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.widget.C0751je;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.drawable.C1929b;
import androidx.mediarouter.p175a.C3685au;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3702bk;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.googlequicksearchbox.R;
import java.util.Iterator;

/* compiled from: PG */
public class MediaRouteButton extends View {

    /* renamed from: a */
    static final SparseArray f12045a = new SparseArray(2);

    /* renamed from: i */
    private static C3765b f12046i;

    /* renamed from: j */
    private static final int[] f12047j = {16842912};

    /* renamed from: k */
    private static final int[] f12048k = {16842911};

    /* renamed from: b */
    public final C3687aw f12049b;

    /* renamed from: c */
    public final C3766c f12050c;

    /* renamed from: d */
    public C3753z f12051d;

    /* renamed from: e */
    public C3760af f12052e;

    /* renamed from: f */
    public boolean f12053f;

    /* renamed from: g */
    boolean f12054g;

    /* renamed from: h */
    C3767d f12055h;

    /* renamed from: l */
    private int f12056l;

    /* renamed from: m */
    private Drawable f12057m;

    /* renamed from: n */
    private int f12058n;

    /* renamed from: o */
    private int f12059o;

    /* renamed from: p */
    private int f12060p;

    /* renamed from: q */
    private ColorStateList f12061q;

    /* renamed from: r */
    private int f12062r;

    /* renamed from: s */
    private int f12063s;

    /* renamed from: t */
    private boolean f12064t;

    public MediaRouteButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    private final void m10886f() {
        if (this.f12058n > 0) {
            C3767d dVar = this.f12055h;
            if (dVar != null) {
                dVar.cancel(false);
            }
            C3767d dVar2 = new C3767d(this, this.f12058n, getContext());
            this.f12055h = dVar2;
            this.f12058n = 0;
            dVar2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    private final void m10887g() {
        int i = this.f12060p;
        setContentDescription(getContext().getString(i != 1 ? i != 2 ? R.string.mr_cast_button_disconnected : R.string.mr_cast_button_connected : R.string.mr_cast_button_connecting));
        C0751je.m2535a(this, (CharSequence) null);
    }

    /* renamed from: h */
    private final boolean m10888h() {
        Context context = getContext();
        Intent putExtra = new Intent().setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName()).putExtra("key_media_session_token", this.f12049b.mo7768a());
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(putExtra, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m10889i() {
        FragmentManager fragmentManager;
        Activity activity;
        Context context = getContext();
        while (true) {
            fragmentManager = null;
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity instanceof C0167am) {
            fragmentManager = ((C0167am) activity).mo545jw();
        }
        if (fragmentManager != null) {
            if (this.f12049b.mo7770d().mo7761h()) {
                if (fragmentManager.f634a.mo671c("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                    Log.w("MediaRouteButton", "showDialog(): Route chooser dialog already showing!");
                    return false;
                }
                C3773j a = this.f12052e.mo7976a();
                C3753z zVar = this.f12051d;
                if (zVar != null) {
                    a.mo7995a();
                    if (!a.f12190c.equals(zVar)) {
                        a.f12190c = zVar;
                        Bundle arguments = a.getArguments();
                        if (arguments == null) {
                            arguments = new Bundle();
                        }
                        arguments.putBundle("selector", zVar.f12043b);
                        a.setArguments(arguments);
                        Dialog dialog = a.f12189b;
                        if (dialog != null) {
                            boolean z = a.f12188a;
                            ((C3772i) dialog).mo7990h(zVar);
                        }
                    }
                    C0154a aVar = new C0154a(fragmentManager);
                    aVar.mo685r(a, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment");
                    aVar.mo505b(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else if (fragmentManager.f634a.mo671c("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") == null) {
                C3759ae aeVar = new C3759ae();
                C3753z zVar2 = this.f12051d;
                if (zVar2 != null) {
                    if (aeVar.f12147b == null) {
                        Bundle arguments2 = aeVar.getArguments();
                        if (arguments2 != null) {
                            aeVar.f12147b = C3753z.m10882a(arguments2.getBundle("selector"));
                        }
                        if (aeVar.f12147b == null) {
                            aeVar.f12147b = C3753z.f12042a;
                        }
                    }
                    if (!aeVar.f12147b.equals(zVar2)) {
                        aeVar.f12147b = zVar2;
                        Bundle arguments3 = aeVar.getArguments();
                        if (arguments3 == null) {
                            arguments3 = new Bundle();
                        }
                        arguments3.putBundle("selector", zVar2.f12043b);
                        aeVar.setArguments(arguments3);
                    }
                    C0154a aVar2 = new C0154a(fragmentManager);
                    aVar2.mo685r(aeVar, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment");
                    aVar2.mo505b(true);
                } else {
                    throw new IllegalArgumentException("selector must not be null");
                }
            } else {
                Log.w("MediaRouteButton", "showDialog(): Route controller dialog already showing!");
                return false;
            }
            return true;
        }
        throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
    }

    /* renamed from: a */
    public final void mo7931a() {
        C3685au d = this.f12049b.mo7770d();
        boolean z = true;
        boolean z2 = !d.mo7761h();
        int i = z2 ? d.f11868h : 0;
        if (this.f12060p != i) {
            this.f12060p = i;
            m10887g();
            refreshDrawableState();
        }
        if (i == 1) {
            m10886f();
        }
        if (this.f12053f) {
            if (!this.f12064t && !z2 && !this.f12049b.mo7778p(this.f12051d, 1)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo7932b() {
        int i = this.f12056l;
        if (i == 0) {
            i = (this.f12064t || f12046i.f12164b) ? 0 : 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.f12057m;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7933c(Drawable drawable) {
        C3767d dVar = this.f12055h;
        if (dVar != null) {
            dVar.cancel(false);
        }
        Drawable drawable2 = this.f12057m;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f12057m);
        }
        if (drawable != null) {
            if (this.f12061q != null) {
                drawable = drawable.mutate();
                C1929b.m5226g(drawable, this.f12061q);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.f12057m = drawable;
        refreshDrawableState();
    }

    /* renamed from: d */
    public final boolean mo7934d() {
        boolean z = false;
        if (!this.f12053f) {
            return false;
        }
        C3702bk f = this.f12049b.mo7771f();
        if (f == null) {
            return m10889i();
        }
        if (f.f11899b && C3687aw.m10686o()) {
            if (Build.VERSION.SDK_INT >= 31) {
                Context context = getContext();
                Intent putExtra = new Intent().setAction("com.android.systemui.action.LAUNCH_MEDIA_OUTPUT_DIALOG").setPackage("com.android.systemui").putExtra("package_name", context.getPackageName()).putExtra("key_media_session_token", this.f12049b.mo7768a());
                Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(putExtra, 0).iterator();
                while (true) {
                    if (it.hasNext()) {
                        ActivityInfo activityInfo = it.next().activityInfo;
                        if (activityInfo != null && activityInfo.applicationInfo != null && (activityInfo.applicationInfo.flags & 129) != 0) {
                            context.sendBroadcast(putExtra);
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    z = m10888h();
                }
            } else if (Build.VERSION.SDK_INT == 30) {
                z = m10888h();
            }
            if (z) {
                return true;
            }
        }
        return m10889i();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f12057m != null) {
            this.f12057m.setState(getDrawableState());
            if (this.f12057m.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.f12057m.getCurrent();
                int i = this.f12060p;
                if (i == 1 || this.f12059o != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.f12059o = this.f12060p;
    }

    /* renamed from: e */
    public final void mo7936e() {
        if (!this.f12064t) {
            this.f12064t = true;
            mo7932b();
            mo7931a();
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12057m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.f12053f = true;
            if (!this.f12051d.mo7927d()) {
                this.f12049b.mo7773h(this.f12051d, this.f12050c, 0);
            }
            mo7931a();
            C3765b bVar = f12046i;
            if (bVar.f12165c.size() == 0) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                if (Build.VERSION.SDK_INT < 33) {
                    bVar.f12163a.registerReceiver(bVar, intentFilter);
                } else {
                    C3754a.m10896a(bVar.f12163a, bVar, intentFilter, 4);
                }
            }
            bVar.f12165c.add(this);
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f12049b == null || this.f12054g) {
            return onCreateDrawableState;
        }
        int i2 = this.f12060p;
        if (i2 == 1) {
            mergeDrawableStates(onCreateDrawableState, f12048k);
        } else if (i2 == 2) {
            mergeDrawableStates(onCreateDrawableState, f12047j);
        }
        return onCreateDrawableState;
    }

    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.f12053f = false;
            if (!this.f12051d.mo7927d()) {
                this.f12049b.mo7774j(this.f12050c);
            }
            C3765b bVar = f12046i;
            bVar.f12165c.remove(this);
            if (bVar.f12165c.size() == 0) {
                bVar.f12163a.unregisterReceiver(bVar);
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12057m != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int intrinsicWidth = this.f12057m.getIntrinsicWidth();
            int intrinsicHeight = this.f12057m.getIntrinsicHeight();
            int i = paddingLeft + ((((width - paddingRight) - paddingLeft) - intrinsicWidth) / 2);
            int i2 = paddingTop + ((((height - paddingBottom) - paddingTop) - intrinsicHeight) / 2);
            this.f12057m.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f12057m.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.f12062r;
        Drawable drawable = this.f12057m;
        int i4 = 0;
        int max = Math.max(i3, drawable != null ? drawable.getIntrinsicWidth() + getPaddingLeft() + getPaddingRight() : 0);
        int i5 = this.f12063s;
        Drawable drawable2 = this.f12057m;
        if (drawable2 != null) {
            i4 = drawable2.getIntrinsicHeight() + getPaddingTop() + getPaddingBottom();
        }
        int max2 = Math.max(i5, i4);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, max);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, max2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        setMeasuredDimension(size, size2);
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        m10886f();
        if (mo7934d() || performClick) {
            return true;
        }
        return false;
    }

    public final void setVisibility(int i) {
        this.f12056l = i;
        mo7932b();
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f12057m;
    }

    public MediaRouteButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.mediaRouteButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MediaRouteButton(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = androidx.mediarouter.app.C3763ai.m10923d(r10)
            r0.<init>(r10, r1)
            r10 = 2130970563(0x7f0407c3, float:1.754984E38)
            int r10 = androidx.mediarouter.app.C3763ai.m10925f(r0, r10)
            if (r10 == 0) goto L_0x0018
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r10)
            r0 = r1
        L_0x0018:
            r9.<init>(r0, r11, r12)
            androidx.mediarouter.a.z r10 = androidx.mediarouter.p175a.C3753z.f12042a
            r9.f12051d = r10
            androidx.mediarouter.app.af r10 = androidx.mediarouter.app.C3760af.f12148a
            r9.f12052e = r10
            r10 = 0
            r9.f12056l = r10
            android.content.Context r7 = r9.getContext()
            int[] r0 = androidx.mediarouter.C3663a.f11791a
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r11, r0, r12, r10)
            int[] r2 = androidx.mediarouter.C3663a.f11791a
            r6 = 0
            r0 = r9
            r1 = r7
            r3 = r11
            r4 = r8
            r5 = r12
            androidx.core.p098j.C2043bi.m5525S(r0, r1, r2, r3, r4, r5, r6)
            boolean r11 = r9.isInEditMode()
            r12 = 3
            if (r11 == 0) goto L_0x0056
            r11 = 0
            r9.f12049b = r11
            r9.f12050c = r11
            int r10 = r8.getResourceId(r12, r10)
            android.support.v7.widget.gm r11 = android.support.p033v7.widget.C0678gm.m2375e()
            android.graphics.drawable.Drawable r10 = r11.mo3100c(r7, r10)
            r9.f12057m = r10
            return
        L_0x0056:
            androidx.mediarouter.a.aw r11 = androidx.mediarouter.p175a.C3687aw.m10683e(r7)
            r9.f12049b = r11
            androidx.mediarouter.app.c r0 = new androidx.mediarouter.app.c
            r0.<init>(r9)
            r9.f12050c = r0
            androidx.mediarouter.a.au r11 = r11.mo7770d()
            boolean r0 = r11.mo7761h()
            if (r0 != 0) goto L_0x0070
            int r11 = r11.f11868h
            goto L_0x0071
        L_0x0070:
            r11 = 0
        L_0x0071:
            r9.f12060p = r11
            r9.f12059o = r11
            androidx.mediarouter.app.b r11 = f12046i
            if (r11 != 0) goto L_0x0084
            androidx.mediarouter.app.b r11 = new androidx.mediarouter.app.b
            android.content.Context r0 = r7.getApplicationContext()
            r11.<init>(r0)
            f12046i = r11
        L_0x0084:
            r11 = 4
            android.content.res.ColorStateList r11 = r8.getColorStateList(r11)
            r9.f12061q = r11
            int r11 = r8.getDimensionPixelSize(r10, r10)
            r9.f12062r = r11
            r11 = 1
            int r0 = r8.getDimensionPixelSize(r11, r10)
            r9.f12063s = r0
            int r12 = r8.getResourceId(r12, r10)
            r0 = 2
            int r0 = r8.getResourceId(r0, r10)
            r9.f12058n = r0
            r8.recycle()
            int r0 = r9.f12058n
            if (r0 == 0) goto L_0x00bd
            android.util.SparseArray r1 = f12045a
            java.lang.Object r0 = r1.get(r0)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto L_0x00bd
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
            r9.f12058n = r10
            r9.mo7933c(r0)
        L_0x00bd:
            android.graphics.drawable.Drawable r0 = r9.f12057m
            if (r0 != 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00e8
            android.util.SparseArray r0 = f12045a
            java.lang.Object r0 = r0.get(r12)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 == 0) goto L_0x00d5
            android.graphics.drawable.Drawable r10 = r0.newDrawable()
            r9.mo7933c(r10)
            goto L_0x00eb
        L_0x00d5:
            androidx.mediarouter.app.d r0 = new androidx.mediarouter.app.d
            android.content.Context r1 = r9.getContext()
            r0.<init>(r9, r12, r1)
            r9.f12055h = r0
            java.util.concurrent.Executor r12 = android.os.AsyncTask.SERIAL_EXECUTOR
            java.lang.Void[] r10 = new java.lang.Void[r10]
            r0.executeOnExecutor(r12, r10)
            goto L_0x00eb
        L_0x00e8:
            r9.m10886f()
        L_0x00eb:
            r9.m10887g()
            r9.setClickable(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
