package android.support.p033v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p087b.p088a.C1840a;
import androidx.core.p087b.p088a.C1841b;
import androidx.p060c.C0984n;

/* renamed from: android.support.v7.view.menu.ai */
/* compiled from: PG */
public class C0455ai extends C0465e implements Menu {

    /* renamed from: d */
    private final C1840a f1564d;

    public C0455ai(Context context, C1840a aVar) {
        super(context);
        if (aVar != null) {
            this.f1564d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i) {
        return mo1614a(this.f1564d.add(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f1564d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo1614a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i) {
        return mo1615b(this.f1564d.addSubMenu(i));
    }

    public final void clear() {
        C0984n nVar = this.f1598b;
        if (nVar != null) {
            nVar.clear();
        }
        C0984n nVar2 = this.f1599c;
        if (nVar2 != null) {
            nVar2.clear();
        }
        this.f1564d.clear();
    }

    public final void close() {
        this.f1564d.close();
    }

    public final MenuItem findItem(int i) {
        return mo1614a(this.f1564d.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return mo1614a(this.f1564d.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f1564d.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1564d.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.f1564d.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1564d.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (this.f1598b != null) {
            int i2 = 0;
            while (true) {
                C0984n nVar = this.f1598b;
                if (i2 >= nVar.f3122d) {
                    break;
                }
                if (((C1841b) nVar.mo3702e(i2)).getGroupId() == i) {
                    this.f1598b.mo3704f(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f1564d.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (this.f1598b != null) {
            int i2 = 0;
            while (true) {
                C0984n nVar = this.f1598b;
                if (i2 >= nVar.f3122d) {
                    break;
                } else if (((C1841b) nVar.mo3702e(i2)).getItemId() == i) {
                    this.f1598b.mo3704f(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f1564d.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1564d.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.f1564d.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.f1564d.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.f1564d.setQwertyMode(z);
    }

    public final int size() {
        return this.f1564d.size();
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo1614a(this.f1564d.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo1615b(this.f1564d.addSubMenu(i, i2, i3, i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1614a(this.f1564d.add(i, i2, i3, charSequence));
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo1614a(this.f1564d.add(charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo1615b(this.f1564d.addSubMenu(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return mo1615b(this.f1564d.addSubMenu(charSequence));
    }
}
