package com.android.datetimepicker.time;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class RadialPickerLayout extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public int f16276a;

    /* renamed from: b */
    public int f16277b;

    /* renamed from: c */
    public C5106b f16278c;

    /* renamed from: d */
    public C5105a f16279d;

    /* renamed from: e */
    public C5110f f16280e;

    /* renamed from: f */
    public C5110f f16281f;

    /* renamed from: g */
    public C5108d f16282g;

    /* renamed from: h */
    public C5108d f16283h;

    /* renamed from: i */
    public int f16284i = -1;

    /* renamed from: j */
    public boolean f16285j;

    /* renamed from: k */
    public int f16286k;

    /* renamed from: l */
    public AccessibilityManager f16287l;

    /* renamed from: m */
    private final int f16288m;

    /* renamed from: n */
    private View f16289n;

    /* renamed from: o */
    private int[] f16290o;

    /* renamed from: p */
    private boolean f16291p;

    /* renamed from: q */
    private float f16292q;

    /* renamed from: r */
    private float f16293r;

    /* renamed from: s */
    private Handler f16294s = new Handler();

    public RadialPickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
        this.f16288m = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewConfiguration.getTapTimeout();
        int i = 0;
        this.f16285j = false;
        C5106b bVar = new C5106b(context);
        this.f16278c = bVar;
        addView(bVar);
        C5105a aVar = new C5105a(context);
        this.f16279d = aVar;
        addView(aVar);
        C5110f fVar = new C5110f(context);
        this.f16280e = fVar;
        addView(fVar);
        C5110f fVar2 = new C5110f(context);
        this.f16281f = fVar2;
        addView(fVar2);
        C5108d dVar = new C5108d(context);
        this.f16282g = dVar;
        addView(dVar);
        C5108d dVar2 = new C5108d(context);
        this.f16283h = dVar2;
        addView(dVar2);
        this.f16290o = new int[361];
        int i2 = 0;
        int i3 = 8;
        int i4 = 1;
        while (true) {
            int i5 = 4;
            if (i < 361) {
                this.f16290o[i] = i2;
                if (i4 == i3) {
                    i2 += 6;
                    if (i2 == 360) {
                        i5 = 7;
                    } else if (i2 % 30 == 0) {
                        i5 = 14;
                    }
                    i3 = i5;
                    i4 = 1;
                } else {
                    i4++;
                }
                i++;
            } else {
                this.f16276a = -1;
                this.f16291p = true;
                View view = new View(context);
                this.f16289n = view;
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.f16289n.setBackgroundColor(getResources().getColor(R.color.transparent_black));
                this.f16289n.setVisibility(4);
                addView(this.f16289n);
                this.f16287l = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
        }
    }

    /* renamed from: b */
    private static int m13985b(int i, int i2) {
        int i3 = (i / 30) * 30;
        int i4 = i3 + 30;
        if (i2 != 1) {
            if (i2 == -1) {
                return i == i3 ? i3 - 30 : i3;
            }
            if (i - i3 < i4 - i) {
                return i3;
            }
        }
        return i4;
    }

    /* renamed from: a */
    public final int mo10124a() {
        return this.f16277b < 12 ? 0 : 1;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Time time = new Time();
        time.hour = this.f16277b;
        time.minute = 0;
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), time.normalize(true), 1));
        return true;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int min = Math.min(size, size2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, mode), View.MeasureSpec.makeMeasureSpec(min, mode2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r9 <= r0) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            float r8 = r9.getX()
            float r0 = r9.getY()
            int r9 = r9.getAction()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r9 == 0) goto L_0x0096
            java.lang.String r4 = "RadialPickerLayout"
            r5 = 0
            if (r9 == r2) goto L_0x0066
            r6 = 2
            if (r9 == r6) goto L_0x001b
            goto L_0x008c
        L_0x001b:
            boolean r9 = r7.f16291p
            if (r9 != 0) goto L_0x0025
            java.lang.String r8 = "Input was disabled, but received ACTION_MOVE."
            android.util.Log.e(r4, r8)
            return r2
        L_0x0025:
            float r9 = r7.f16293r
            float r0 = r0 - r9
            float r9 = java.lang.Math.abs(r0)
            float r0 = r7.f16292q
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            boolean r0 = r7.f16285j
            if (r0 != 0) goto L_0x0042
            int r0 = r7.f16288m
            float r0 = (float) r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x0042
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x008c
        L_0x0042:
            int r8 = r7.f16284i
            if (r8 == 0) goto L_0x0053
            int r8 = r7.f16286k
            if (r8 != r3) goto L_0x004b
            goto L_0x008c
        L_0x004b:
            r7.f16285j = r2
            android.os.Handler r8 = r7.f16294s
            r8.removeCallbacksAndMessages(r5)
            return r2
        L_0x0053:
            android.os.Handler r8 = r7.f16294s
            r8.removeCallbacksAndMessages(r5)
            int r8 = r7.f16284i
            if (r8 == r3) goto L_0x008c
            com.android.datetimepicker.time.a r8 = r7.f16279d
            r8.f16296b = r3
            r8.invalidate()
            r7.f16284i = r3
            goto L_0x008c
        L_0x0066:
            boolean r8 = r7.f16291p
            if (r8 == 0) goto L_0x0090
            android.os.Handler r8 = r7.f16294s
            r8.removeCallbacksAndMessages(r5)
            int r8 = r7.f16284i
            if (r8 != 0) goto L_0x008d
            com.android.datetimepicker.time.a r8 = r7.f16279d
            r8.f16296b = r3
            r8.invalidate()
            int r8 = r7.f16284i
            if (r8 != r3) goto L_0x008a
            com.android.datetimepicker.time.a r8 = r7.f16279d
            r8.f16295a = r3
            int r8 = r7.mo10124a()
            if (r8 != r3) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            throw r5
        L_0x008a:
            r7.f16284i = r3
        L_0x008c:
            return r1
        L_0x008d:
            r7.f16285j = r1
            return r2
        L_0x0090:
            java.lang.String r8 = "Input was disabled, but received ACTION_UP."
            android.util.Log.d(r4, r8)
            throw r5
        L_0x0096:
            boolean r9 = r7.f16291p
            if (r9 != 0) goto L_0x009b
            return r2
        L_0x009b:
            r7.f16292q = r8
            r7.f16293r = r0
            r7.f16276a = r3
            r7.f16285j = r1
            r7.f16284i = r3
            android.view.accessibility.AccessibilityManager r8 = r7.f16287l
            r8.isTouchExplorationEnabled()
            r7.f16286k = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.datetimepicker.time.RadialPickerLayout.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 1;
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        int i3 = i == 4096 ? 1 : i == 8192 ? -1 : 0;
        if (i3 == 0) {
            return false;
        }
        int b = m13985b((this.f16277b % 12) * 30, i3) / 30;
        if (b <= 12) {
            i2 = b <= 0 ? 12 : b;
        }
        this.f16277b = i2;
        this.f16282g.invalidate();
        throw null;
    }
}
