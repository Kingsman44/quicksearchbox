package com.google.android.gms.car;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: com.google.android.gms.car.ce */
/* compiled from: PG */
public interface C143149ce extends IInterface {
    /* renamed from: A */
    void mo118082A(C143150cf cfVar, C143134br brVar);

    /* renamed from: a */
    void mo118083a();

    /* renamed from: b */
    void mo118084b();

    /* renamed from: c */
    void mo118085c();

    /* renamed from: d */
    void mo118086d(IBinder iBinder);

    /* renamed from: e */
    void mo118087e(int i);

    /* renamed from: f */
    void mo118088f(InputFocusChangedEvent inputFocusChangedEvent);

    /* renamed from: g */
    void mo118089g(boolean z);

    /* renamed from: h */
    void mo118090h(boolean z, boolean z2);

    /* renamed from: i */
    void mo118091i(Intent intent);

    /* renamed from: j */
    void mo118092j(int i);

    /* renamed from: k */
    void mo118093k(int i);

    /* renamed from: l */
    void mo118094l(int i);

    /* renamed from: m */
    void mo118095m(int i, int i2, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle);

    /* renamed from: n */
    void mo118096n(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle);

    /* renamed from: o */
    void mo118097o(int i, DrawingSpec drawingSpec, Intent intent, Configuration configuration, Bundle bundle);

    /* renamed from: p */
    void mo118098p(int i);

    /* renamed from: q */
    void mo118099q();

    /* renamed from: r */
    void mo118100r(Rect rect);

    /* renamed from: s */
    void mo118101s(int i, MotionEvent motionEvent);

    /* renamed from: t */
    void mo118102t(CarWindowManagerLayoutParams carWindowManagerLayoutParams);

    /* renamed from: u */
    void mo118103u(DrawingSpec drawingSpec);

    /* renamed from: v */
    void mo118104v();

    /* renamed from: w */
    void mo118105w(KeyEvent keyEvent);

    /* renamed from: x */
    void mo118106x(int i, DrawingSpec drawingSpec, Configuration configuration);

    /* renamed from: y */
    void mo118107y(C143150cf cfVar);

    /* renamed from: z */
    void mo118108z(C143150cf cfVar, KillOptions killOptions);
}
